
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.stormlightmod.StormlightModMod;

public class StormlightModModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, StormlightModMod.MODID);
	public static final RegistryObject<SimpleParticleType> GLORY_SPREN = REGISTRY.register("glory_spren", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> PAIN_SPREN = REGISTRY.register("pain_spren", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> DEATH_SPREN = REGISTRY.register("death_spren", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> MUSICSPREN = REGISTRY.register("musicspren", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> HUNGER_SPREN = REGISTRY.register("hunger_spren", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> RAIN_SPREN = REGISTRY.register("rain_spren", () -> new SimpleParticleType(false));
}
