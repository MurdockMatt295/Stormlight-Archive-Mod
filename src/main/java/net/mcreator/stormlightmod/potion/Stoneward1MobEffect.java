
package net.mcreator.stormlightmod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class Stoneward1MobEffect extends MobEffect {
	public Stoneward1MobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6710887);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
