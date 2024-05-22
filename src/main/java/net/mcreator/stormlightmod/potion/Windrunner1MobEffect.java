
package net.mcreator.stormlightmod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.stormlightmod.procedures.WindrunnerpotioneffectProcedure;

public class Windrunner1MobEffect extends MobEffect {
	public Windrunner1MobEffect() {
		super(MobEffectCategory.NEUTRAL, -16763956);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		WindrunnerpotioneffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
