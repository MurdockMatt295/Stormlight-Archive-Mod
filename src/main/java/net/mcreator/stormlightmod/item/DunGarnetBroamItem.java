
package net.mcreator.stormlightmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.stormlightmod.procedures.DunGarnetBromeItemInInventoryTickProcedure;

import java.util.List;

public class DunGarnetBroamItem extends Item {
	public DunGarnetBroamItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("The gem glows brightly with the light of a tiny stormA small, glass sphere with a small piece of Garnet set inside of it. It appears to be devoid of light."));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		DunGarnetBromeItemInInventoryTickProcedure.execute(world, entity);
	}
}