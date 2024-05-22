package net.mcreator.stormlightmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.stormlightmod.init.StormlightModModParticleTypes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RainSprenSpawnProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().isRaining()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (StormlightModModParticleTypes.RAIN_SPREN.get()), x, y, z, 5, 3, 3, 3, 1);
		}
	}
}
