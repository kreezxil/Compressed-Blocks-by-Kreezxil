package com.kreezxil.compressedblocks;

import com.kreezxil.compressedblocks.blocks.ActivatedCarbonite;
import com.kreezxil.compressedblocks.blocks.CompressedBlock;
import com.kreezxil.compressedblocks.blocks.FourTierCompressedBlock;
import com.kreezxil.compressedblocks.blocks.coalAndGravelMix;
import com.kreezxil.compressedblocks.itemBlocks.ItemBlockMeta;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	/*
	 * Compressed Blocks Declarations
	 */
	public static CompressedBlock CompressedCoalBlock;
	public static Block CompressedFlint;
	public static Block CompressedCobblestone;
	public static Block CompressedDirt;
	public static Block CompressedGravel;
	public static Block CompressedRedSand;
	public static Block CompressedSand;
	public static Block CompressedClay;
	public static Block CompressedDiamond;
	public static Block CompressedEmerald;
	public static Block CompressedEnd_Stone;
	public static Block CompressedEnder_Pearl;
	public static Block CompressedGold;
	public static Block CompressedIron;
	public static Block CompressedLapis;
	public static Block CompressedNetherrack;
	public static Block CompressedObsidian;
	public static Block CompressedRedstone;

	/*
	 * Uncompressed Blocks Declarations
	 */
	public static Block ActivatedCarbonite = new ActivatedCarbonite("ActivatedCarbonite");
	public static Block coalAndGravelMix = new coalAndGravelMix("coalAndGravelMix");

	public static void reg(Block block) {
		GameRegistry.register(block.setRegistryName(block.getUnlocalizedName().substring(5)));
	}

	public static void regCompressed(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlockMeta(block).setRegistryName(block.getRegistryName()));
	}

	public static void registerItemBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlockMeta(block).setRegistryName(block.getRegistryName()));

	}

	public static void regFuel() {
		GameRegistry.registerFuelHandler(new createFuel());
	}

	public static void createBlocks() {
		regCompressed(CompressedCoalBlock = new FourTierCompressedBlock(Material.ROCK, "pickaxe", 4,
				"CompressedCoalBlock", 2, 0.3f, 0.175f, Item.getItemFromBlock(Blocks.COAL_BLOCK), CompressedBlock.STONE,
				CompressedBlock.IRON, CompressedBlock.IRON, CompressedBlock.IRON));
		// regCompressed(CompressedFlint = new Flint());
		// regCompressed(CompressedCobblestone = new Cobblestone());
		// regCompressed(CompressedDirt = new Dirt());
		// regCompressed(CompressedGravel = new Gravel());
		// regCompressed(CompressedRedSand = new RedSand());
		// regCompressed(CompressedSand = new Sand());
		// regCompressed(CompressedClay = new Clay());
		// regCompressed(CompressedDiamond = new Diamond());
		// regCompressed(CompressedEmerald = new Emerald());
		// regCompressed(CompressedEnd_Stone = new End_Stone());
		// regCompressed(CompressedEnder_Pearl = new Ender_Pearl());
		// regCompressed(CompressedGold = new Gold());
		// regCompressed(CompressedIron = new Iron());
		// regCompressed(CompressedLapis = new Lapis());
		// regCompressed(CompressedNetherrack = new Netherrack());
		// regCompressed(CompressedObsidian = new Obsidian());
		// regCompressed(CompressedRedstone = new Redstone());
		reg(coalAndGravelMix);
		reg(ActivatedCarbonite);

		regFuel();

	}
}
