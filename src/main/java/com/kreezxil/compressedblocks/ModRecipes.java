package com.kreezxil.compressedblocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	private static final int COMPRESSED = 0;
	private static final int DOUBLE = 1;
	private static final int TRIPLE = 2;
	private static final int QUADRUPLE = 3;
	private static final int QUINTUPLE = 4;
	private static final int SEXTUPLE = 5;
	private static final int SEPTUPLE = 6;
	private static final int OCTUPLE = 7;

	public static void addCompressionRecipe(Block big, Block small) {
		GameRegistry.addShapelessRecipe(new ItemStack(small, 9), new ItemStack(
				big));
		GameRegistry.addShapedRecipe(new ItemStack(big), "XXX", "XXX", "XXX",
				'X', new ItemStack(small));
	}

	public static void addCompressionRecipe(Block stateBlock, int tier_big,
			int tier_small) {
		GameRegistry.addShapelessRecipe(
				new ItemStack(stateBlock, 9, tier_small), new ItemStack(
						stateBlock, 1, tier_big));
		GameRegistry.addShapedRecipe(new ItemStack(stateBlock, 1, tier_big),
				"XXX", "XXX", "XXX", 'X', new ItemStack(stateBlock, 1,
						tier_small));
	}

	public static void addCompressionRecipe(Block big, Item small) {
		GameRegistry.addShapelessRecipe(new ItemStack(small, 9), new ItemStack(
				Item.getItemFromBlock(big)));
		GameRegistry.addShapedRecipe(new ItemStack(Item.getItemFromBlock(big)),
				"XXX", "XXX", "XXX", 'X', new ItemStack(small));

	}
	
	public static void addCompressionRecipe(Block big, Block small, int meta) {
		GameRegistry.addShapelessRecipe(new ItemStack(small,9,meta), big);
		GameRegistry.addShapedRecipe(new ItemStack(big),"XXX","XXX","XXX",'X', new ItemStack(small,9,meta));
	}

	public static void addBulkCompressionRecipes(Block master, int fromTier,
			int destinationTier) {
		for (int i = fromTier; i <= destinationTier; i++) {
			addCompressionRecipe(master, i, i - 1);
		}

	}

	public static void addRecipes() {

		GameRegistry.addShapedRecipe(new ItemStack(Blocks.coal_block, 1),
				"CCC", "CCC", "CCC", 'C', new ItemStack(Items.coal, 1, 1));

		GameRegistry.addShapelessRecipe(new ItemStack(
				ModBlocks.coalAndGravelMix, 1),
				new ItemStack(Blocks.gravel, 1), new ItemStack(
						Blocks.coal_block, 1));

		GameRegistry.addShapedRecipe(
				new ItemStack(ModBlocks.ActivatedCarbonite), "GGG", "GCG",
				"GGG", 'G', new ItemStack(Items.gunpowder, 1), 'C',
				new ItemStack(ModBlocks.coalAndGravelMix, 1));

		GameRegistry.addSmelting(new ItemStack(ModBlocks.ActivatedCarbonite),
				new ItemStack(ModItems.carbonDust, 18), 6.0f);

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.UnfiredBuckyBall),
				"CCC", "CSC", "CCC", 'C', new ItemStack(ModItems.carbonDust),
				'S', new ItemStack(Items.slime_ball));

		GameRegistry.addSmelting(new ItemStack(ModItems.UnfiredBuckyBall),
				new ItemStack(ModItems.BuckyBall), 4.0f);

		GameRegistry.addShapedRecipe(new ItemStack(
				ModItems.UnfiredCarbonNanoTube), "BSB", "BSB", "BSB", 'B',
				new ItemStack(ModItems.BuckyBall), 'S', new ItemStack(
						Items.slime_ball));

		GameRegistry.addSmelting(new ItemStack(ModItems.UnfiredCarbonNanoTube),
				new ItemStack(ModItems.CarbonNanoTube), 4.5f);

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.UnfiredCarbonMesh),
				"BSB", "SDS", "BSB", 'B', new ItemStack(ModItems.BuckyBall),
				'S', new ItemStack(ModItems.CarbonNanoTube), 'D',
				new ItemStack(ModItems.UnfiredBuckyBall));

		GameRegistry.addSmelting(new ItemStack(ModItems.UnfiredCarbonMesh),
				new ItemStack(ModItems.CarbonMesh), 8.0f);

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.UnfiredDiamond),
				"BMB", "MUM", "CMC", 'B', new ItemStack(ModItems.BuckyBall),
				'M', new ItemStack(ModItems.CarbonMesh), 'C', new ItemStack(
						ModItems.CarbonNanoTube), 'U', new ItemStack(
						ModItems.UnfiredCarbonMesh));

		GameRegistry.addSmelting(new ItemStack(ModItems.UnfiredDiamond),
				new ItemStack(Items.diamond, 32), 8f);

		/*
		 * Compressed Cobblestone
		 */
		addCompressionRecipe(ModBlocks.CompressedCobblestone,
				Blocks.cobblestone);
		addBulkCompressionRecipes(ModBlocks.CompressedCobblestone, DOUBLE,
				OCTUPLE);

		/*
		 * Compressed Dirt
		 */
		addCompressionRecipe(ModBlocks.CompressedDirt, Blocks.dirt);
		addBulkCompressionRecipes(ModBlocks.CompressedDirt, DOUBLE, OCTUPLE);

		/*
		 * Compressed Flint
		 */
		addCompressionRecipe(ModBlocks.CompressedFlint, Items.flint);
		addBulkCompressionRecipes(ModBlocks.CompressedFlint, DOUBLE, OCTUPLE);

		/*
		 * Compressed Coal Block
		 */
		addCompressionRecipe(ModBlocks.CompressedCoalBlock, Blocks.coal_block);
		addBulkCompressionRecipes(ModBlocks.CompressedCoalBlock, DOUBLE,
				QUADRUPLE);

		/*
		 * Compressed Gravel
		 */
		addCompressionRecipe(ModBlocks.CompressedGravel, Blocks.gravel);
		addBulkCompressionRecipes(ModBlocks.CompressedGravel, DOUBLE, OCTUPLE);

		/*
		 * Compressed Sand
		 */
		addCompressionRecipe(ModBlocks.CompressedSand, Blocks.sand);
		addBulkCompressionRecipes(ModBlocks.CompressedSand, DOUBLE, OCTUPLE);

		/*
		 * Compressed Red Sand
		 */
		addCompressionRecipe(ModBlocks.CompressedRedSand, Blocks.sand, 1);
		addBulkCompressionRecipes(ModBlocks.CompressedRedSand, DOUBLE, OCTUPLE);

	}

}
