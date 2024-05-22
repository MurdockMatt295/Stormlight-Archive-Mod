
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.stormlightmod.network.TruthwatcherkeyMessage;
import net.mcreator.stormlightmod.network.SkybreakerkeyMessage;
import net.mcreator.stormlightmod.network.RadientPowerMessage;
import net.mcreator.stormlightmod.network.Radient1Power2Message;
import net.mcreator.stormlightmod.network.NightWatchMessage;
import net.mcreator.stormlightmod.network.LashingAmountAmplifierMessage;
import net.mcreator.stormlightmod.network.LashingAmount2Message;
import net.mcreator.stormlightmod.network.LashingAmount1Message;
import net.mcreator.stormlightmod.network.HSMessage;
import net.mcreator.stormlightmod.network.ElsecallerpowerMessage;
import net.mcreator.stormlightmod.network.ElsecallerGuiMessage;
import net.mcreator.stormlightmod.network.EdgedancerGrowthingsMessage;
import net.mcreator.stormlightmod.network.CultivationsprenguiMessage;
import net.mcreator.stormlightmod.StormlightModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StormlightModModKeyMappings {
	public static final KeyMapping RADIENT_POWER = new KeyMapping("key.stormlight_mod.radient_power", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RADIENT_POWER_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - RADIENT_POWER_LASTPRESS);
				StormlightModMod.PACKET_HANDLER.sendToServer(new RadientPowerMessage(1, dt));
				RadientPowerMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping RADIENT_1_POWER_2 = new KeyMapping("key.stormlight_mod.radient_1_power_2", GLFW.GLFW_KEY_T, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				RADIENT_1_POWER_2_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - RADIENT_1_POWER_2_LASTPRESS);
				StormlightModMod.PACKET_HANDLER.sendToServer(new Radient1Power2Message(1, dt));
				Radient1Power2Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping LASHING_AMOUNT_AMPLIFIER = new KeyMapping("key.stormlight_mod.lashing_amount_amplifier", GLFW.GLFW_KEY_3, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				LASHING_AMOUNT_AMPLIFIER_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - LASHING_AMOUNT_AMPLIFIER_LASTPRESS);
				StormlightModMod.PACKET_HANDLER.sendToServer(new LashingAmountAmplifierMessage(1, dt));
				LashingAmountAmplifierMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping LASHING_AMOUNT_1 = new KeyMapping("key.stormlight_mod.lashing_amount_1", GLFW.GLFW_KEY_1, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				LASHING_AMOUNT_1_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - LASHING_AMOUNT_1_LASTPRESS);
				StormlightModMod.PACKET_HANDLER.sendToServer(new LashingAmount1Message(1, dt));
				LashingAmount1Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping LASHING_AMOUNT_2 = new KeyMapping("key.stormlight_mod.lashing_amount_2", GLFW.GLFW_KEY_2, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				LASHING_AMOUNT_2_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - LASHING_AMOUNT_2_LASTPRESS);
				StormlightModMod.PACKET_HANDLER.sendToServer(new LashingAmount2Message(1, dt));
				LashingAmount2Message.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping HS = new KeyMapping("key.stormlight_mod.hs", GLFW.GLFW_KEY_Z, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new HSMessage(0, 0));
				HSMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SKYBREAKERKEY = new KeyMapping("key.stormlight_mod.skybreakerkey", GLFW.GLFW_KEY_X, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new SkybreakerkeyMessage(0, 0));
				SkybreakerkeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CULTIVATIONSPRENGUI = new KeyMapping("key.stormlight_mod.cultivationsprengui", GLFW.GLFW_KEY_C, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new CultivationsprenguiMessage(0, 0));
				CultivationsprenguiMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TRUTHWATCHERKEY = new KeyMapping("key.stormlight_mod.truthwatcherkey", GLFW.GLFW_KEY_V, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new TruthwatcherkeyMessage(0, 0));
				TruthwatcherkeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ELSECALLER_GUI = new KeyMapping("key.stormlight_mod.elsecaller_gui", GLFW.GLFW_KEY_V, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new ElsecallerGuiMessage(0, 0));
				ElsecallerGuiMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping EDGEDANCER_GROWTHINGS = new KeyMapping("key.stormlight_mod.edgedancer_growthings", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new EdgedancerGrowthingsMessage(0, 0));
				EdgedancerGrowthingsMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ELSECALLERPOWER = new KeyMapping("key.stormlight_mod.elsecallerpower", GLFW.GLFW_KEY_T, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new ElsecallerpowerMessage(0, 0));
				ElsecallerpowerMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping NIGHT_WATCH = new KeyMapping("key.stormlight_mod.night_watch", GLFW.GLFW_KEY_Z, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new NightWatchMessage(0, 0));
				NightWatchMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long RADIENT_POWER_LASTPRESS = 0;
	private static long RADIENT_1_POWER_2_LASTPRESS = 0;
	private static long LASHING_AMOUNT_AMPLIFIER_LASTPRESS = 0;
	private static long LASHING_AMOUNT_1_LASTPRESS = 0;
	private static long LASHING_AMOUNT_2_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(RADIENT_POWER);
		event.register(RADIENT_1_POWER_2);
		event.register(LASHING_AMOUNT_AMPLIFIER);
		event.register(LASHING_AMOUNT_1);
		event.register(LASHING_AMOUNT_2);
		event.register(HS);
		event.register(SKYBREAKERKEY);
		event.register(CULTIVATIONSPRENGUI);
		event.register(TRUTHWATCHERKEY);
		event.register(ELSECALLER_GUI);
		event.register(EDGEDANCER_GROWTHINGS);
		event.register(ELSECALLERPOWER);
		event.register(NIGHT_WATCH);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				RADIENT_POWER.consumeClick();
				RADIENT_1_POWER_2.consumeClick();
				LASHING_AMOUNT_AMPLIFIER.consumeClick();
				LASHING_AMOUNT_1.consumeClick();
				LASHING_AMOUNT_2.consumeClick();
				HS.consumeClick();
				SKYBREAKERKEY.consumeClick();
				CULTIVATIONSPRENGUI.consumeClick();
				TRUTHWATCHERKEY.consumeClick();
				ELSECALLER_GUI.consumeClick();
				EDGEDANCER_GROWTHINGS.consumeClick();
				ELSECALLERPOWER.consumeClick();
				NIGHT_WATCH.consumeClick();
			}
		}
	}
}
