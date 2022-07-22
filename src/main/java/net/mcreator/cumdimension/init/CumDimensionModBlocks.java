
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cumdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cumdimension.block.CumBlockBlock;
import net.mcreator.cumdimension.CumDimensionMod;

public class CumDimensionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CumDimensionMod.MODID);
	public static final RegistryObject<Block> CUM_BLOCK = REGISTRY.register("cum_block", () -> new CumBlockBlock());
}
