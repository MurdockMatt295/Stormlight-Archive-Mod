
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.stormlightmod.StormlightModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StormlightModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StormlightModMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(StormlightModModBlocks.SHATTERED_PLAIN_ROCK.get().asItem());
			tabData.accept(StormlightModModBlocks.ROCK_BUD_GROUND.get().asItem());
			tabData.accept(StormlightModModBlocks.SHADESMAR_OBSIDIAN.get().asItem());
			tabData.accept(StormlightModModBlocks.ROCK_BUD_BLOCK.get().asItem());
			tabData.accept(StormlightModModBlocks.SAPPHIRE_ORE.get().asItem());
			tabData.accept(StormlightModModBlocks.AMETHYSTORE.get().asItem());
			tabData.accept(StormlightModModBlocks.SMOKESTONEORE.get().asItem());
			tabData.accept(StormlightModModBlocks.HELIODORORE.get().asItem());
			tabData.accept(StormlightModModBlocks.RUBY_GEMORE.get().asItem());
			tabData.accept(StormlightModModBlocks.GARNET_ORE.get().asItem());
			tabData.accept(StormlightModModBlocks.ZIRCON_ORE.get().asItem());
			tabData.accept(StormlightModModBlocks.TOPAZ_ORE.get().asItem());
			tabData.accept(StormlightModModBlocks.OATH_GATE_KEY_BLOCK.get().asItem());
			tabData.accept(StormlightModModBlocks.SPHERE_LANTERN.get().asItem());
			tabData.accept(StormlightModModBlocks.SPHERE_LANTERN_INFUSED.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(StormlightModModItems.SHARDBLADE.get());
			tabData.accept(StormlightModModItems.SHARDPLATE_HELMET.get());
			tabData.accept(StormlightModModItems.SHARDPLATE_CHESTPLATE.get());
			tabData.accept(StormlightModModItems.SHARDPLATE_LEGGINGS.get());
			tabData.accept(StormlightModModItems.SHARDPLATE_BOOTS.get());
			tabData.accept(StormlightModModItems.SPRENBLADE.get());
			tabData.accept(StormlightModModItems.SPEAR.get());
			tabData.accept(StormlightModModItems.HAVAH_CHESTPLATE.get());
			tabData.accept(StormlightModModItems.BLACK_OATHGATE_SPEAR.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(StormlightModModItems.INFUSED_DIAMOND_CHIP.get());
			tabData.accept(StormlightModModItems.SHARDBEARER_SPAWN_EGG.get());
			tabData.accept(StormlightModModItems.NIGHTWATCHER_SPAWN_EGG.get());
			tabData.accept(StormlightModModItems.HONOR_SPREN_SPAWN_EGG.get());
			tabData.accept(StormlightModModItems.SHADESBEADS_BUCKET.get());
			tabData.accept(StormlightModModItems.DUN_EMERALD_CHIP.get());
			tabData.accept(StormlightModModItems.INFUSED_EMERALD_CHIP.get());
			tabData.accept(StormlightModModItems.DUN_GARTNETCHIP.get());
			tabData.accept(StormlightModModItems.INFUSED_GARNET_CHIP.get());
			tabData.accept(StormlightModModItems.PARSHENDIARCHER_SPAWN_EGG.get());
			tabData.accept(StormlightModModItems.DUN_TOPAZ_CHIP.get());
			tabData.accept(StormlightModModItems.INFUSED_TOPAZ_CHIP.get());
			tabData.accept(StormlightModModItems.DUN_SAPPHIRE_CHIP.get());
			tabData.accept(StormlightModModItems.DUN_SMOKESTONE_CHIP.get());
			tabData.accept(StormlightModModItems.DUN_RUBY_CHIP.get());
			tabData.accept(StormlightModModItems.DUN_ZIRCON_CHIP.get());
			tabData.accept(StormlightModModItems.DUN_AMETHYST_CHIP.get());
			tabData.accept(StormlightModModItems.DUN_HELIODOR_CHIP.get());
			tabData.accept(StormlightModModItems.DUN_EMERALD_MARK.get());
			tabData.accept(StormlightModModItems.DUN_DIAMOND_MARK.get());
			tabData.accept(StormlightModModItems.DUN_SAPPHIRE_MARK.get());
			tabData.accept(StormlightModModItems.DUN_SMOKESTONE_MARK.get());
			tabData.accept(StormlightModModItems.DUN_RUBY_MARK.get());
			tabData.accept(StormlightModModItems.DUN_DIAMOND_CHIP.get());
			tabData.accept(StormlightModModItems.DUN_GARNET_MARK.get());
			tabData.accept(StormlightModModItems.DUN_AMETHYST_MARK.get());
			tabData.accept(StormlightModModItems.DUN_HELIODOR_MARK.get());
			tabData.accept(StormlightModModItems.DUN_TOPAZ_MARK.get());
			tabData.accept(StormlightModModItems.DUN_ZIRCON_MARK.get());
			tabData.accept(StormlightModModItems.INFUSED_AMETHYST_CHIP.get());
			tabData.accept(StormlightModModItems.INFUSED_ZIRCONCHIP.get());
			tabData.accept(StormlightModModItems.ELSECALLERFUSED_SPAWN_EGG.get());
			tabData.accept(StormlightModModItems.WINDRUNNERFUSED_SPAWN_EGG.get());
			tabData.accept(StormlightModModItems.INFUSED_EMERALD_MARK.get());
			tabData.accept(StormlightModModItems.INFUSED_DIAMOND_MARK.get());
			tabData.accept(StormlightModModItems.INFUSED_TOPAZ_MARK.get());
			tabData.accept(StormlightModModItems.INFUSED_AMETHYST_MARK.get());
			tabData.accept(StormlightModModItems.INFUSED_GARNET_MARK.get());
			tabData.accept(StormlightModModItems.INFUSED_SAPPHIRE_CHIP.get());
			tabData.accept(StormlightModModItems.INFUSED_SAPPHIRE_MARK.get());
			tabData.accept(StormlightModModItems.INFUSED_ZIRCON_MARK.get());
			tabData.accept(StormlightModModItems.SAPPHIRE_GEM.get());
			tabData.accept(StormlightModModItems.MEDIUM_SAPPHIRE.get());
			tabData.accept(StormlightModModItems.SMALL_SAPPHIRE.get());
			tabData.accept(StormlightModModItems.AMETHYSTGEM.get());
			tabData.accept(StormlightModModItems.MEDIUM_AMETHYSTGEM.get());
			tabData.accept(StormlightModModItems.SMALL_AMETHYSTGEM.get());
			tabData.accept(StormlightModModItems.DUN_EMERALD_BROAM.get());
			tabData.accept(StormlightModModItems.DUN_DIAMOND_BROAM.get());
			tabData.accept(StormlightModModItems.DUN_SAPPHIRE_BROAM.get());
			tabData.accept(StormlightModModItems.DUN_SMOKESTONE_BROAM.get());
			tabData.accept(StormlightModModItems.DUN_RUBY_BROAM.get());
			tabData.accept(StormlightModModItems.DUN_GARNET_BROAM.get());
			tabData.accept(StormlightModModItems.DUN_AMETHYST_BROAM.get());
			tabData.accept(StormlightModModItems.DUN_HELIODOR_BROAM.get());
			tabData.accept(StormlightModModItems.DUN_TOPAZ_BROAM.get());
			tabData.accept(StormlightModModItems.DUN_ZIRCON_BROAM.get());
			tabData.accept(StormlightModModItems.INFUSED_EMERALD_BROAM.get());
			tabData.accept(StormlightModModItems.INFUSED_DIAMOND_BROAM.get());
			tabData.accept(StormlightModModItems.INFUSED_TOPAZ_BROAM.get());
			tabData.accept(StormlightModModItems.INFUSED_AMETHYST_BROAM.get());
			tabData.accept(StormlightModModItems.INFUSED_GARNET_BROAM.get());
			tabData.accept(StormlightModModItems.INFUSED_SAPPHIRE_BROAM.get());
			tabData.accept(StormlightModModItems.INFUSED_ZIRCON_BROAM.get());
			tabData.accept(StormlightModModItems.HIGH_SPREN_SPAWN_EGG.get());
			tabData.accept(StormlightModModItems.INFUSED_SMOKESTONE_CHIP.get());
			tabData.accept(StormlightModModItems.INFUSED_SMOKESTONE_MARK.get());
			tabData.accept(StormlightModModItems.INFUSED_SMOKESTONE_BROAM.get());
			tabData.accept(StormlightModModItems.TRUTHWATCHER_SPREN_SPAWN_EGG.get());
			tabData.accept(StormlightModModItems.CULTIVATION_SPREN_SPAWN_EGG.get());
			tabData.accept(StormlightModModItems.INFUSED_RUBY_BROAM.get());
			tabData.accept(StormlightModModItems.INFUSED_HELIODOR_BROAM.get());
			tabData.accept(StormlightModModItems.INFUSED_HELIODOR_CHIP.get());
			tabData.accept(StormlightModModItems.INFUSED_HELIODOR_MARK.get());
			tabData.accept(StormlightModModItems.SMOKESTONE_GEM.get());
			tabData.accept(StormlightModModItems.MEDIUM_SMOKESTONE_GEM.get());
			tabData.accept(StormlightModModItems.SMALL_SMOKESTONERECIPE.get());
			tabData.accept(StormlightModModItems.INFUSED_RUBY_CHIP.get());
			tabData.accept(StormlightModModItems.INFUSED_RUBY_MARK.get());
			tabData.accept(StormlightModModItems.HONORSPREGG.get());
			tabData.accept(StormlightModModItems.HELIODOR_GEM.get());
			tabData.accept(StormlightModModItems.MEDIUM_HELIODOR_GEM.get());
			tabData.accept(StormlightModModItems.SMALL_HELIODOR_GEM.get());
			tabData.accept(StormlightModModItems.RUBY_GEM.get());
			tabData.accept(StormlightModModItems.MEDIUM_RUBY_GEM.get());
			tabData.accept(StormlightModModItems.SMALL_RUBY_GEM.get());
			tabData.accept(StormlightModModItems.GARNET_GEM.get());
			tabData.accept(StormlightModModItems.MEDIUM_GARNET_GEM.get());
			tabData.accept(StormlightModModItems.SMALL_GARNET_GEM.get());
			tabData.accept(StormlightModModItems.ZIRCON_GEM.get());
			tabData.accept(StormlightModModItems.MEDIUM_ZIRCON_GEM.get());
			tabData.accept(StormlightModModItems.SMALL_ZIRCON_GEM.get());
			tabData.accept(StormlightModModItems.MEDIUM_DIAMOND_GEM.get());
			tabData.accept(StormlightModModItems.SMALL_DIAMONDGEM.get());
			tabData.accept(StormlightModModItems.TOPAZ_GEM.get());
			tabData.accept(StormlightModModItems.MEDIUM_TOPAZGEM.get());
			tabData.accept(StormlightModModItems.SMALL_TOPAZ_GEM.get());
			tabData.accept(StormlightModModItems.MEDIUM_EMERALD_GEM.get());
			tabData.accept(StormlightModModItems.SMALL_EMERALD_GEM.get());
			tabData.accept(StormlightModModItems.INK_SPREN_SPAWN_EGG.get());
			tabData.accept(StormlightModModItems.AXEHOUND_SPAWN_EGG.get());
			tabData.accept(StormlightModModItems.BLACK_OATHGATE_SPREN_SPAWN_EGG.get());
			tabData.accept(StormlightModModItems.WHITE_OATHGATE_SPREN_SPAWN_EGG.get());
			tabData.accept(StormlightModModItems.NO_SLEEP_GUY_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(StormlightModModBlocks.ROCKBUD.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(StormlightModModItems.CURRY.get());
			tabData.accept(StormlightModModItems.UNCOOKEDCURRY.get());
		}
	}
}
