
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.stormlightmod.world.inventory.TruthwatchersprenspawningMenu;
import net.mcreator.stormlightmod.world.inventory.SphereLanternGUIMenu;
import net.mcreator.stormlightmod.world.inventory.SkybreakerMenu;
import net.mcreator.stormlightmod.world.inventory.OathGateMenu;
import net.mcreator.stormlightmod.world.inventory.NightWatcherGUIMenu;
import net.mcreator.stormlightmod.world.inventory.NightWatcherBondGUIMenu;
import net.mcreator.stormlightmod.world.inventory.HssssssssMenu;
import net.mcreator.stormlightmod.world.inventory.ElsecallerMenu;
import net.mcreator.stormlightmod.world.inventory.CultivationMenu;
import net.mcreator.stormlightmod.StormlightModMod;

public class StormlightModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, StormlightModMod.MODID);
	public static final RegistryObject<MenuType<HssssssssMenu>> HSSSSSSSS = REGISTRY.register("hssssssss", () -> IForgeMenuType.create(HssssssssMenu::new));
	public static final RegistryObject<MenuType<SkybreakerMenu>> SKYBREAKER = REGISTRY.register("skybreaker", () -> IForgeMenuType.create(SkybreakerMenu::new));
	public static final RegistryObject<MenuType<CultivationMenu>> CULTIVATION = REGISTRY.register("cultivation", () -> IForgeMenuType.create(CultivationMenu::new));
	public static final RegistryObject<MenuType<TruthwatchersprenspawningMenu>> TRUTHWATCHERSPRENSPAWNING = REGISTRY.register("truthwatchersprenspawning", () -> IForgeMenuType.create(TruthwatchersprenspawningMenu::new));
	public static final RegistryObject<MenuType<ElsecallerMenu>> ELSECALLER = REGISTRY.register("elsecaller", () -> IForgeMenuType.create(ElsecallerMenu::new));
	public static final RegistryObject<MenuType<OathGateMenu>> OATH_GATE = REGISTRY.register("oath_gate", () -> IForgeMenuType.create(OathGateMenu::new));
	public static final RegistryObject<MenuType<NightWatcherGUIMenu>> NIGHT_WATCHER_GUI = REGISTRY.register("night_watcher_gui", () -> IForgeMenuType.create(NightWatcherGUIMenu::new));
	public static final RegistryObject<MenuType<NightWatcherBondGUIMenu>> NIGHT_WATCHER_BOND_GUI = REGISTRY.register("night_watcher_bond_gui", () -> IForgeMenuType.create(NightWatcherBondGUIMenu::new));
	public static final RegistryObject<MenuType<SphereLanternGUIMenu>> SPHERE_LANTERN_GUI = REGISTRY.register("sphere_lantern_gui", () -> IForgeMenuType.create(SphereLanternGUIMenu::new));
}
