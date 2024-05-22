package net.mcreator.stormlightmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import java.util.Calendar;

@Mod.EventBusSubscriber
public class DeathRattlesProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		String DeathRattleText = "";
		if (entity instanceof Player) {
			if (Math.random() < 0.1) {
				DeathRattleText = "I have seen the end, and have heard it named. The Night of Sorrows, the True Desolation. The Everstorm. ";
			} else if (Math.random() < 0.2) {
				DeathRattleText = "They named it the Final Desolation, but they lied. Our gods lied. Oh, how they lied. The Everstorm comes. I hear its whispers, see its stormwall, know its heart. ";
			} else if (Math.random() < 0.3) {
				DeathRattleText = "They come from the pit, two dead men, a heart in their hands, and I know that I have seen true glory.";
			} else if (Math.random() < 0.4) {
				DeathRattleText = "The love of men is a frigid thing, a mountain stream only three steps from the ice. We are his. Oh Stormfather... we are his. It is but a thousand days, and the Everstorm comes. ";
			} else if (Math.random() < 0.5) {
				DeathRattleText = "I'm dying, aren't I? Healer, why do you take my blood? Who is that beside you, with his head of lines? I can see a distant sun, dark and cold, shining in a black sky. ";
			} else if (Math.random() < 0.6) {
				DeathRattleText = "Three of sixteen ruled, but now the Broken One reigns.";
			} else if (Math.random() < 0.7) {
				DeathRattleText = "The burdens of nine become mine. Why must I carry the madness of them all? Oh, Almighty, release me. ";
			} else if (Math.random() < 0.8) {
				DeathRattleText = "A woman sits and scratches out her own eyes. Daughter of kings and winds, the vandal.";
			} else if (Math.random() < 0.9) {
				DeathRattleText = "All is withdrawn for me. I stand against the one who saved my life. I protect the one who killed my promises. I raise my hand. The storm responds. ";
			} else if (Math.random() <= 1) {
				DeathRattleText = "Re-Shephir, the Midnight Mother, giving birth to abominations with her essence so dark, so terrible, so consuming. She is here! She watches me die!";
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((DeathRattleText + " Collected on " + Calendar.getInstance().get(Calendar.MONTH) + "/" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + "/"
						+ Calendar.getInstance().get(Calendar.YEAR) + " Time: " + Calendar.getInstance().get(Calendar.HOUR_OF_DAY) + ":" + Calendar.getInstance().get(Calendar.MINUTE) + ":" + Calendar.getInstance().get(Calendar.SECOND))), false);
		}
	}
}
