
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.stormlightmod.fluid.ShadesbeadsFluid;
import net.mcreator.stormlightmod.StormlightModMod;

public class StormlightModModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, StormlightModMod.MODID);
	public static final RegistryObject<FlowingFluid> SHADESBEADS = REGISTRY.register("shadesbeads", () -> new ShadesbeadsFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_SHADESBEADS = REGISTRY.register("flowing_shadesbeads", () -> new ShadesbeadsFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SHADESBEADS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SHADESBEADS.get(), RenderType.translucent());
		}
	}
}
