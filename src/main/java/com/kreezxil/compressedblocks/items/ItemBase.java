package com.kreezxil.compressedblocks.items;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.IHasModel;
import com.kreezxil.compressedblocks.Init.InitItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(CompressedBlocks.MODID + "." + name);
		setRegistryName(name);
		InitItems.ITEMS.add(this);
		setCreativeTab(CompressedBlocks.itemsTab);
		}

	public void registerItemModel() {
		CompressedBlocks.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public void registerModels() {
		CompressedBlocks.proxy.registerItemRenderer(this, 0, "inventory");
	}

}