package net.mcreator.stormlightmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.stormlightmod.init.StormlightModModParticleTypes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HungerSprenSpawnProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) <= 6) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (StormlightModModParticleTypes.HUNGER_SPREN.get()), x, y, z, 5, 3, 3, 3, 1);
		} else if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.HUNGER)) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (StormlightModModParticleTypes.HUNGER_SPREN.get()), x, y, z, 5, 3, 3, 3, 1);
		}
	}
}
