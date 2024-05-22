
package net.mcreator.stormlightmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.stormlightmod.entity.CultivationSprenEntity;
import net.mcreator.stormlightmod.client.model.ModelCultivationSpren;

public class CultivationSprenRenderer extends MobRenderer<CultivationSprenEntity, ModelCultivationSpren<CultivationSprenEntity>> {
	public CultivationSprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCultivationSpren(context.bakeLayer(ModelCultivationSpren.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CultivationSprenEntity entity) {
		return new ResourceLocation("stormlight_mod:textures/entities/cultivationsprentexture.png");
	}
}
