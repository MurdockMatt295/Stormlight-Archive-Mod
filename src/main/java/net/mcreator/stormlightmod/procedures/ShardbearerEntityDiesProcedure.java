package net.mcreator.stormlightmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.stormlightmod.init.StormlightModModItems;

public class ShardbearerEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextDouble(RandomSource.create(), 1, 5) == 1) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, y, z, x, new ItemStack(StormlightModModItems.SHARDBLADE.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (Mth.nextDouble(RandomSource.create(), 1, 5) == 4) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, y, z, x, new ItemStack(StormlightModModItems.SHARDPLATE_HELMET.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (Mth.nextDouble(RandomSource.create(), 1, 5) == 3) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, y, z, x, new ItemStack(StormlightModModItems.SHARDPLATE_CHESTPLATE.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (Mth.nextDouble(RandomSource.create(), 1, 5) == 2) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, y, z, x, new ItemStack(StormlightModModItems.SHARDPLATE_LEGGINGS.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, y, z, x, new ItemStack(StormlightModModItems.SHARDPLATE_BOOTS.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
