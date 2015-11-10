package com.kreezxil.compressedblocks.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.kreezxil.compressedblocks.CompressedBlocks;

public class CompressedGravel  extends Block {


	public CompressedGravel(String unlocalizedName, Material materialIn, float hardness, float resistance) {
		super(materialIn);
		// TODO Auto-generated constructor stub
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CompressedBlocks.blocksTab);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setHarvestLevel("shovel", 0);
	}
	
	public CompressedGravel(String name, float hardness, float resistance) {
		this(name, Material.rock, hardness, resistance);
	}
	
	public CompressedGravel(String name) {
		this(name, 6f, 30f);
	}

	@Override
	public int quantityDropped(Random par1Random){
		return 9;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random par2Random, int fortune){
		Random rn = new Random();
		int flintChance = rn.nextInt(10);
		
		if(fortune > 0)
			return Item.getItemFromBlock(Blocks.gravel);
		else if (flintChance<=1)
			return Items.flint;
		else
			return Item.getItemFromBlock(Blocks.gravel);
	}


}
