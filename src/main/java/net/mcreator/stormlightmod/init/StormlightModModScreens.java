
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.stormlightmod.client.gui.TruthwatchersprenspawningScreen;
import net.mcreator.stormlightmod.client.gui.SkybreakerScreen;
import net.mcreator.stormlightmod.client.gui.OathGateScreen;
import net.mcreator.stormlightmod.client.gui.NightWatcherGUIScreen;
import net.mcreator.stormlightmod.client.gui.NightWatcherBondGUIScreen;
import net.mcreator.stormlightmod.client.gui.HssssssssScreen;
import net.mcreator.stormlightmod.client.gui.ElsecallerScreen;
import net.mcreator.stormlightmod.client.gui.CultivationScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StormlightModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(StormlightModModMenus.HSSSSSSSS.get(), HssssssssScreen::new);
			MenuScreens.register(StormlightModModMenus.SKYBREAKER.get(), SkybreakerScreen::new);
			MenuScreens.register(StormlightModModMenus.CULTIVATION.get(), CultivationScreen::new);
			MenuScreens.register(StormlightModModMenus.TRUTHWATCHERSPRENSPAWNING.get(), TruthwatchersprenspawningScreen::new);
			MenuScreens.register(StormlightModModMenus.ELSECALLER.get(), ElsecallerScreen::new);
			MenuScreens.register(StormlightModModMenus.OATH_GATE.get(), OathGateScreen::new);
			MenuScreens.register(StormlightModModMenus.NIGHT_WATCHER_GUI.get(), NightWatcherGUIScreen::new);
			MenuScreens.register(StormlightModModMenus.NIGHT_WATCHER_BOND_GUI.get(), NightWatcherBondGUIScreen::new);
		});
	}
}
