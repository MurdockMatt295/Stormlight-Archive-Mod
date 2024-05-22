
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.stormlightmod.client.renderer.WindrunnerfusedRenderer;
import net.mcreator.stormlightmod.client.renderer.WhiteOathgateSprenRenderer;
import net.mcreator.stormlightmod.client.renderer.TruthwatcherSprenRenderer;
import net.mcreator.stormlightmod.client.renderer.ShardbearerRenderer;
import net.mcreator.stormlightmod.client.renderer.ParshendiarcherRenderer;
import net.mcreator.stormlightmod.client.renderer.NoSleepGuyRenderer;
import net.mcreator.stormlightmod.client.renderer.NightwatcherRenderer;
import net.mcreator.stormlightmod.client.renderer.InkSprenRenderer;
import net.mcreator.stormlightmod.client.renderer.HonorSprenRenderer;
import net.mcreator.stormlightmod.client.renderer.HighSprenRenderer;
import net.mcreator.stormlightmod.client.renderer.ElsecallerfusedRenderer;
import net.mcreator.stormlightmod.client.renderer.CultivationSprenRenderer;
import net.mcreator.stormlightmod.client.renderer.BlackOathgateSprenRenderer;
import net.mcreator.stormlightmod.client.renderer.AxehoundRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StormlightModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(StormlightModModEntities.SHARDBEARER.get(), ShardbearerRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.NIGHTWATCHER.get(), NightwatcherRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.HONOR_SPREN.get(), HonorSprenRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.PARSHENDIARCHER.get(), ParshendiarcherRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.ELSECALLERFUSED.get(), ElsecallerfusedRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.WINDRUNNERFUSED.get(), WindrunnerfusedRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.WINDRUNNERFUSED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.HIGH_SPREN.get(), HighSprenRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.TRUTHWATCHER_SPREN.get(), TruthwatcherSprenRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.CULTIVATION_SPREN.get(), CultivationSprenRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.INK_SPREN.get(), InkSprenRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.AXEHOUND.get(), AxehoundRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.BLACK_OATHGATE_SPREN.get(), BlackOathgateSprenRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.WHITE_OATHGATE_SPREN.get(), WhiteOathgateSprenRenderer::new);
		event.registerEntityRenderer(StormlightModModEntities.NO_SLEEP_GUY.get(), NoSleepGuyRenderer::new);
	}
}
