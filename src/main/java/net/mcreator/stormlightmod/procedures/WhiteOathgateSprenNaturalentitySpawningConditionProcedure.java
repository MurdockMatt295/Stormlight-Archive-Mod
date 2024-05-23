package net.mcreator.stormlightmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;

import net.mcreator.stormlightmod.entity.BlackOathgateSprenEntity;

public class WhiteOathgateSprenNaturalentitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(BlackOathgateSprenEntity.class, AABB.ofSize(new Vec3(x, y, z), 128, 128, 128), e -> true).isEmpty()) {
			return true;
		}
		return false;
	}
}
