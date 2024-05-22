package net.mcreator.stormlightmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.stormlightmod.network.StormlightModModVariables;

public class GravitationPotionStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		LashingProcedure.execute(entity);
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(
					new MobEffectInstance(MobEffects.SLOW_FALLING, (int) (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).stormlightConsumedAmnt, 1));
	}
}
