package net.mcreator.stormlightmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.stormlightmod.init.StormlightModModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SkybreakerNoWitherProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(StormlightModModMobEffects.WINDRUNNER_1.get()) && entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MobEffects.WITHER)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WITHER);
		}
	}
}
