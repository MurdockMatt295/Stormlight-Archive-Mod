package net.mcreator.stormlightmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.stormlightmod.network.StormlightModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FoodToInvestiturePProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getItem());
		}
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem().isEdible() && entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel
				&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:food_to_investiture"))).isDone() && entity instanceof ServerPlayer _plr3
				&& _plr3.level() instanceof ServerLevel && _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:radiant"))).isDone()) {
			{
				double _setval = (entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) * 1000;
				entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lastInfusionAmnt = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) * 1000;
				entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stormlightConsumedAmnt = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			UseRadientPowersProcedure.execute(entity);
		}
	}
}
