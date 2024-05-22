
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.stormlightmod.StormlightModMod;

public class StormlightModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, StormlightModMod.MODID);
	public static final RegistryObject<SoundEvent> TVSTATICSOUND = REGISTRY.register("tvstaticsound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stormlight_mod", "tvstaticsound")));
	public static final RegistryObject<SoundEvent> PORTALMUSIC = REGISTRY.register("portalmusic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stormlight_mod", "portalmusic")));
}
