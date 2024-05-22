
package net.mcreator.stormlightmod.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.stormlightmod.procedures.TruthwatcherPotionEffectProcedure;

public class Truthwatcher1MobEffect extends MobEffect {
	public Truthwatcher1MobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6710887);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		TruthwatcherPotionEffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
