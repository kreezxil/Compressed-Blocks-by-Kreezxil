package com.kreezxil.compressedblocks.blocks;

import java.util.Random;

import com.kreezxil.compressedblocks.CompressedBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CompressedFlint extends Block {

	public CompressedFlint() {
		super(Material.rock);
		this.setUnlocalizedName("CompressedFlint");
		this.setCreativeTab(CompressedBlocks.blocksTab);
		this.setHardness(10f);
		this.setResistance(2f);
		this.setHarvestLevel("pickaxe",0);
	}

	@Override
	public int quantityDropped(Random par1Random){
		return 9;
	}
	@Override
	public Item getItemDropped(IBlockState state, Random par2Random, int par3){
		return Items.flint;
	}
}
