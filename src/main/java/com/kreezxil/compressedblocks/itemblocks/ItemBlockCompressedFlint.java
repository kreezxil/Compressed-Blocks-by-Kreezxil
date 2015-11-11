package com.kreezxil.compressedblocks.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCompressedFlint extends ItemBlock {

	public ItemBlockCompressedFlint(Block block) {
		super(block);
		this.setMaxDamage(7);
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName(stack) + "." + stack.getItemDamage();
	}

	@Override
	public boolean showDurabilityBar(ItemStack stack)
	{
		return false;
	}
}