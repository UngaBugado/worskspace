
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cumdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cumdimension.block.WhiteBlock;
import net.mcreator.cumdimension.block.White2Block;
import net.mcreator.cumdimension.block.LeCumDimensionPortalBlock;
import net.mcreator.cumdimension.block.CumBlockBlock;
import net.mcreator.cumdimension.CumDimensionMod;

public class CumDimensionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CumDimensionMod.MODID);
	public static final RegistryObject<Block> CUM_BLOCK = REGISTRY.register("cum_block", () -> new CumBlockBlock());
	public static final RegistryObject<Block> WHITE = REGISTRY.register("white", () -> new WhiteBlock());
	public static final RegistryObject<Block> WHITE_2 = REGISTRY.register("white_2", () -> new White2Block());
	public static final RegistryObject<Block> LE_CUM_DIMENSION_PORTAL = REGISTRY.register("le_cum_dimension_portal",
			() -> new LeCumDimensionPortalBlock());
}
