package com.kreezxil.compressedblocks.blocks;

import java.util.Random;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class coalAndGravelMix extends Block {

	public coalAndGravelMix(String unlocalizedName, Material materialIn, float hardness, float resistance) {
		super(materialIn);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CompressedBlocks.blocksTab);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setHarvestLevel("pickaxe", 0);
	}
	
	public coalAndGravelMix(String name, float hardness, float resistance) {
		this(name, Material.rock, hardness, resistance);
	}
	
	public coalAndGravelMix(String name) {
		this(name, 2f, 10f);
	}

	public int quantityDropped(Random par1Random){
		return 3;
	}

	public Item getItemDropped(IBlockState state, Random par2Random, int par3){
		return ModItems.carbonDust;
	}

}
