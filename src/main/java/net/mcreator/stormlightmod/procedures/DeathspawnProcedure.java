package net.mcreator.stormlightmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.stormlightmod.init.StormlightModModParticleTypes;

public class DeathspawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (StormlightModModParticleTypes.DEATH_SPREN.get()), x, y, z, 10, 3, 3, 3, 0.1);
			}
		}
	}
}
