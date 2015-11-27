package com.kreezxil.compressedblocks.items;

import net.minecraft.item.Item;

import com.kreezxil.compressedblocks.CompressedBlocks;

public class NanoGrinder extends Item {

	// once I get into tools, this will become a better alternative to smelting
	// the coal and gravel mix block

	public NanoGrinder(String name) {
		this.setUnlocalizedName(name);
		this.setCreativeTab(CompressedBlocks.itemsTab);
	}
}
