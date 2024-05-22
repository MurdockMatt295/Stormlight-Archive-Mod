package net.mcreator.stormlightmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.stormlightmod.network.StormlightModModVariables;
import net.mcreator.stormlightmod.StormlightModMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RandomTeleportCursePProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:random_teleport_curse"))).isDone()) {
			for (int index0 = 0; index0 < (int) Double.POSITIVE_INFINITY; index0++) {
				StormlightModMod.queueServerWork(6000, () -> {
					StormlightModModVariables.WorldVariables.get(world).TeleportX = Mth.nextDouble(RandomSource.create(), -1000, 1000);
					StormlightModModVariables.WorldVariables.get(world).syncData(world);
					StormlightModModVariables.WorldVariables.get(world).TeleportY = Mth.nextDouble(RandomSource.create(), -62, 128);
					StormlightModModVariables.WorldVariables.get(world).syncData(world);
					StormlightModModVariables.WorldVariables.get(world).TeleportZ = Mth.nextDouble(RandomSource.create(), -1000, 1000);
					StormlightModModVariables.WorldVariables.get(world).syncData(world);
					if (world.isEmptyBlock(
							BlockPos.containing(StormlightModModVariables.WorldVariables.get(world).TeleportX, StormlightModModVariables.WorldVariables.get(world).TeleportY, StormlightModModVariables.WorldVariables.get(world).TeleportZ))
							&& world.getBlockState(
									BlockPos.containing(StormlightModModVariables.WorldVariables.get(world).TeleportX, StormlightModModVariables.WorldVariables.get(world).TeleportY - 2, StormlightModModVariables.WorldVariables.get(world).TeleportZ))
									.canOcclude()) {
						{
							Entity _ent = entity;
							_ent.teleportTo(StormlightModModVariables.WorldVariables.get(world).TeleportX, StormlightModModVariables.WorldVariables.get(world).TeleportY, StormlightModModVariables.WorldVariables.get(world).TeleportZ);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(StormlightModModVariables.WorldVariables.get(world).TeleportX, StormlightModModVariables.WorldVariables.get(world).TeleportY,
										StormlightModModVariables.WorldVariables.get(world).TeleportZ, _ent.getYRot(), _ent.getXRot());
						}
					}
				});
			}
		}
	}
}
