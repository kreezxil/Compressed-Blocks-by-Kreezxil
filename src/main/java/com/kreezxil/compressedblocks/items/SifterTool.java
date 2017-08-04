package com.kreezxil.compressedblocks.items;

import net.minecraft.item.Item;

import com.kreezxil.compressedblocks.CompressedBlocks;

public class SifterTool extends Item {

	// eventually this will be handheld sifting tool that one will use on items
	// such as sand and dirt to extract component parts, as an example, red sand
	// when used with this tool will yield regular sand and red dye, on a grass
	// block it might yield dirt and grass seed

	public SifterTool(String name) {
		this.setUnlocalizedName(name);
		this.setCreativeTab(CompressedBlocks.itemsTab);
	}
}
