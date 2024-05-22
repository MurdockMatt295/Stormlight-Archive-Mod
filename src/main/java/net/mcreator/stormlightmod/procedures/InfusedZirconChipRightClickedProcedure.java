package net.mcreator.stormlightmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.stormlightmod.network.StormlightModModVariables;
import net.mcreator.stormlightmod.init.StormlightModModItems;

public class InfusedZirconChipRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			ItemStack _setval = new ItemStack(StormlightModModItems.INFUSED_ZIRCONCHIP.get());
			entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.sphereTypeInfused = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			ItemStack _setval = new ItemStack(StormlightModModItems.DUN_ZIRCON_CHIP.get());
			entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.sphereTypeDun = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		InfusedChipRightClickedProcedure.execute(world, entity);
	}
}
