package com.kreezxil.compressedblocks.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.kreezxil.compressedblocks.ModBlocks;

public class BlocksTab extends CreativeTabs {

	public BlocksTab(String label) {
		super(label);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(ModBlocks.coalAndGravelMix));
	}

}
