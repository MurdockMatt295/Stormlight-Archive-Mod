
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.stormlightmod.item.ZirconGemItem;
import net.mcreator.stormlightmod.item.UncookedcurryItem;
import net.mcreator.stormlightmod.item.TopazGemItem;
import net.mcreator.stormlightmod.item.SprenbladeItem;
import net.mcreator.stormlightmod.item.SpearItem;
import net.mcreator.stormlightmod.item.SmokestoneGemItem;
import net.mcreator.stormlightmod.item.SmallZirconGemItem;
import net.mcreator.stormlightmod.item.SmallTopazGemItem;
import net.mcreator.stormlightmod.item.SmallSmokestonerecipeItem;
import net.mcreator.stormlightmod.item.SmallSapphireItem;
import net.mcreator.stormlightmod.item.SmallRubyGemItem;
import net.mcreator.stormlightmod.item.SmallHeliodorGemItem;
import net.mcreator.stormlightmod.item.SmallGarnetGemItem;
import net.mcreator.stormlightmod.item.SmallEmeraldGemItem;
import net.mcreator.stormlightmod.item.SmallDiamondgemItem;
import net.mcreator.stormlightmod.item.SmallAmethystgemItem;
import net.mcreator.stormlightmod.item.ShardplateItem;
import net.mcreator.stormlightmod.item.ShardbladeItem;
import net.mcreator.stormlightmod.item.ShadesbeadsItem;
import net.mcreator.stormlightmod.item.SapphireGemItem;
import net.mcreator.stormlightmod.item.RubyGemItem;
import net.mcreator.stormlightmod.item.MediumZirconGemItem;
import net.mcreator.stormlightmod.item.MediumTopazgemItem;
import net.mcreator.stormlightmod.item.MediumSmokestoneGemItem;
import net.mcreator.stormlightmod.item.MediumSapphireItem;
import net.mcreator.stormlightmod.item.MediumRubyGemItem;
import net.mcreator.stormlightmod.item.MediumHeliodorGemItem;
import net.mcreator.stormlightmod.item.MediumGarnetGemItem;
import net.mcreator.stormlightmod.item.MediumEmeraldGemItem;
import net.mcreator.stormlightmod.item.MediumDiamondGemItem;
import net.mcreator.stormlightmod.item.MediumAmethystgemItem;
import net.mcreator.stormlightmod.item.InfusedZirconchipItem;
import net.mcreator.stormlightmod.item.InfusedZirconMarkItem;
import net.mcreator.stormlightmod.item.InfusedZirconBroamItem;
import net.mcreator.stormlightmod.item.InfusedTopazMarkItem;
import net.mcreator.stormlightmod.item.InfusedTopazChipItem;
import net.mcreator.stormlightmod.item.InfusedTopazBroamItem;
import net.mcreator.stormlightmod.item.InfusedSmokestoneMarkItem;
import net.mcreator.stormlightmod.item.InfusedSmokestoneChipItem;
import net.mcreator.stormlightmod.item.InfusedSmokestoneBroamItem;
import net.mcreator.stormlightmod.item.InfusedSapphireMarkItem;
import net.mcreator.stormlightmod.item.InfusedSapphireChipItem;
import net.mcreator.stormlightmod.item.InfusedSapphireBroamItem;
import net.mcreator.stormlightmod.item.InfusedRubyMarkItem;
import net.mcreator.stormlightmod.item.InfusedRubyChipItem;
import net.mcreator.stormlightmod.item.InfusedRubyBroamItem;
import net.mcreator.stormlightmod.item.InfusedHeliodorMarkItem;
import net.mcreator.stormlightmod.item.InfusedHeliodorChipItem;
import net.mcreator.stormlightmod.item.InfusedHeliodorBroamItem;
import net.mcreator.stormlightmod.item.InfusedGarnetMarkItem;
import net.mcreator.stormlightmod.item.InfusedGarnetChipItem;
import net.mcreator.stormlightmod.item.InfusedGarnetBroamItem;
import net.mcreator.stormlightmod.item.InfusedEmeraldMarkItem;
import net.mcreator.stormlightmod.item.InfusedEmeraldChipItem;
import net.mcreator.stormlightmod.item.InfusedEmeraldBroamItem;
import net.mcreator.stormlightmod.item.InfusedDiamondMarkItem;
import net.mcreator.stormlightmod.item.InfusedDiamondChipItem;
import net.mcreator.stormlightmod.item.InfusedDiamondBroamItem;
import net.mcreator.stormlightmod.item.InfusedAmethystMarkItem;
import net.mcreator.stormlightmod.item.InfusedAmethystChipItem;
import net.mcreator.stormlightmod.item.InfusedAmethystBroamItem;
import net.mcreator.stormlightmod.item.HonorspreggItem;
import net.mcreator.stormlightmod.item.HeliodorGemItem;
import net.mcreator.stormlightmod.item.HavahItem;
import net.mcreator.stormlightmod.item.GarnetGemItem;
import net.mcreator.stormlightmod.item.DunZirconMarkItem;
import net.mcreator.stormlightmod.item.DunZirconChipItem;
import net.mcreator.stormlightmod.item.DunZirconBroamItem;
import net.mcreator.stormlightmod.item.DunTopazMarkItem;
import net.mcreator.stormlightmod.item.DunTopazChipItem;
import net.mcreator.stormlightmod.item.DunTopazBroamItem;
import net.mcreator.stormlightmod.item.DunSmokestoneMarkItem;
import net.mcreator.stormlightmod.item.DunSmokestoneChipItem;
import net.mcreator.stormlightmod.item.DunSmokestoneBroamItem;
import net.mcreator.stormlightmod.item.DunSapphireMarkItem;
import net.mcreator.stormlightmod.item.DunSapphireChipItem;
import net.mcreator.stormlightmod.item.DunSapphireBroamItem;
import net.mcreator.stormlightmod.item.DunRubyMarkItem;
import net.mcreator.stormlightmod.item.DunRubyChipItem;
import net.mcreator.stormlightmod.item.DunRubyBroamItem;
import net.mcreator.stormlightmod.item.DunHeliodorMarkItem;
import net.mcreator.stormlightmod.item.DunHeliodorChipItem;
import net.mcreator.stormlightmod.item.DunHeliodorBroamItem;
import net.mcreator.stormlightmod.item.DunGartnetchipItem;
import net.mcreator.stormlightmod.item.DunGarnetMarkItem;
import net.mcreator.stormlightmod.item.DunGarnetBroamItem;
import net.mcreator.stormlightmod.item.DunEmeraldMarkItem;
import net.mcreator.stormlightmod.item.DunEmeraldChipItem;
import net.mcreator.stormlightmod.item.DunEmeraldBroamItem;
import net.mcreator.stormlightmod.item.DunDiamondMarkItem;
import net.mcreator.stormlightmod.item.DunDiamondChipItem;
import net.mcreator.stormlightmod.item.DunDiamondBroamItem;
import net.mcreator.stormlightmod.item.DunAmethystMarkItem;
import net.mcreator.stormlightmod.item.DunAmethystChipItem;
import net.mcreator.stormlightmod.item.DunAmethystBroamItem;
import net.mcreator.stormlightmod.item.CurryItem;
import net.mcreator.stormlightmod.item.BlackOathgateSpearItem;
import net.mcreator.stormlightmod.item.AmethystgemItem;
import net.mcreator.stormlightmod.StormlightModMod;

