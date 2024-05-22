package net.mcreator.stormlightmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.stormlightmod.network.StormlightModModVariables;
import net.mcreator.stormlightmod.init.StormlightModModMobEffects;

public class UseRadientPowersProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, (int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, (int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
		if (entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel && _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:windrunner"))).isDone()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.WINDRUNNER_1.get(),
						(int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
		} else if (entity instanceof ServerPlayer _plr5 && _plr5.level() instanceof ServerLevel
				&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:skybreakerlevel_1"))).isDone()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.SKYBREAKER_1.get(),
						(int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
		} else if (entity instanceof ServerPlayer _plr8 && _plr8.level() instanceof ServerLevel
				&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:dustbringerlevel_1"))).isDone()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.DUSTBRINGER_1.get(),
						(int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
		} else if (entity instanceof ServerPlayer _plr11 && _plr11.level() instanceof ServerLevel
				&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:edgedancerlevel_1"))).isDone()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.EDGEDANCER_1.get(),
						(int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 2));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
		} else if (entity instanceof ServerPlayer _plr14 && _plr14.level() instanceof ServerLevel
				&& _plr14.getAdvancements().getOrStartProgress(_plr14.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:truthwatcherlevel_1"))).isDone()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.TRUTHWATCHER_1.get(),
						(int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
		} else if (entity instanceof ServerPlayer _plr16 && _plr16.level() instanceof ServerLevel
				&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:lightweaverlevel_1"))).isDone()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.LIGHTWEAVER_1.get(),
						(int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
		} else if (entity instanceof ServerPlayer _plr18 && _plr18.level() instanceof ServerLevel
				&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:elsecallerlevel_1"))).isDone()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.ELSECALLER_1.get(),
						(int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
		} else if (entity instanceof ServerPlayer _plr21 && _plr21.level() instanceof ServerLevel
				&& _plr21.getAdvancements().getOrStartProgress(_plr21.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:willshaperlevel_1"))).isDone()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.WILLSHAPER_1.get(),
						(int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
		} else if (entity instanceof ServerPlayer _plr24 && _plr24.level() instanceof ServerLevel
				&& _plr24.getAdvancements().getOrStartProgress(_plr24.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:stonewardlevel_1"))).isDone()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.STONEWARD_1.get(),
						(int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
		} else if (entity instanceof ServerPlayer _plr27 && _plr27.level() instanceof ServerLevel
				&& _plr27.getAdvancements().getOrStartProgress(_plr27.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:bond_smithlevel_1"))).isDone()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.BONDSMITH_1.get(),
						(int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).lastInfusionAmnt, 1));
		}
		{
			double _setval = 0;
			entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.lastInfusionAmnt = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
