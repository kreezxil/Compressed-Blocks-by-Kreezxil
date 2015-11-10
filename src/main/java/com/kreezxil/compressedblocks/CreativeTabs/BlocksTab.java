package com.kreezxil.compressedblocks.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.kreezxil.compressedblocks.ModBlocks;

public class BlocksTab extends CreativeTabs {

	public BlocksTab(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(ModBlocks.coalAndGravelMix);
	}

	
}
