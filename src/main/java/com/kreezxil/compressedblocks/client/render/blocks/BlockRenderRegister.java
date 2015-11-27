package com.kreezxil.compressedblocks.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.ModBlocks;

public class BlockRenderRegister {

	public static String modid = CompressedBlocks.MODID;
	public static String[] tiers = { "", "Double", "Triple", "Quadruple",
			"Quintuple", "Sextuple", "Septuple", "Octuple" };

	public static void blockReg(Block block) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						Item.getItemFromBlock(block),
						0,
						new ModelResourceLocation(modid + ":"
								+ block.getUnlocalizedName().substring(5),
								"inventory"));
	}

	public static void blockReg(Block block, int state, String name) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						Item.getItemFromBlock(block),
						state,
						new ModelResourceLocation(modid + ":" + name,
								"inventory"));
	}

	public static void stateReg(Block block, int maxTier) {
		for (int state = 0; state < maxTier; state++) {
			blockReg(block, state, tiers[state]
					+ block.getUnlocalizedName().substring(5));
		}
	}

	public static void registerBlockRenderer() {
		blockReg(ModBlocks.ActivatedCarbonite);
		blockReg(ModBlocks.coalAndGravelMix);
		blockReg(ModBlocks.CompressedTNT);

		stateReg(ModBlocks.CompressedCobblestone, 8);
		stateReg(ModBlocks.CompressedDirt, 8);
		stateReg(ModBlocks.CompressedGravel, 8);
		stateReg(ModBlocks.CompressedSand, 8);
		stateReg(ModBlocks.CompressedRedSand, 8);
		stateReg(ModBlocks.CompressedFlint, 8);
		stateReg(ModBlocks.CompressedCoalBlock, 4);

	}

	public static void ovenRack(Block block, int maxTier) {
		String[] names = new String[maxTier];
		for (int i = 0; i < maxTier; i++) {
			names[i] = modid + ":" + tiers[i]
					+ block.getUnlocalizedName().substring(5);
		}
		ModelBakery.addVariantName(Item.getItemFromBlock(block), names);
	}

	public static void preInit() {

		ovenRack(ModBlocks.CompressedCobblestone, 8);
		ovenRack(ModBlocks.CompressedDirt, 8);
		ovenRack(ModBlocks.CompressedGravel, 8);
		ovenRack(ModBlocks.CompressedSand, 8);
		ovenRack(ModBlocks.CompressedRedSand, 8);
		ovenRack(ModBlocks.CompressedFlint, 8);
		ovenRack(ModBlocks.CompressedCoalBlock, 4);

	}
}
