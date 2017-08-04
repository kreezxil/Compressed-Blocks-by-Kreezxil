package com.kreezxil.compressedblocks.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

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
						new net.minecraft.client.renderer.block.model.ModelResourceLocation(modid + ":"
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
						new net.minecraft.client.renderer.block.model.ModelResourceLocation(modid + ":" + name,
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
		stateReg(ModBlocks.CompressedEnder_Pearl,8);
		stateReg(ModBlocks.CompressedIron,8);
		stateReg(ModBlocks.CompressedLapis,8);
		stateReg(ModBlocks.CompressedNetherrack,8);
		stateReg(ModBlocks.CompressedDiamond,8);
		stateReg(ModBlocks.CompressedEmerald,8);
		stateReg(ModBlocks.CompressedEnd_Stone,8);
		stateReg(ModBlocks.CompressedGold,8);
		stateReg(ModBlocks.CompressedClay,8);
		stateReg(ModBlocks.CompressedObsidian,8);
		stateReg(ModBlocks.CompressedRedstone,8);
	}

	public static void ovenRack(Block block, int maxTier) {
		for (int i = 0; i < maxTier; i++) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), i, new net.minecraft.client.renderer.block.model.ModelResourceLocation(block.getRegistryName(),"inventory"));
		}
	}

	public static void preInit() {

		ovenRack(ModBlocks.CompressedCobblestone, 8);
		ovenRack(ModBlocks.CompressedDirt, 8);
		ovenRack(ModBlocks.CompressedGravel, 8);
		ovenRack(ModBlocks.CompressedSand, 8);
		ovenRack(ModBlocks.CompressedRedSand, 8);
		ovenRack(ModBlocks.CompressedFlint, 8);
		ovenRack(ModBlocks.CompressedCoalBlock, 4);
		ovenRack(ModBlocks.CompressedEnder_Pearl,8);
		ovenRack(ModBlocks.CompressedIron,8);
		ovenRack(ModBlocks.CompressedLapis,8);
		ovenRack(ModBlocks.CompressedNetherrack,8);
		ovenRack(ModBlocks.CompressedDiamond,8);
		ovenRack(ModBlocks.CompressedEmerald,8);
		ovenRack(ModBlocks.CompressedEnd_Stone,8);
		ovenRack(ModBlocks.CompressedGold,8);
		ovenRack(ModBlocks.CompressedClay,8);
		ovenRack(ModBlocks.CompressedObsidian,8);
		ovenRack(ModBlocks.CompressedRedstone,8);
	}
}
