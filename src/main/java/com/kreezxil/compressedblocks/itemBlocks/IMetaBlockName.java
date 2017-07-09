package com.kreezxil.compressedblocks.itemBlocks;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public interface IMetaBlockName {
	String getSpecialName(ItemStack stack);

	void getSubBlocks(Item itemIn, CreativeTabs tab, List list);
}
