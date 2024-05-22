package net.mcreator.stormlightmod.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import java.util.Calendar;

public class NightwatcherNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == ResourceKey.create(Registries.DIMENSION,
				new ResourceLocation("stormlight_mod:urithiru_dimension")) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("jungle"))) {
			if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) == 0) {
				return true;
			}
		}
		return false;
	}
}
