package net.mcreator.stormlightmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.stormlightmod.init.StormlightModModItems;
import net.mcreator.stormlightmod.init.StormlightModModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class SphereLanternOutputProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == StormlightModModBlocks.SPHERE_LANTERN_INFUSED.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == StormlightModModItems.INFUSED_SAPPHIRE_BROAM.get()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), StormlightModModBlocks.SPHERE_LANTERN.get().defaultBlockState(), 3);
		}
	}
}
