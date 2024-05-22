package net.mcreator.stormlightmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MidasTouchPProcedure {
	@SubscribeEvent
	public static void onUseItemStart(LivingEntityUseItemEvent.Start event) {
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
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:midas_touch"))).isDone()
				&& !(entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel
						&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:diamond_boon"))).isDone())) {
			if (itemstack.getItem() instanceof SwordItem) {
				if (!(itemstack.getItem() == Items.GOLDEN_SWORD)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = itemstack;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.GOLDEN_SWORD).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			} else if (itemstack.getItem() instanceof ArmorItem) {
				if (!(itemstack.getItem() == Items.GOLDEN_HELMET)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = itemstack;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.GOLDEN_HELMET).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (!(itemstack.getItem() == Items.GOLDEN_CHESTPLATE)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = itemstack;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.GOLDEN_CHESTPLATE).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (!(itemstack.getItem() == Items.GOLDEN_LEGGINGS)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = itemstack;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.GOLDEN_LEGGINGS).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (!(itemstack.getItem() == Items.GOLDEN_BOOTS)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = itemstack;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.GOLDEN_BOOTS).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			} else if (itemstack.getItem() instanceof PickaxeItem) {
				if (!(itemstack.getItem() == Items.GOLDEN_PICKAXE)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = itemstack;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.GOLDEN_PICKAXE).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			} else if (itemstack.getItem() instanceof AxeItem) {
				if (!(itemstack.getItem() == Items.GOLDEN_AXE)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = itemstack;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.GOLDEN_AXE).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			} else if (itemstack.getItem() instanceof ShovelItem) {
				if (!(itemstack.getItem() == Items.GOLDEN_SHOVEL)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = itemstack;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.GOLDEN_SHOVEL).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			} else if (itemstack.getItem() instanceof HoeItem) {
				if (!(itemstack.getItem() == Items.GOLDEN_HOE)) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = itemstack;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.GOLDEN_HOE).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		}
	}
}
