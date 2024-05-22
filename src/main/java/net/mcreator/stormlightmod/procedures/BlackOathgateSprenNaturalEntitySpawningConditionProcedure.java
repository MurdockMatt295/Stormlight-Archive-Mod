package net.mcreator.stormlightmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.stormlightmod.init.StormlightModModEntities;
import net.mcreator.stormlightmod.entity.WhiteOathgateSprenEntity;

public class BlackOathgateSprenNaturalEntitySpawningConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(!world.getEntitiesOfClass(WhiteOathgateSprenEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = StormlightModModEntities.WHITE_OATHGATE_SPREN.get().spawn(_level, BlockPos.containing(x + 2, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}
