package net.mcreator.stormlightmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.stormlightmod.init.StormlightModModMobEffects;

public class PressREdgedancerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(StormlightModModMobEffects.EDGEDANCER_1.get())) {
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x + 1, y, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x + 2, y, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x - 1, y, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x - 2, y, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x, y + 1, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x, y + 2, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x, y - 1, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x, y - 2, z);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x, y, z + 1);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x, y, z + 2);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x, y, z - 1);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x, y, z - 2);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x + 1, y, z + 1);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x + 2, y, z + 2);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x - 1, y, z - 1);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x - 2, y, z - 2);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
			if (world instanceof Level _level) {
				BlockPos _bp = BlockPos.containing(x - 2, y, z - 2);
				if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
					if (!_level.isClientSide())
						_level.levelEvent(2005, _bp, 0);
				}
			}
		}
	}
}
