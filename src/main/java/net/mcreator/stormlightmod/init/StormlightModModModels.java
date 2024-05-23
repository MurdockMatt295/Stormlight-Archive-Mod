
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.stormlightmod.client.model.ModelCultivationSpren;
import net.mcreator.stormlightmod.client.model.ModelBlackKnightmodel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StormlightModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBlackKnightmodel.LAYER_LOCATION, ModelBlackKnightmodel::createBodyLayer);
		event.registerLayerDefinition(ModelCultivationSpren.LAYER_LOCATION, ModelCultivationSpren::createBodyLayer);
	}
}
