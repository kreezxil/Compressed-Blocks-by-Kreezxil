package com.kreezxil.compressedblocks.Init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InitRecipes {


	public static void init() {


		GameRegistry.addSmelting(new ItemStack(InitBlocks.ActivatedCarbonite), new ItemStack(InitItems.carbonDust, 18),
				6.0f);

		GameRegistry.addSmelting(new ItemStack(InitItems.UnfiredBuckyBall), new ItemStack(InitItems.BuckyBall), 4.0f);

		GameRegistry.addSmelting(new ItemStack(InitItems.UnfiredCarbonNanoTube), new ItemStack(InitItems.CarbonNanoTube),
				4.5f);

		GameRegistry.addSmelting(new ItemStack(InitItems.UnfiredCarbonMesh), new ItemStack(InitItems.CarbonMesh), 8.0f);

		GameRegistry.addSmelting(new ItemStack(InitItems.UnfiredDiamond), new ItemStack(Items.DIAMOND, 32), 8f);


	}

}
