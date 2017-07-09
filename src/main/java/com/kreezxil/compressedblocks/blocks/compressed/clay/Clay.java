package com.kreezxil.compressedblocks.blocks.compressed.clay;

import java.util.List;
import java.util.Random;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.ModBlocks;
import com.kreezxil.compressedblocks.blocks.CompressedBlock;
import com.kreezxil.compressedblocks.itemBlocks.IMetaBlockName;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class Clay extends CompressedBlock {
	// previously there was no implements
	public static String harvestTool = "shovel";
	public static int MAXTIER = 8;
	public static String UnlocalizedName = "CompressedClay";
	public static float baseHardness = 4f;
	public static float hardnessFactor = 1.75f;
	public static float explosionFactor = 2f;
	public static int WOOD = 0;
	public static int STONE = 1;
	public static int IRON = 2;
	public static int DIAMOND = 3;
	public static int[] harvestLevel = { WOOD, WOOD, WOOD, STONE, STONE, STONE,
			IRON, IRON };
	public static String[] tiers = { "", "Double", "Triple", "Quadruple",
			"Quintuple", "Sextuple", "Septuple", "Octuple" };

	
	public Clay() {
		super(Material.ROCK);
		this.setUnlocalizedName(UnlocalizedName);
		this.setCreativeTab(CompressedBlocks.blocksTab);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random par2Random, int par3) {
		return Item.getItemFromBlock(Blocks.CLAY);
	}

}