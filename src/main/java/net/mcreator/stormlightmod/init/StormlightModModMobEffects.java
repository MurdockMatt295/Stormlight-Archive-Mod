
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.stormlightmod.potion.Windrunner1MobEffect;
import net.mcreator.stormlightmod.potion.Willshaper1MobEffect;
import net.mcreator.stormlightmod.potion.Truthwatcher1MobEffect;
import net.mcreator.stormlightmod.potion.Stoneward1MobEffect;
import net.mcreator.stormlightmod.potion.Skybreaker1MobEffect;
import net.mcreator.stormlightmod.potion.Lightweaver1MobEffect;
import net.mcreator.stormlightmod.potion.GravitationMobEffect;
import net.mcreator.stormlightmod.potion.Elsecaller1MobEffect;
import net.mcreator.stormlightmod.potion.Edgedancer1MobEffect;
import net.mcreator.stormlightmod.potion.Dustbringer1MobEffect;
import net.mcreator.stormlightmod.potion.Bondsmith1MobEffect;
import net.mcreator.stormlightmod.StormlightModMod;

public class StormlightModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, StormlightModMod.MODID);
	public static final RegistryObject<MobEffect> WINDRUNNER_1 = REGISTRY.register("windrunner_1", () -> new Windrunner1MobEffect());
	public static final RegistryObject<MobEffect> SKYBREAKER_1 = REGISTRY.register("skybreaker_1", () -> new Skybreaker1MobEffect());
	public static final RegistryObject<MobEffect> GRAVITATION = REGISTRY.register("gravitation", () -> new GravitationMobEffect());
	public static final RegistryObject<MobEffect> LIGHTWEAVER_1 = REGISTRY.register("lightweaver_1", () -> new Lightweaver1MobEffect());
	public static final RegistryObject<MobEffect> DUSTBRINGER_1 = REGISTRY.register("dustbringer_1", () -> new Dustbringer1MobEffect());
	public static final RegistryObject<MobEffect> TRUTHWATCHER_1 = REGISTRY.register("truthwatcher_1", () -> new Truthwatcher1MobEffect());
	public static final RegistryObject<MobEffect> ELSECALLER_1 = REGISTRY.register("elsecaller_1", () -> new Elsecaller1MobEffect());
	public static final RegistryObject<MobEffect> WILLSHAPER_1 = REGISTRY.register("willshaper_1", () -> new Willshaper1MobEffect());
	public static final RegistryObject<MobEffect> STONEWARD_1 = REGISTRY.register("stoneward_1", () -> new Stoneward1MobEffect());
	public static final RegistryObject<MobEffect> BONDSMITH_1 = REGISTRY.register("bondsmith_1", () -> new Bondsmith1MobEffect());
	public static final RegistryObject<MobEffect> EDGEDANCER_1 = REGISTRY.register("edgedancer_1", () -> new Edgedancer1MobEffect());
}
