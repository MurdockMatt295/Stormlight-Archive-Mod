
package net.mcreator.stormlightmod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class Elsecaller1MobEffect extends MobEffect {
	public Elsecaller1MobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10092340);
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
