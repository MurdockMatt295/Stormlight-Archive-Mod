
package net.mcreator.stormlightmod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.stormlightmod.init.StormlightModModItems;
import net.mcreator.stormlightmod.init.StormlightModModFluids;
import net.mcreator.stormlightmod.init.StormlightModModFluidTypes;
import net.mcreator.stormlightmod.init.StormlightModModBlocks;

public abstract class ShadesbeadsFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> StormlightModModFluidTypes.SHADESBEADS_TYPE.get(), () -> StormlightModModFluids.SHADESBEADS.get(),
			() -> StormlightModModFluids.FLOWING_SHADESBEADS.get()).explosionResistance(100f).bucket(() -> StormlightModModItems.SHADESBEADS_BUCKET.get()).block(() -> (LiquidBlock) StormlightModModBlocks.SHADESBEADS.get());

	private ShadesbeadsFluid() {
		super(PROPERTIES);
	}

	public static class Source extends ShadesbeadsFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ShadesbeadsFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
