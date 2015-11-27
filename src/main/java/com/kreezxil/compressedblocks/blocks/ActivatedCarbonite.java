package com.kreezxil.compressedblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.kreezxil.compressedblocks.CompressedBlocks;

public class ActivatedCarbonite extends Block {

	public ActivatedCarbonite(String unlocalizedName, Material materialIn,
			float hardness, float resistance) {
		super(materialIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CompressedBlocks.blocksTab);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setHarvestLevel("pickaxe", 0);
	}

	public ActivatedCarbonite(String name, float hardness, float resistance) {
		this(name, Material.rock, hardness, resistance);
	}

	public ActivatedCarbonite(String name) {
		this(name, 2f, 10f);
	}

}
