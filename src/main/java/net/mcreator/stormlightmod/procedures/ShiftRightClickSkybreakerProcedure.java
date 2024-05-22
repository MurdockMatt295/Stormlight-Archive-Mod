package net.mcreator.stormlightmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.stormlightmod.init.StormlightModModParticleTypes;
import net.mcreator.stormlightmod.init.StormlightModModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ShiftRightClickSkybreakerProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(StormlightModModMobEffects.SKYBREAKER_1.get()) && entity.isShiftKeyDown()) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/summon area_effect_cloud ~ ~.75 ~ {Radius:5f,Duration:1200,RadiusOnUse:-0.01f,RadiusPerTick:-0.0002f,ReapplicationDelay:20,Effects:[{Duration:1280,Id:20b,Amplifier:5b},{Duration:40,Id:7b,Amplifier:1b}]}");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/fill ~5 ~5 ~5 ~-5 ~-5 ~-5 minecraft:grass_path replace grass_block");
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (StormlightModModParticleTypes.GLORY_SPREN.get()), x, y, z, 10, 1, 1, 1, (-0.5));
		}
	}
}
