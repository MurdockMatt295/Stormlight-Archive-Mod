package net.mcreator.stormlightmod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.util.thread.SidedThreadGroups;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.stormlightmod.world.features.StructureFeature;
import net.mcreator.stormlightmod.init.StormlightModModTabs;
import net.mcreator.stormlightmod.init.StormlightModModSounds;
import net.mcreator.stormlightmod.init.StormlightModModParticleTypes;
import net.mcreator.stormlightmod.init.StormlightModModMobEffects;
import net.mcreator.stormlightmod.init.StormlightModModMenus;
import net.mcreator.stormlightmod.init.StormlightModModItems;
import net.mcreator.stormlightmod.init.StormlightModModFluids;
import net.mcreator.stormlightmod.init.StormlightModModFluidTypes;
import net.mcreator.stormlightmod.init.StormlightModModEntities;
import net.mcreator.stormlightmod.init.StormlightModModBlocks;
import net.mcreator.stormlightmod.init.StormlightModModBlockEntities;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("stormlight_mod")
public class StormlightModMod {
	public static final Logger LOGGER = LogManager.getLogger(StormlightModMod.class);
	public static final String MODID = "stormlight_mod";

	public StormlightModMod() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		StormlightModModSounds.REGISTRY.register(bus);
		StormlightModModBlocks.REGISTRY.register(bus);
		StormlightModModBlockEntities.REGISTRY.register(bus);
		StormlightModModItems.REGISTRY.register(bus);
		StormlightModModEntities.REGISTRY.register(bus);

		StormlightModModTabs.REGISTRY.register(bus);

		StructureFeature.REGISTRY.register(bus);
		StormlightModModMobEffects.REGISTRY.register(bus);

		StormlightModModParticleTypes.REGISTRY.register(bus);

		StormlightModModMenus.REGISTRY.register(bus);
		StormlightModModFluids.REGISTRY.register(bus);
		StormlightModModFluidTypes.REGISTRY.register(bus);
		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