public class StormlightModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StormlightModMod.MODID);
	public static final RegistryObject<Item> INFUSED_DIAMOND_CHIP = REGISTRY.register("infused_diamond_chip", () -> new InfusedDiamondChipItem());
	public static final RegistryObject<Item> SHARDBLADE = REGISTRY.register("shardblade", () -> new ShardbladeItem());
	public static final RegistryObject<Item> SHARDPLATE_HELMET = REGISTRY.register("shardplate_helmet", () -> new ShardplateItem.Helmet());
	public static final RegistryObject<Item> SHARDPLATE_CHESTPLATE = REGISTRY.register("shardplate_chestplate", () -> new ShardplateItem.Chestplate());
	public static final RegistryObject<Item> SHARDPLATE_LEGGINGS = REGISTRY.register("shardplate_leggings", () -> new ShardplateItem.Leggings());
	public static final RegistryObject<Item> SHARDPLATE_BOOTS = REGISTRY.register("shardplate_boots", () -> new ShardplateItem.Boots());
	public static final RegistryObject<Item> SHARDBEARER_SPAWN_EGG = REGISTRY.register("shardbearer_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.SHARDBEARER, -13421824, -6750208, new Item.Properties()));
	public static final RegistryObject<Item> NIGHTWATCHER_SPAWN_EGG = REGISTRY.register("nightwatcher_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.NIGHTWATCHER, -16777216, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> SPRENBLADE = REGISTRY.register("sprenblade", () -> new SprenbladeItem());
	public static final RegistryObject<Item> SHATTERED_PLAIN_ROCK = block(StormlightModModBlocks.SHATTERED_PLAIN_ROCK);
	public static final RegistryObject<Item> ROCKBUD = block(StormlightModModBlocks.ROCKBUD);
	public static final RegistryObject<Item> ROCK_BUD_GROUND = block(StormlightModModBlocks.ROCK_BUD_GROUND);
	public static final RegistryObject<Item> HONOR_SPREN_SPAWN_EGG = REGISTRY.register("honor_spren_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.HONOR_SPREN, -16711681, -16737844, new Item.Properties()));
	public static final RegistryObject<Item> SHADESBEADS_BUCKET = REGISTRY.register("shadesbeads_bucket", () -> new ShadesbeadsItem());
	public static final RegistryObject<Item> SHADESMAR_OBSIDIAN = block(StormlightModModBlocks.SHADESMAR_OBSIDIAN);
	public static final RegistryObject<Item> DUN_EMERALD_CHIP = REGISTRY.register("dun_emerald_chip", () -> new DunEmeraldChipItem());
	public static final RegistryObject<Item> INFUSED_EMERALD_CHIP = REGISTRY.register("infused_emerald_chip", () -> new InfusedEmeraldChipItem());
	public static final RegistryObject<Item> DUN_GARTNETCHIP = REGISTRY.register("dun_gartnetchip", () -> new DunGartnetchipItem());
	public static final RegistryObject<Item> INFUSED_GARNET_CHIP = REGISTRY.register("infused_garnet_chip", () -> new InfusedGarnetChipItem());
	public static final RegistryObject<Item> PARSHENDIARCHER_SPAWN_EGG = REGISTRY.register("parshendiarcher_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.PARSHENDIARCHER, -6710887, -3407821, new Item.Properties()));
	public static final RegistryObject<Item> DUN_TOPAZ_CHIP = REGISTRY.register("dun_topaz_chip", () -> new DunTopazChipItem());
	public static final RegistryObject<Item> INFUSED_TOPAZ_CHIP = REGISTRY.register("infused_topaz_chip", () -> new InfusedTopazChipItem());
	public static final RegistryObject<Item> DUN_SAPPHIRE_CHIP = REGISTRY.register("dun_sapphire_chip", () -> new DunSapphireChipItem());
	public static final RegistryObject<Item> DUN_SMOKESTONE_CHIP = REGISTRY.register("dun_smokestone_chip", () -> new DunSmokestoneChipItem());
	public static final RegistryObject<Item> DUN_RUBY_CHIP = REGISTRY.register("dun_ruby_chip", () -> new DunRubyChipItem());
	public static final RegistryObject<Item> DUN_ZIRCON_CHIP = REGISTRY.register("dun_zircon_chip", () -> new DunZirconChipItem());
	public static final RegistryObject<Item> DUN_AMETHYST_CHIP = REGISTRY.register("dun_amethyst_chip", () -> new DunAmethystChipItem());
	public static final RegistryObject<Item> DUN_HELIODOR_CHIP = REGISTRY.register("dun_heliodor_chip", () -> new DunHeliodorChipItem());
	public static final RegistryObject<Item> DUN_EMERALD_MARK = REGISTRY.register("dun_emerald_mark", () -> new DunEmeraldMarkItem());
	public static final RegistryObject<Item> DUN_DIAMOND_MARK = REGISTRY.register("dun_diamond_mark", () -> new DunDiamondMarkItem());
	public static final RegistryObject<Item> DUN_SAPPHIRE_MARK = REGISTRY.register("dun_sapphire_mark", () -> new DunSapphireMarkItem());
	public static final RegistryObject<Item> DUN_SMOKESTONE_MARK = REGISTRY.register("dun_smokestone_mark", () -> new DunSmokestoneMarkItem());
	public static final RegistryObject<Item> DUN_RUBY_MARK = REGISTRY.register("dun_ruby_mark", () -> new DunRubyMarkItem());
	public static final RegistryObject<Item> DUN_DIAMOND_CHIP = REGISTRY.register("dun_diamond_chip", () -> new DunDiamondChipItem());
	public static final RegistryObject<Item> DUN_GARNET_MARK = REGISTRY.register("dun_garnet_mark", () -> new DunGarnetMarkItem());
	public static final RegistryObject<Item> DUN_AMETHYST_MARK = REGISTRY.register("dun_amethyst_mark", () -> new DunAmethystMarkItem());
	public static final RegistryObject<Item> DUN_HELIODOR_MARK = REGISTRY.register("dun_heliodor_mark", () -> new DunHeliodorMarkItem());
	public static final RegistryObject<Item> DUN_TOPAZ_MARK = REGISTRY.register("dun_topaz_mark", () -> new DunTopazMarkItem());
	public static final RegistryObject<Item> DUN_ZIRCON_MARK = REGISTRY.register("dun_zircon_mark", () -> new DunZirconMarkItem());
	public static final RegistryObject<Item> INFUSED_AMETHYST_CHIP = REGISTRY.register("infused_amethyst_chip", () -> new InfusedAmethystChipItem());
	public static final RegistryObject<Item> INFUSED_ZIRCONCHIP = REGISTRY.register("infused_zirconchip", () -> new InfusedZirconchipItem());
	public static final RegistryObject<Item> ROCK_BUD_BLOCK = block(StormlightModModBlocks.ROCK_BUD_BLOCK);
	public static final RegistryObject<Item> ELSECALLERFUSED_SPAWN_EGG = REGISTRY.register("elsecallerfused_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.ELSECALLERFUSED, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> WINDRUNNERFUSED_SPAWN_EGG = REGISTRY.register("windrunnerfused_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.WINDRUNNERFUSED, -1, -3407872, new Item.Properties()));
	public static final RegistryObject<Item> SPEAR = REGISTRY.register("spear", () -> new SpearItem());
	public static final RegistryObject<Item> INFUSED_EMERALD_MARK = REGISTRY.register("infused_emerald_mark", () -> new InfusedEmeraldMarkItem());
	public static final RegistryObject<Item> INFUSED_DIAMOND_MARK = REGISTRY.register("infused_diamond_mark", () -> new InfusedDiamondMarkItem());
	public static final RegistryObject<Item> INFUSED_TOPAZ_MARK = REGISTRY.register("infused_topaz_mark", () -> new InfusedTopazMarkItem());
	public static final RegistryObject<Item> INFUSED_AMETHYST_MARK = REGISTRY.register("infused_amethyst_mark", () -> new InfusedAmethystMarkItem());
	public static final RegistryObject<Item> INFUSED_GARNET_MARK = REGISTRY.register("infused_garnet_mark", () -> new InfusedGarnetMarkItem());
	public static final RegistryObject<Item> INFUSED_SAPPHIRE_CHIP = REGISTRY.register("infused_sapphire_chip", () -> new InfusedSapphireChipItem());
	public static final RegistryObject<Item> INFUSED_SAPPHIRE_MARK = REGISTRY.register("infused_sapphire_mark", () -> new InfusedSapphireMarkItem());
	public static final RegistryObject<Item> INFUSED_ZIRCON_MARK = REGISTRY.register("infused_zircon_mark", () -> new InfusedZirconMarkItem());
	public static final RegistryObject<Item> SAPPHIRE_GEM = REGISTRY.register("sapphire_gem", () -> new SapphireGemItem());
	public static final RegistryObject<Item> SAPPHIRE_ORE = block(StormlightModModBlocks.SAPPHIRE_ORE);
	public static final RegistryObject<Item> HAVAH_CHESTPLATE = REGISTRY.register("havah_chestplate", () -> new HavahItem.Chestplate());
	public static final RegistryObject<Item> MEDIUM_SAPPHIRE = REGISTRY.register("medium_sapphire", () -> new MediumSapphireItem());
	public static final RegistryObject<Item> SMALL_SAPPHIRE = REGISTRY.register("small_sapphire", () -> new SmallSapphireItem());
	public static final RegistryObject<Item> AMETHYSTGEM = REGISTRY.register("amethystgem", () -> new AmethystgemItem());
	public static final RegistryObject<Item> MEDIUM_AMETHYSTGEM = REGISTRY.register("medium_amethystgem", () -> new MediumAmethystgemItem());
	public static final RegistryObject<Item> SMALL_AMETHYSTGEM = REGISTRY.register("small_amethystgem", () -> new SmallAmethystgemItem());
	public static final RegistryObject<Item> AMETHYSTORE = block(StormlightModModBlocks.AMETHYSTORE);
	public static final RegistryObject<Item> DUN_EMERALD_BROAM = REGISTRY.register("dun_emerald_broam", () -> new DunEmeraldBroamItem());
	public static final RegistryObject<Item> DUN_DIAMOND_BROAM = REGISTRY.register("dun_diamond_broam", () -> new DunDiamondBroamItem());
	public static final RegistryObject<Item> DUN_SAPPHIRE_BROAM = REGISTRY.register("dun_sapphire_broam", () -> new DunSapphireBroamItem());
	public static final RegistryObject<Item> DUN_SMOKESTONE_BROAM = REGISTRY.register("dun_smokestone_broam", () -> new DunSmokestoneBroamItem());
	public static final RegistryObject<Item> DUN_RUBY_BROAM = REGISTRY.register("dun_ruby_broam", () -> new DunRubyBroamItem());
	public static final RegistryObject<Item> DUN_GARNET_BROAM = REGISTRY.register("dun_garnet_broam", () -> new DunGarnetBroamItem());
	public static final RegistryObject<Item> DUN_AMETHYST_BROAM = REGISTRY.register("dun_amethyst_broam", () -> new DunAmethystBroamItem());
	public static final RegistryObject<Item> DUN_HELIODOR_BROAM = REGISTRY.register("dun_heliodor_broam", () -> new DunHeliodorBroamItem());
	public static final RegistryObject<Item> DUN_TOPAZ_BROAM = REGISTRY.register("dun_topaz_broam", () -> new DunTopazBroamItem());
	public static final RegistryObject<Item> DUN_ZIRCON_BROAM = REGISTRY.register("dun_zircon_broam", () -> new DunZirconBroamItem());
	public static final RegistryObject<Item> INFUSED_EMERALD_BROAM = REGISTRY.register("infused_emerald_broam", () -> new InfusedEmeraldBroamItem());
	public static final RegistryObject<Item> INFUSED_DIAMOND_BROAM = REGISTRY.register("infused_diamond_broam", () -> new InfusedDiamondBroamItem());
	public static final RegistryObject<Item> INFUSED_TOPAZ_BROAM = REGISTRY.register("infused_topaz_broam", () -> new InfusedTopazBroamItem());
	public static final RegistryObject<Item> INFUSED_AMETHYST_BROAM = REGISTRY.register("infused_amethyst_broam", () -> new InfusedAmethystBroamItem());
	public static final RegistryObject<Item> INFUSED_GARNET_BROAM = REGISTRY.register("infused_garnet_broam", () -> new InfusedGarnetBroamItem());
	public static final RegistryObject<Item> INFUSED_SAPPHIRE_BROAM = REGISTRY.register("infused_sapphire_broam", () -> new InfusedSapphireBroamItem());
	public static final RegistryObject<Item> INFUSED_ZIRCON_BROAM = REGISTRY.register("infused_zircon_broam", () -> new InfusedZirconBroamItem());
	public static final RegistryObject<Item> INFUSED_SMOKESTONE_CHIP = REGISTRY.register("infused_smokestone_chip", () -> new InfusedSmokestoneChipItem());
	public static final RegistryObject<Item> INFUSED_SMOKESTONE_MARK = REGISTRY.register("infused_smokestone_mark", () -> new InfusedSmokestoneMarkItem());
	public static final RegistryObject<Item> INFUSED_SMOKESTONE_BROAM = REGISTRY.register("infused_smokestone_broam", () -> new InfusedSmokestoneBroamItem());
	public static final RegistryObject<Item> HIGH_SPREN_SPAWN_EGG = REGISTRY.register("high_spren_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.HIGH_SPREN, -16777216, -1, new Item.Properties()));
	public static final RegistryObject<Item> TRUTHWATCHER_SPREN_SPAWN_EGG = REGISTRY.register("truthwatcher_spren_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.TRUTHWATCHER_SPREN, -65536, -3407872, new Item.Properties()));
	public static final RegistryObject<Item> CULTIVATION_SPREN_SPAWN_EGG = REGISTRY.register("cultivation_spren_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.CULTIVATION_SPREN, -13369549, -13382656, new Item.Properties()));
	public static final RegistryObject<Item> INFUSED_RUBY_BROAM = REGISTRY.register("infused_ruby_broam", () -> new InfusedRubyBroamItem());
	public static final RegistryObject<Item> INFUSED_HELIODOR_BROAM = REGISTRY.register("infused_heliodor_broam", () -> new InfusedHeliodorBroamItem());
	public static final RegistryObject<Item> INFUSED_HELIODOR_CHIP = REGISTRY.register("infused_heliodor_chip", () -> new InfusedHeliodorChipItem());
	public static final RegistryObject<Item> INFUSED_HELIODOR_MARK = REGISTRY.register("infused_heliodor_mark", () -> new InfusedHeliodorMarkItem());
	public static final RegistryObject<Item> SMOKESTONE_GEM = REGISTRY.register("smokestone_gem", () -> new SmokestoneGemItem());
	public static final RegistryObject<Item> MEDIUM_SMOKESTONE_GEM = REGISTRY.register("medium_smokestone_gem", () -> new MediumSmokestoneGemItem());
	public static final RegistryObject<Item> SMALL_SMOKESTONERECIPE = REGISTRY.register("small_smokestonerecipe", () -> new SmallSmokestonerecipeItem());
	public static final RegistryObject<Item> SMOKESTONEORE = block(StormlightModModBlocks.SMOKESTONEORE);
	public static final RegistryObject<Item> INFUSED_RUBY_CHIP = REGISTRY.register("infused_ruby_chip", () -> new InfusedRubyChipItem());
	public static final RegistryObject<Item> INFUSED_RUBY_MARK = REGISTRY.register("infused_ruby_mark", () -> new InfusedRubyMarkItem());
	public static final RegistryObject<Item> HONORSPREGG = REGISTRY.register("honorspregg", () -> new HonorspreggItem());
	public static final RegistryObject<Item> HELIODOR_GEM = REGISTRY.register("heliodor_gem", () -> new HeliodorGemItem());
	public static final RegistryObject<Item> HELIODORORE = block(StormlightModModBlocks.HELIODORORE);
	public static final RegistryObject<Item> MEDIUM_HELIODOR_GEM = REGISTRY.register("medium_heliodor_gem", () -> new MediumHeliodorGemItem());
	public static final RegistryObject<Item> SMALL_HELIODOR_GEM = REGISTRY.register("small_heliodor_gem", () -> new SmallHeliodorGemItem());
	public static final RegistryObject<Item> RUBY_GEM = REGISTRY.register("ruby_gem", () -> new RubyGemItem());
	public static final RegistryObject<Item> RUBY_GEMORE = block(StormlightModModBlocks.RUBY_GEMORE);
	public static final RegistryObject<Item> MEDIUM_RUBY_GEM = REGISTRY.register("medium_ruby_gem", () -> new MediumRubyGemItem());
	public static final RegistryObject<Item> SMALL_RUBY_GEM = REGISTRY.register("small_ruby_gem", () -> new SmallRubyGemItem());
	public static final RegistryObject<Item> GARNET_GEM = REGISTRY.register("garnet_gem", () -> new GarnetGemItem());
	public static final RegistryObject<Item> GARNET_ORE = block(StormlightModModBlocks.GARNET_ORE);
	public static final RegistryObject<Item> MEDIUM_GARNET_GEM = REGISTRY.register("medium_garnet_gem", () -> new MediumGarnetGemItem());
	public static final RegistryObject<Item> SMALL_GARNET_GEM = REGISTRY.register("small_garnet_gem", () -> new SmallGarnetGemItem());
	public static final RegistryObject<Item> ZIRCON_GEM = REGISTRY.register("zircon_gem", () -> new ZirconGemItem());
	public static final RegistryObject<Item> ZIRCON_ORE = block(StormlightModModBlocks.ZIRCON_ORE);
	public static final RegistryObject<Item> MEDIUM_ZIRCON_GEM = REGISTRY.register("medium_zircon_gem", () -> new MediumZirconGemItem());
	public static final RegistryObject<Item> SMALL_ZIRCON_GEM = REGISTRY.register("small_zircon_gem", () -> new SmallZirconGemItem());
	public static final RegistryObject<Item> MEDIUM_DIAMOND_GEM = REGISTRY.register("medium_diamond_gem", () -> new MediumDiamondGemItem());
	public static final RegistryObject<Item> SMALL_DIAMONDGEM = REGISTRY.register("small_diamondgem", () -> new SmallDiamondgemItem());
	public static final RegistryObject<Item> TOPAZ_GEM = REGISTRY.register("topaz_gem", () -> new TopazGemItem());
	public static final RegistryObject<Item> TOPAZ_ORE = block(StormlightModModBlocks.TOPAZ_ORE);
	public static final RegistryObject<Item> MEDIUM_TOPAZGEM = REGISTRY.register("medium_topazgem", () -> new MediumTopazgemItem());
	public static final RegistryObject<Item> SMALL_TOPAZ_GEM = REGISTRY.register("small_topaz_gem", () -> new SmallTopazGemItem());
	public static final RegistryObject<Item> MEDIUM_EMERALD_GEM = REGISTRY.register("medium_emerald_gem", () -> new MediumEmeraldGemItem());
	public static final RegistryObject<Item> SMALL_EMERALD_GEM = REGISTRY.register("small_emerald_gem", () -> new SmallEmeraldGemItem());
	public static final RegistryObject<Item> OATH_GATE_KEY_BLOCK = block(StormlightModModBlocks.OATH_GATE_KEY_BLOCK);
	public static final RegistryObject<Item> INK_SPREN_SPAWN_EGG = REGISTRY.register("ink_spren_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.INK_SPREN, -16777216, -13948117, new Item.Properties()));
	public static final RegistryObject<Item> AXEHOUND_SPAWN_EGG = REGISTRY.register("axehound_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.AXEHOUND, -26368, -1, new Item.Properties()));
	public static final RegistryObject<Item> BLACK_OATHGATE_SPREN_SPAWN_EGG = REGISTRY.register("black_oathgate_spren_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.BLACK_OATHGATE_SPREN, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> WHITE_OATHGATE_SPREN_SPAWN_EGG = REGISTRY.register("white_oathgate_spren_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.WHITE_OATHGATE_SPREN, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> BLACK_OATHGATE_SPEAR = REGISTRY.register("black_oathgate_spear", () -> new BlackOathgateSpearItem());
	public static final RegistryObject<Item> CURRY = REGISTRY.register("curry", () -> new CurryItem());
	public static final RegistryObject<Item> UNCOOKEDCURRY = REGISTRY.register("uncookedcurry", () -> new UncookedcurryItem());
	public static final RegistryObject<Item> NO_SLEEP_GUY_SPAWN_EGG = REGISTRY.register("no_sleep_guy_spawn_egg", () -> new ForgeSpawnEggItem(StormlightModModEntities.NO_SLEEP_GUY, -16777216, -16777216, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}