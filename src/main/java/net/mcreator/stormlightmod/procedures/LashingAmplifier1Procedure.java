package net.mcreator.stormlightmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.stormlightmod.network.StormlightModModVariables;
import net.mcreator.stormlightmod.init.StormlightModModMobEffects;

public class LashingAmplifier1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean LashingAmplifier3 = false;
		double ThirdLashing = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(StormlightModModMobEffects.WINDRUNNER_1.get())) {
			{
				double _setval = 1.25;
				entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lashingAmount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(StormlightModModMobEffects.SKYBREAKER_1.get())) {
			{
				double _setval = 1.25;
				entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lashingAmount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
