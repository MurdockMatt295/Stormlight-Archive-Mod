package net.mcreator.stormlightmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.stormlightmod.network.StormlightModModVariables;
import net.mcreator.stormlightmod.init.StormlightModModMobEffects;

public class InfusedBroamRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:radiant"))).isDone()) {
			{
				double _setval = 6000;
				entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stormlightConsumedAmnt = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
			if (entity instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel && _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:windrunner"))).isDone()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.WINDRUNNER_1.get(), (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
			} else if (entity instanceof ServerPlayer _plr6 && _plr6.level() instanceof ServerLevel
					&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:skybreakerlevel_1"))).isDone()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.SKYBREAKER_1.get(), (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
			} else if (entity instanceof ServerPlayer _plr9 && _plr9.level() instanceof ServerLevel
					&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:dustbringerlevel_1"))).isDone()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.DUSTBRINGER_1.get(), (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
			} else if (entity instanceof ServerPlayer _plr12 && _plr12.level() instanceof ServerLevel
					&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:edgedancerlevel_1"))).isDone()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.EDGEDANCER_1.get(), (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
			} else if (entity instanceof ServerPlayer _plr15 && _plr15.level() instanceof ServerLevel
					&& _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:truthwatcherlevel_1"))).isDone()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.TRUTHWATCHER_1.get(), (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
			} else if (entity instanceof ServerPlayer _plr17 && _plr17.level() instanceof ServerLevel
					&& _plr17.getAdvancements().getOrStartProgress(_plr17.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:lightweaverlevel_1"))).isDone()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.LIGHTWEAVER_1.get(), (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
			} else if (entity instanceof ServerPlayer _plr19 && _plr19.level() instanceof ServerLevel
					&& _plr19.getAdvancements().getOrStartProgress(_plr19.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:elsecallerlevel_1"))).isDone()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.ELSECALLER_1.get(), (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
			} else if (entity instanceof ServerPlayer _plr22 && _plr22.level() instanceof ServerLevel
					&& _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:willshaperlevel_1"))).isDone()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.WILLSHAPER_1.get(), (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
			} else if (entity instanceof ServerPlayer _plr25 && _plr25.level() instanceof ServerLevel
					&& _plr25.getAdvancements().getOrStartProgress(_plr25.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:stonewardlevel_1"))).isDone()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.STONEWARD_1.get(), (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
			} else if (entity instanceof ServerPlayer _plr28 && _plr28.level() instanceof ServerLevel
					&& _plr28.getAdvancements().getOrStartProgress(_plr28.server.getAdvancements().getAdvancement(new ResourceLocation("stormlight_mod:bond_smithlevel_1"))).isDone()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(StormlightModModMobEffects.BONDSMITH_1.get(), (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, (int) StormlightModModVariables.WorldVariables.get(world).bromeStormlightAmount, 1));
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = ((entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).sphereTypeInfused);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = ((entity.getCapability(StormlightModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StormlightModModVariables.PlayerVariables())).sphereTypeDun).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
