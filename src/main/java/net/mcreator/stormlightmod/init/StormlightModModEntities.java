
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stormlightmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.stormlightmod.entity.WindrunnerfusedEntityProjectile;
import net.mcreator.stormlightmod.entity.WindrunnerfusedEntity;
import net.mcreator.stormlightmod.entity.WhiteOathgateSprenEntity;
import net.mcreator.stormlightmod.entity.TruthwatcherSprenEntity;
import net.mcreator.stormlightmod.entity.ShardbearerEntity;
import net.mcreator.stormlightmod.entity.ParshendiarcherEntity;
import net.mcreator.stormlightmod.entity.NoSleepGuyEntity;
import net.mcreator.stormlightmod.entity.NightwatcherEntity;
import net.mcreator.stormlightmod.entity.InkSprenEntity;
import net.mcreator.stormlightmod.entity.HonorSprenEntity;
import net.mcreator.stormlightmod.entity.HighSprenEntity;
import net.mcreator.stormlightmod.entity.ElsecallerfusedEntity;
import net.mcreator.stormlightmod.entity.CultivationSprenEntity;
import net.mcreator.stormlightmod.entity.BlackOathgateSprenEntity;
import net.mcreator.stormlightmod.entity.AxehoundEntity;
import net.mcreator.stormlightmod.StormlightModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StormlightModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StormlightModMod.MODID);
	public static final RegistryObject<EntityType<ShardbearerEntity>> SHARDBEARER = register("shardbearer", EntityType.Builder.<ShardbearerEntity>of(ShardbearerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShardbearerEntity::new).fireImmune().sized(0.83f, 2.5f));
	public static final RegistryObject<EntityType<NightwatcherEntity>> NIGHTWATCHER = register("nightwatcher", EntityType.Builder.<NightwatcherEntity>of(NightwatcherEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightwatcherEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<HonorSprenEntity>> HONOR_SPREN = register("honor_spren", EntityType.Builder.<HonorSprenEntity>of(HonorSprenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(HonorSprenEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ParshendiarcherEntity>> PARSHENDIARCHER = register("parshendiarcher",
			EntityType.Builder.<ParshendiarcherEntity>of(ParshendiarcherEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ParshendiarcherEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ElsecallerfusedEntity>> ELSECALLERFUSED = register("elsecallerfused",
			EntityType.Builder.<ElsecallerfusedEntity>of(ElsecallerfusedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ElsecallerfusedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WindrunnerfusedEntity>> WINDRUNNERFUSED = register("windrunnerfused", EntityType.Builder.<WindrunnerfusedEntity>of(WindrunnerfusedEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WindrunnerfusedEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WindrunnerfusedEntityProjectile>> WINDRUNNERFUSED_PROJECTILE = register("projectile_windrunnerfused",
			EntityType.Builder.<WindrunnerfusedEntityProjectile>of(WindrunnerfusedEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(WindrunnerfusedEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HighSprenEntity>> HIGH_SPREN = register("high_spren", EntityType.Builder.<HighSprenEntity>of(HighSprenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(HighSprenEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TruthwatcherSprenEntity>> TRUTHWATCHER_SPREN = register("truthwatcher_spren", EntityType.Builder.<TruthwatcherSprenEntity>of(TruthwatcherSprenEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TruthwatcherSprenEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CultivationSprenEntity>> CULTIVATION_SPREN = register("cultivation_spren", EntityType.Builder.<CultivationSprenEntity>of(CultivationSprenEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CultivationSprenEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<InkSprenEntity>> INK_SPREN = register("ink_spren",
			EntityType.Builder.<InkSprenEntity>of(InkSprenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InkSprenEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AxehoundEntity>> AXEHOUND = register("axehound",
			EntityType.Builder.<AxehoundEntity>of(AxehoundEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AxehoundEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BlackOathgateSprenEntity>> BLACK_OATHGATE_SPREN = register("black_oathgate_spren", EntityType.Builder.<BlackOathgateSprenEntity>of(BlackOathgateSprenEntity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackOathgateSprenEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WhiteOathgateSprenEntity>> WHITE_OATHGATE_SPREN = register("white_oathgate_spren", EntityType.Builder.<WhiteOathgateSprenEntity>of(WhiteOathgateSprenEntity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhiteOathgateSprenEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NoSleepGuyEntity>> NO_SLEEP_GUY = register("no_sleep_guy", EntityType.Builder.<NoSleepGuyEntity>of(NoSleepGuyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NoSleepGuyEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ShardbearerEntity.init();
			NightwatcherEntity.init();
			HonorSprenEntity.init();
			ParshendiarcherEntity.init();
			ElsecallerfusedEntity.init();
			WindrunnerfusedEntity.init();
			HighSprenEntity.init();
			TruthwatcherSprenEntity.init();
			CultivationSprenEntity.init();
			InkSprenEntity.init();
			AxehoundEntity.init();
			BlackOathgateSprenEntity.init();
			WhiteOathgateSprenEntity.init();
			NoSleepGuyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SHARDBEARER.get(), ShardbearerEntity.createAttributes().build());
		event.put(NIGHTWATCHER.get(), NightwatcherEntity.createAttributes().build());
		event.put(HONOR_SPREN.get(), HonorSprenEntity.createAttributes().build());
		event.put(PARSHENDIARCHER.get(), ParshendiarcherEntity.createAttributes().build());
		event.put(ELSECALLERFUSED.get(), ElsecallerfusedEntity.createAttributes().build());
		event.put(WINDRUNNERFUSED.get(), WindrunnerfusedEntity.createAttributes().build());
		event.put(HIGH_SPREN.get(), HighSprenEntity.createAttributes().build());
		event.put(TRUTHWATCHER_SPREN.get(), TruthwatcherSprenEntity.createAttributes().build());
		event.put(CULTIVATION_SPREN.get(), CultivationSprenEntity.createAttributes().build());
		event.put(INK_SPREN.get(), InkSprenEntity.createAttributes().build());
		event.put(AXEHOUND.get(), AxehoundEntity.createAttributes().build());
		event.put(BLACK_OATHGATE_SPREN.get(), BlackOathgateSprenEntity.createAttributes().build());
		event.put(WHITE_OATHGATE_SPREN.get(), WhiteOathgateSprenEntity.createAttributes().build());
		event.put(NO_SLEEP_GUY.get(), NoSleepGuyEntity.createAttributes().build());
	}
}
