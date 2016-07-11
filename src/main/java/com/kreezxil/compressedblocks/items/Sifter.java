package com.kreezxil.compressedblocks.items;

import net.minecraft.item.Item;

import com.kreezxil.compressedblocks.CompressedBlocks;

public class Sifter extends Item {

	// ultimately this will be component used in creation of the sifter tool
	// probably it'll be called the sifter net or scoop

	public Sifter(String name) {
		this.setUnlocalizedName(name);
		this.setCreativeTab(CompressedBlocks.itemsTab);
	}
}
