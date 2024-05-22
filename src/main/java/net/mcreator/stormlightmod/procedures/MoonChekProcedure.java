package net.mcreator.stormlightmod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MoonChekProcedure {
	public static double execute(LevelAccessor world) {
		return world.dimensionType().moonPhase(world.dayTime());
	}
}
