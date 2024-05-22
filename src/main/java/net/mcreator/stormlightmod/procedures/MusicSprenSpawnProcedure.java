package net.mcreator.stormlightmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.stormlightmod.init.StormlightModModParticleTypes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MusicSprenSpawnProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.JUKEBOX) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (StormlightModModParticleTypes.MUSICSPREN.get()), x, y, z, 5, 3, 3, 3, 1);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.NOTE_BLOCK) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (StormlightModModParticleTypes.MUSICSPREN.get()), x, y, z, 5, 3, 3, 3, 1);
		}
	}
}
