
package net.mcreator.stormlightmod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.stormlightmod.procedures.EdgedancerPotionEffectProcedure;

public class Edgedancer1MobEffect extends MobEffect {
	public Edgedancer1MobEffect() {
		super(MobEffectCategory.NEUTRAL, -16751104);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		EdgedancerPotionEffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
