package net.mcreator.stormlightmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.stormlightmod.network.StormlightModModVariables;

public class InfusedMarkRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:radiant"))).isDone()) {
			{
				double _setval = StormlightModModVariables.WorldVariables.get(world).markStormlightAmount;
				entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stormlightConsumedAmnt = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = StormlightModModVariables.WorldVariables.get(world).markStormlightAmount;
				entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lastInfusionAmnt = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			UseRadientPowersProcedure.execute(entity);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = ((entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).sphereTypeInfused);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = ((entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).sphereTypeDun).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
