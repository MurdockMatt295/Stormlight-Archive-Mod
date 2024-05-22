package net.mcreator.stormlightmod.procedures;

import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.stormlightmod.world.inventory.NightWatcherGUIMenu;
import net.mcreator.stormlightmod.network.StormlightModModVariables;
import net.mcreator.stormlightmod.init.StormlightModModItems;

import io.netty.buffer.Unpooled;

public class NightWatcherRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!(sourceentity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel
				&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:night_watcher_boon"))).isDone())) {
			if (sourceentity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("NightWatcherGUI");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new NightWatcherGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
		if (sourceentity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel
				&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:night_watcher_bond_boon"))).isDone()) {
			{
				boolean _setval = true;
				entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.radiantTrueFalse = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (!(sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(StormlightModModItems.SPRENBLADE.get())) : false)
					&& (entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).receivedSprenblade == false) {
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(StormlightModModItems.SPRENBLADE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				{
					boolean _setval = true;
					entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.receivedSprenblade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
