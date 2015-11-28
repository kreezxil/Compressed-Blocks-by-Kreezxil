package com.kreezxil.compressedblocks;

import com.kreezxil.compressedblocks.blocks.ActivatedCarbonite;
import com.kreezxil.compressedblocks.blocks.coalAndGravelMix;
import com.kreezxil.compressedblocks.blocks.compressed.Clay;
import com.kreezxil.compressedblocks.blocks.compressed.CoalBlock;
import com.kreezxil.compressedblocks.blocks.compressed.Cobblestone;
import com.kreezxil.compressedblocks.blocks.compressed.Diamond;
import com.kreezxil.compressedblocks.blocks.compressed.Dirt;
import com.kreezxil.compressedblocks.blocks.compressed.Emerald;
import com.kreezxil.compressedblocks.blocks.compressed.End_Stone;
import com.kreezxil.compressedblocks.blocks.compressed.Ender_Pearl;
import com.kreezxil.compressedblocks.blocks.compressed.Flint;
import com.kreezxil.compressedblocks.blocks.compressed.Gold;
import com.kreezxil.compressedblocks.blocks.compressed.Gravel;
import com.kreezxil.compressedblocks.blocks.compressed.Iron;
import com.kreezxil.compressedblocks.blocks.compressed.Lapis;
import com.kreezxil.compressedblocks.blocks.compressed.Netherrack;
import com.kreezxil.compressedblocks.blocks.compressed.Obsidian;
import com.kreezxil.compressedblocks.blocks.compressed.RedSand;
import com.kreezxil.compressedblocks.blocks.compressed.Redstone;
import com.kreezxil.compressedblocks.blocks.compressed.Sand;
import com.kreezxil.compressedblocks.blocks.compressed.TNT;
import com.kreezxil.compressedblocks.itemBlocks.ItemBlockMeta;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
	public static Block CompressedClay = new Clay();
	public static Block CompressedDiamond = new Diamond();
	public static Block CompressedEmerald = new Emerald();
	public static Block CompressedEnd_Stone = new End_Stone();
	public static Block CompressedEnder_Pearl = new Ender_Pearl();
	public static Block CompressedGold = new Gold();
	public static Block CompressedIron = new Iron();
	public static Block CompressedLapis = new Lapis();
	public static Block CompressedNetherrack = new Netherrack();
	public static Block CompressedObsidian = new Obsidian();
	public static Block CompressedRedstone = new Redstone();
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
		regCompressed(CompressedEnder_Pearl);
		regCompressed(CompressedIron);
		regCompressed(CompressedLapis);
		regCompressed(CompressedNetherrack);
		regCompressed(CompressedRedstone);
		regCompressed(CompressedObsidian);
		regCompressed(CompressedDiamond);
		regCompressed(CompressedEmerald);
		regCompressed(CompressedEnd_Stone);
		regCompressed(CompressedGold);
		regCompressed(CompressedClay);
		reg(CompressedTNT);
		reg(coalAndGravelMix);

		regFuel();

	}
}
