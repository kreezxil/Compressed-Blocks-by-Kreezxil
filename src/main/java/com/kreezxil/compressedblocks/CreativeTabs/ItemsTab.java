package com.kreezxil.compressedblocks.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.kreezxil.compressedblocks.ModItems;

public class ItemsTab extends CreativeTabs {

	public ItemsTab(String label) {
		super(label);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return ModItems.CarbonMesh;
	}

}
