package net.mcreator.stormlightmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.stormlightmod.network.StormlightModModVariables;

public class EdgedancerPotionEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:edgedancerlevel_1"))).isDone()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(
						new MobEffectInstance(MobEffects.MOVEMENT_SPEED, (int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).stormlightConsumedAmnt, 2));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(
						new MobEffectInstance(MobEffects.REGENERATION, (int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).stormlightConsumedAmnt, 2));
		}
	}
}
