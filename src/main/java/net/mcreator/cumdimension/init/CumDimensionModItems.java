
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cumdimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cumdimension.CumDimensionMod;

public class CumDimensionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CumDimensionMod.MODID);
	public static final RegistryObject<Item> CUM_BLOCK = block(CumDimensionModBlocks.CUM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WHITE = block(CumDimensionModBlocks.WHITE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WHITE_2 = block(CumDimensionModBlocks.WHITE_2, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
