package net.mcreator.stormlightmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stormlightmod.world.inventory.NightWatcherGUIMenu;
import net.mcreator.stormlightmod.network.NightWatcherGUIButtonMessage;
import net.mcreator.stormlightmod.StormlightModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class NightWatcherGUIScreen extends AbstractContainerScreen<NightWatcherGUIMenu> {
	private final static HashMap<String, Object> guistate = NightWatcherGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_i_wish_for_a_boon;
	Button button_i_wish_for_nothing;

	public NightWatcherGUIScreen(NightWatcherGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 178;
		this.imageHeight = 137;
	}

	private static final ResourceLocation texture = new ResourceLocation("stormlight_mod:textures/screens/night_watcher_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.stormlight_mod.night_watcher_gui.label_do_you_wish_for_a_boon"), 33, 6, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		button_i_wish_for_a_boon = Button.builder(Component.translatable("gui.stormlight_mod.night_watcher_gui.button_i_wish_for_a_boon"), e -> {
			if (true) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new NightWatcherGUIButtonMessage(0, x, y, z));
				NightWatcherGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 31, this.topPos + 28, 113, 20).build();
		guistate.put("button:button_i_wish_for_a_boon", button_i_wish_for_a_boon);
		this.addRenderableWidget(button_i_wish_for_a_boon);
		button_i_wish_for_nothing = Button.builder(Component.translatable("gui.stormlight_mod.night_watcher_gui.button_i_wish_for_nothing"), e -> {
			if (true) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new NightWatcherGUIButtonMessage(1, x, y, z));
				NightWatcherGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 28, this.topPos + 67, 118, 20).build();
		guistate.put("button:button_i_wish_for_nothing", button_i_wish_for_nothing);
		this.addRenderableWidget(button_i_wish_for_nothing);
	}
}
