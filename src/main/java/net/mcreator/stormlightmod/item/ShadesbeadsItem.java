
package net.mcreator.stormlightmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.stormlightmod.init.StormlightModModFluids;

public class ShadesbeadsItem extends BucketItem {
	public ShadesbeadsItem() {
		super(StormlightModModFluids.SHADESBEADS, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
