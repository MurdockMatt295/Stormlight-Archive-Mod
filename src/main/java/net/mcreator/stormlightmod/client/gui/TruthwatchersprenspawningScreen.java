package net.mcreator.stormlightmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stormlightmod.world.inventory.TruthwatchersprenspawningMenu;
import net.mcreator.stormlightmod.network.TruthwatchersprenspawningButtonMessage;
import net.mcreator.stormlightmod.StormlightModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TruthwatchersprenspawningScreen extends AbstractContainerScreen<TruthwatchersprenspawningMenu> {
	private final static HashMap<String, Object> guistate = TruthwatchersprenspawningMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_say_the_words;
	Button button_x;

	public TruthwatchersprenspawningScreen(TruthwatchersprenspawningMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("stormlight_mod:textures/screens/truthwatchersprenspawning.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.stormlight_mod.truthwatchersprenspawning.label_i_will_seek_truth"), 44, 37, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_say_the_words = Button.builder(Component.translatable("gui.stormlight_mod.truthwatchersprenspawning.button_say_the_words"), e -> {
			if (true) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new TruthwatchersprenspawningButtonMessage(0, x, y, z));
				TruthwatchersprenspawningButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 18, this.topPos + 52, 140, 20).build();
		guistate.put("button:button_say_the_words", button_say_the_words);
		this.addRenderableWidget(button_say_the_words);
		button_x = Button.builder(Component.translatable("gui.stormlight_mod.truthwatchersprenspawning.button_x"), e -> {
			if (true) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new TruthwatchersprenspawningButtonMessage(1, x, y, z));
				TruthwatchersprenspawningButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 5, 10, 20).build();
		guistate.put("button:button_x", button_x);
		this.addRenderableWidget(button_x);
	}
}