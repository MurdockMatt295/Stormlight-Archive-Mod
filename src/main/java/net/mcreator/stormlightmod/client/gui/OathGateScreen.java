package net.mcreator.stormlightmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.stormlightmod.world.inventory.OathGateMenu;
import net.mcreator.stormlightmod.network.OathGateButtonMessage;
import net.mcreator.stormlightmod.StormlightModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class OathGateScreen extends AbstractContainerScreen<OathGateMenu> {
	private final static HashMap<String, Object> guistate = OathGateMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_go_to_shadesmar;
	Button button_go_to_urithiru;

	public OathGateScreen(OathGateMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("stormlight_mod:textures/screens/oath_gate.png");

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
	}

	@Override
	public void init() {
		super.init();
		button_go_to_shadesmar = Button.builder(Component.translatable("gui.stormlight_mod.oath_gate.button_go_to_shadesmar"), e -> {
			if (true) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new OathGateButtonMessage(0, x, y, z));
				OathGateButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 19, this.topPos + 69, 135, 20).build();
		guistate.put("button:button_go_to_shadesmar", button_go_to_shadesmar);
		this.addRenderableWidget(button_go_to_shadesmar);
		button_go_to_urithiru = Button.builder(Component.translatable("gui.stormlight_mod.oath_gate.button_go_to_urithiru"), e -> {
			if (true) {
				StormlightModMod.PACKET_HANDLER.sendToServer(new OathGateButtonMessage(1, x, y, z));
				OathGateButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 18, this.topPos + 41, 135, 20).build();
		guistate.put("button:button_go_to_urithiru", button_go_to_urithiru);
		this.addRenderableWidget(button_go_to_urithiru);
	}
}
