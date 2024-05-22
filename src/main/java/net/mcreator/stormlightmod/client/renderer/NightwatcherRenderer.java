
package net.mcreator.stormlightmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.stormlightmod.entity.NightwatcherEntity;

public class NightwatcherRenderer extends MobRenderer<NightwatcherEntity, SpiderModel<NightwatcherEntity>> {
	public NightwatcherRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NightwatcherEntity entity) {
		return new ResourceLocation("stormlight_mod:textures/entities/thenightwatcher.png");
	}
}
