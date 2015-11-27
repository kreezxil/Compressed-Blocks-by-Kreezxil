package com.kreezxil.compressedblocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kreezxil.compressedblocks.blocks.ActivatedCarbonite;
import com.kreezxil.compressedblocks.blocks.coalAndGravelMix;
import com.kreezxil.compressedblocks.blocks.compressed.CoalBlock;
import com.kreezxil.compressedblocks.blocks.compressed.Cobblestone;
import com.kreezxil.compressedblocks.blocks.compressed.Dirt;
import com.kreezxil.compressedblocks.blocks.compressed.Flint;
import com.kreezxil.compressedblocks.blocks.compressed.Gravel;
import com.kreezxil.compressedblocks.blocks.compressed.RedSand;
import com.kreezxil.compressedblocks.blocks.compressed.Sand;
import com.kreezxil.compressedblocks.blocks.compressed.TNT;
import com.kreezxil.compressedblocks.itemBlocks.ItemBlockMeta;

public final class ModBlocks {

	/*
	 * Compressed Blocks Declarations
	 */
	public static Block CompressedCoalBlock = new CoalBlock();
	public static Block CompressedFlint = new Flint();
	public static Block CompressedCobblestone = new Cobblestone();
	public static Block CompressedDirt = new Dirt();
	public static Block CompressedGravel = new Gravel();
	public static Block CompressedRedSand = new RedSand();
	public static Block CompressedSand = new Sand();
	public static Block CompressedTNT = new TNT("CompressedTNT");

	/*
	 * Uncompressed Blocks Declarations
	 */
	public static Block ActivatedCarbonite = new ActivatedCarbonite(
			"ActivatedCarbonite");
	public static Block coalAndGravelMix = new coalAndGravelMix(
			"coalAndGravelMix");

	public static void reg(Block block) {
		GameRegistry.registerBlock(block,
				block.getUnlocalizedName().substring(5));
	}

	public static void regCompressed(Block block) {
		GameRegistry.registerBlock(block, ItemBlockMeta.class, block
				.getUnlocalizedName().substring(5));
	}

	public static void regFuel() {
		GameRegistry.registerFuelHandler(new createFuel());
	}

	public static void createBlocks() {

		reg(ActivatedCarbonite);
		regCompressed(CompressedCoalBlock);
		regCompressed(CompressedCobblestone);
		regCompressed(CompressedDirt);
		regCompressed(CompressedFlint);
		regCompressed(CompressedGravel);
		regCompressed(CompressedRedSand);
		regCompressed(CompressedSand);
		reg(CompressedTNT);
		reg(coalAndGravelMix);

		regFuel();

	}
}
