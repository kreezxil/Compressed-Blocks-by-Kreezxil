package com.kreezxil.compressedblocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {


	public static void addCompressionRecipe(Block big, Block small) {
		GameRegistry.addShapelessRecipe(new ItemStack(Item.getItemFromBlock(small), 9), new Object[]{ new ItemStack(Item.getItemFromBlock(big)), });
		GameRegistry.addShapedRecipe(new ItemStack(Item.getItemFromBlock(big)), new Object[]{
				"XXX",
				"XXX",
				"XXX",
				'X', new ItemStack(Item.getItemFromBlock(small)),
		});
	}

	public static void addCompressionRecipe(Block big, Item small) {
		GameRegistry.addShapelessRecipe(new ItemStack(small, 9), new Object[]{ new ItemStack(Item.getItemFromBlock(big)), });
		GameRegistry.addShapedRecipe(new ItemStack(Item.getItemFromBlock(big)), new Object[]{
				"XXX",
				"XXX",
				"XXX",
				'X', new ItemStack(small),
		});

	}

	public static void addRecipes() {

		GameRegistry.addShapedRecipe(new ItemStack(Blocks.coal_block,1), new Object[]{
				"CCC",
				"CCC",
				"CCC",
				'C', new ItemStack(Items.coal,1,1),
		});

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.coalAndGravelMix,1), new Object[]{
				new ItemStack(Item.getItemFromBlock(Blocks.gravel),1),
				new ItemStack(Item.getItemFromBlock(Blocks.coal_block),1),
		});

		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.ActivatedCarbonite), new Object[]{
				"GGG",
				"GCG",
				"GGG",
				'G', new ItemStack(Items.gunpowder, 1),
				'C', new ItemStack(ModBlocks.coalAndGravelMix, 1),
		});

		GameRegistry.addSmelting(new ItemStack(ModBlocks.ActivatedCarbonite), new ItemStack(ModItems.carbonDust, 18), 6.0f );

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.UnfiredBuckyBall), new Object[]{
				"CCC",
				"CSC",
				"CCC",
				'C', new ItemStack(ModItems.carbonDust),
				'S', new ItemStack(Items.slime_ball),
		});

		GameRegistry.addSmelting(new ItemStack(ModItems.UnfiredBuckyBall), new ItemStack(ModItems.BuckyBall), 4.0f);

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.UnfiredCarbonNanoTube), new Object[]{
				"BSB",
				"BSB",
				"BSB",
				'B', new ItemStack(ModItems.BuckyBall),
				'S', new ItemStack(Items.slime_ball),
		});

		GameRegistry.addSmelting(new ItemStack(ModItems.UnfiredCarbonNanoTube), new ItemStack(ModItems.CarbonNanoTube), 4.5f);

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.UnfiredCarbonMesh), new Object[]{
				"BSB",
				"SDS",
				"BSB",
				'B', new ItemStack(ModItems.BuckyBall),
				'S', new ItemStack(ModItems.CarbonNanoTube),
				'D', new ItemStack(ModItems.UnfiredBuckyBall),
		});

		GameRegistry.addSmelting(new ItemStack(ModItems.UnfiredCarbonMesh), new ItemStack(ModItems.CarbonMesh), 8.0f);

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.UnfiredDiamond), new Object[]{
				"BMB",
				"MUM",
				"CMC",
				'B', new ItemStack(ModItems.BuckyBall),
				'M', new ItemStack(ModItems.CarbonMesh),
				'C', new ItemStack(ModItems.CarbonNanoTube),
				'U', new ItemStack(ModItems.UnfiredCarbonMesh),
		});

		GameRegistry.addSmelting(new ItemStack(ModItems.UnfiredDiamond), new ItemStack(Items.diamond,32), 8f);

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompressedFlint, 9, 6), new ItemStack(ModBlocks.CompressedFlint, 1, 7));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CompressedFlint, 1, 7),
				"XXX",
				"XXX",
				"XXX",
				'X', new ItemStack(ModBlocks.CompressedFlint, 1, 6)
				);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompressedFlint, 9, 5), new ItemStack(ModBlocks.CompressedFlint, 1, 6));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CompressedFlint, 1, 6),
				"XXX",
				"XXX",
				"XXX",
				'X', new ItemStack(ModBlocks.CompressedFlint, 1, 5)
				);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompressedFlint, 9, 4), new ItemStack(ModBlocks.CompressedFlint, 1, 5));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CompressedFlint, 1, 5),
				"XXX",
				"XXX",
				"XXX",
				'X', new ItemStack(ModBlocks.CompressedFlint, 1, 4)
				);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompressedFlint, 9, 3), new ItemStack(ModBlocks.CompressedFlint, 1, 4));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CompressedFlint, 1, 4),
				"XXX",
				"XXX",
				"XXX",
				'X', new ItemStack(ModBlocks.CompressedFlint, 1, 3)
				);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompressedFlint, 9, 2), new ItemStack(ModBlocks.CompressedFlint, 1, 3));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CompressedFlint, 1, 3),
				"XXX",
				"XXX",
				"XXX",
				'X', new ItemStack(ModBlocks.CompressedFlint, 1, 2)
				);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompressedFlint, 9, 1), new ItemStack(ModBlocks.CompressedFlint, 1, 2));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CompressedFlint, 1, 2),
				"XXX",
				"XXX",
				"XXX",
				'X', new ItemStack(ModBlocks.CompressedFlint, 1, 1)
				);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.CompressedFlint, 9, 0), new ItemStack(ModBlocks.CompressedFlint, 1, 1));
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.CompressedFlint, 1, 1),
				"XXX",
				"XXX",
				"XXX",
				'X', new ItemStack(ModBlocks.CompressedFlint, 1, 0)
				);
		addCompressionRecipe(ModBlocks.CompressedFlint, Items.flint);

		addCompressionRecipe(ModBlocks.OctupleCompressedCobblestone,ModBlocks.SeptupleCompressedCobblestone);
		addCompressionRecipe(ModBlocks.SeptupleCompressedCobblestone,ModBlocks.SextupleCompressedCobblestone);
		addCompressionRecipe(ModBlocks.SextupleCompressedCobblestone,ModBlocks.QuintupleCompressedCobblestone);
		addCompressionRecipe(ModBlocks.QuintupleCompressedCobblestone,ModBlocks.QuadrupleCompressedCobblestone);
		addCompressionRecipe(ModBlocks.QuadrupleCompressedCobblestone,ModBlocks.TripleCompressedCobblestone);
		addCompressionRecipe(ModBlocks.TripleCompressedCobblestone,ModBlocks.DoubleCompressedCobblestone);
		addCompressionRecipe(ModBlocks.DoubleCompressedCobblestone,ModBlocks.CompressedCobblestone);
		addCompressionRecipe(ModBlocks.CompressedCobblestone,Blocks.cobblestone);

		addCompressionRecipe(ModBlocks.OctupleCompressedDirt,ModBlocks.SeptupleCompressedDirt);
		addCompressionRecipe(ModBlocks.SeptupleCompressedDirt,ModBlocks.SextupleCompressedDirt);
		addCompressionRecipe(ModBlocks.SextupleCompressedDirt,ModBlocks.QuintupleCompressedDirt);
		addCompressionRecipe(ModBlocks.QuintupleCompressedDirt,ModBlocks.QuadrupleCompressedDirt);
		addCompressionRecipe(ModBlocks.QuadrupleCompressedDirt,ModBlocks.TripleCompressedDirt);
		addCompressionRecipe(ModBlocks.TripleCompressedDirt,ModBlocks.DoubleCompressedDirt);
		addCompressionRecipe(ModBlocks.DoubleCompressedDirt,ModBlocks.CompressedDirt);
		addCompressionRecipe(ModBlocks.CompressedDirt,Blocks.dirt);

		addCompressionRecipe(ModBlocks.QuadrupleCompressedCoalBlock,ModBlocks.TripleCompressedCoalBlock);
		addCompressionRecipe(ModBlocks.TripleCompressedCoalBlock,ModBlocks.DoubleCompressedCoalBlock);
		addCompressionRecipe(ModBlocks.DoubleCompressedCoalBlock,ModBlocks.CompressedCoalBlock);
		addCompressionRecipe(ModBlocks.CompressedCoalBlock,Blocks.coal_block);

		addCompressionRecipe(ModBlocks.OctupleCompressedGravel,ModBlocks.SeptupleCompressedGravel);
		addCompressionRecipe(ModBlocks.SeptupleCompressedGravel,ModBlocks.SextupleCompressedGravel);
		addCompressionRecipe(ModBlocks.SextupleCompressedGravel,ModBlocks.QuintupleCompressedGravel);
		addCompressionRecipe(ModBlocks.QuintupleCompressedGravel,ModBlocks.QuadrupleCompressedGravel);
		addCompressionRecipe(ModBlocks.QuadrupleCompressedGravel,ModBlocks.TripleCompressedGravel);
		addCompressionRecipe(ModBlocks.TripleCompressedGravel,ModBlocks.DoubleCompressedGravel);
		addCompressionRecipe(ModBlocks.DoubleCompressedGravel,ModBlocks.CompressedGravel);
		addCompressionRecipe(ModBlocks.CompressedGravel,Blocks.gravel);

		addCompressionRecipe(ModBlocks.OctupleCompressedSand,ModBlocks.SeptupleCompressedSand);
		addCompressionRecipe(ModBlocks.SeptupleCompressedSand,ModBlocks.SextupleCompressedSand);
		addCompressionRecipe(ModBlocks.SextupleCompressedSand,ModBlocks.QuintupleCompressedSand);
		addCompressionRecipe(ModBlocks.QuintupleCompressedSand,ModBlocks.QuadrupleCompressedSand);
		addCompressionRecipe(ModBlocks.QuadrupleCompressedSand,ModBlocks.TripleCompressedSand);
		addCompressionRecipe(ModBlocks.TripleCompressedSand,ModBlocks.DoubleCompressedSand);
		addCompressionRecipe(ModBlocks.DoubleCompressedSand,ModBlocks.CompressedSand);
		addCompressionRecipe(ModBlocks.CompressedSand,Blocks.sand);

	}
}
