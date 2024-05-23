
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.stormlightmod.block.ZirconOreBlock;
import net.mcreator.stormlightmod.block.TopazOreBlock;
import net.mcreator.stormlightmod.block.SphereLanternInfusedBlock;
import net.mcreator.stormlightmod.block.SphereLanternBlock;
import net.mcreator.stormlightmod.block.SmokestoneoreBlock;
import net.mcreator.stormlightmod.block.ShatteredPlainRockBlock;
import net.mcreator.stormlightmod.block.ShadesmarObsidianBlock;
import net.mcreator.stormlightmod.block.ShadesbeadsBlock;
import net.mcreator.stormlightmod.block.SapphireOreBlock;
import net.mcreator.stormlightmod.block.RubyGemoreBlock;
import net.mcreator.stormlightmod.block.RockbudBlock;
import net.mcreator.stormlightmod.block.RockBudGroundBlock;
import net.mcreator.stormlightmod.block.RockBudBlockBlock;
import net.mcreator.stormlightmod.block.OathGateKeyBlockBlock;
import net.mcreator.stormlightmod.block.HeliodororeBlock;
import net.mcreator.stormlightmod.block.GarnetOreBlock;
import net.mcreator.stormlightmod.block.AmethystoreBlock;
import net.mcreator.stormlightmod.StormlightModMod;

public class StormlightModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StormlightModMod.MODID);
	public static final RegistryObject<Block> SHATTERED_PLAIN_ROCK = REGISTRY.register("shattered_plain_rock", () -> new ShatteredPlainRockBlock());
	public static final RegistryObject<Block> ROCKBUD = REGISTRY.register("rockbud", () -> new RockbudBlock());
	public static final RegistryObject<Block> ROCK_BUD_GROUND = REGISTRY.register("rock_bud_ground", () -> new RockBudGroundBlock());
	public static final RegistryObject<Block> SHADESBEADS = REGISTRY.register("shadesbeads", () -> new ShadesbeadsBlock());
	public static final RegistryObject<Block> SHADESMAR_OBSIDIAN = REGISTRY.register("shadesmar_obsidian", () -> new ShadesmarObsidianBlock());
	public static final RegistryObject<Block> ROCK_BUD_BLOCK = REGISTRY.register("rock_bud_block", () -> new RockBudBlockBlock());
	public static final RegistryObject<Block> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", () -> new SapphireOreBlock());
	public static final RegistryObject<Block> AMETHYSTORE = REGISTRY.register("amethystore", () -> new AmethystoreBlock());
	public static final RegistryObject<Block> SMOKESTONEORE = REGISTRY.register("smokestoneore", () -> new SmokestoneoreBlock());
	public static final RegistryObject<Block> HELIODORORE = REGISTRY.register("heliodorore", () -> new HeliodororeBlock());
	public static final RegistryObject<Block> RUBY_GEMORE = REGISTRY.register("ruby_gemore", () -> new RubyGemoreBlock());
	public static final RegistryObject<Block> GARNET_ORE = REGISTRY.register("garnet_ore", () -> new GarnetOreBlock());
	public static final RegistryObject<Block> ZIRCON_ORE = REGISTRY.register("zircon_ore", () -> new ZirconOreBlock());
	public static final RegistryObject<Block> TOPAZ_ORE = REGISTRY.register("topaz_ore", () -> new TopazOreBlock());
	public static final RegistryObject<Block> OATH_GATE_KEY_BLOCK = REGISTRY.register("oath_gate_key_block", () -> new OathGateKeyBlockBlock());
	public static final RegistryObject<Block> SPHERE_LANTERN = REGISTRY.register("sphere_lantern", () -> new SphereLanternBlock());
	public static final RegistryObject<Block> SPHERE_LANTERN_INFUSED = REGISTRY.register("sphere_lantern_infused", () -> new SphereLanternInfusedBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
