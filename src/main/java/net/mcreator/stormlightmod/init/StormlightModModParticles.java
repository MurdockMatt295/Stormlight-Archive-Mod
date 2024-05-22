
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.stormlightmod.client.particle.RainSprenParticle;
import net.mcreator.stormlightmod.client.particle.PainSprenParticle;
import net.mcreator.stormlightmod.client.particle.MusicsprenParticle;
import net.mcreator.stormlightmod.client.particle.HungerSprenParticle;
import net.mcreator.stormlightmod.client.particle.GlorySprenParticle;
import net.mcreator.stormlightmod.client.particle.DeathSprenParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StormlightModModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(StormlightModModParticleTypes.GLORY_SPREN.get(), GlorySprenParticle::provider);
		event.registerSpriteSet(StormlightModModParticleTypes.PAIN_SPREN.get(), PainSprenParticle::provider);
		event.registerSpriteSet(StormlightModModParticleTypes.DEATH_SPREN.get(), DeathSprenParticle::provider);
		event.registerSpriteSet(StormlightModModParticleTypes.MUSICSPREN.get(), MusicsprenParticle::provider);
		event.registerSpriteSet(StormlightModModParticleTypes.HUNGER_SPREN.get(), HungerSprenParticle::provider);
		event.registerSpriteSet(StormlightModModParticleTypes.RAIN_SPREN.get(), RainSprenParticle::provider);
	}
}
