package com.kreezxil.compressedblocks.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.kreezxil.compressedblocks.ModItems;

public class ItemsTab extends CreativeTabs {

	public ItemsTab(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ModItems.CarbonMesh;
	}

}
