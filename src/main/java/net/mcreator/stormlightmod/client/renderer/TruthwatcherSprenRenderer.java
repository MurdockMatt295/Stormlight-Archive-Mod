
package net.mcreator.stormlightmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.stormlightmod.entity.TruthwatcherSprenEntity;

public class TruthwatcherSprenRenderer extends HumanoidMobRenderer<TruthwatcherSprenEntity, HumanoidModel<TruthwatcherSprenEntity>> {
	public TruthwatcherSprenRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(TruthwatcherSprenEntity entity) {
		return new ResourceLocation("stormlight_mod:textures/entities/glys.png");
	}
}
