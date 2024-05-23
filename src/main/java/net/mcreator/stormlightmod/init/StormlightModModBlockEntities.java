
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.stormlightmod.block.entity.SphereLanternInfusedBlockEntity;
import net.mcreator.stormlightmod.block.entity.SphereLanternBlockEntity;
import net.mcreator.stormlightmod.StormlightModMod;

public class StormlightModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StormlightModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SPHERE_LANTERN = register("sphere_lantern", StormlightModModBlocks.SPHERE_LANTERN, SphereLanternBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPHERE_LANTERN_INFUSED = register("sphere_lantern_infused", StormlightModModBlocks.SPHERE_LANTERN_INFUSED, SphereLanternInfusedBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
