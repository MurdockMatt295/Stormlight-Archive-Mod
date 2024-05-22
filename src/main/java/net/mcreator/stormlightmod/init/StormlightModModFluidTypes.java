
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.stormlightmod.fluid.types.ShadesbeadsFluidType;
import net.mcreator.stormlightmod.StormlightModMod;

public class StormlightModModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, StormlightModMod.MODID);
	public static final RegistryObject<FluidType> SHADESBEADS_TYPE = REGISTRY.register("shadesbeads", () -> new ShadesbeadsFluidType());
}
