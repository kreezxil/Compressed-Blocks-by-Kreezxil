package com.kreezxil.compressedblocks.itemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMeta extends ItemBlock {

	public ItemBlockMeta(Block block) {
		super(block);
		if (!(block instanceof IMetaBlockName)) {
			throw new IllegalArgumentException(
					String.format(
							"The given Block %s is not an instance of ISpecialBlockName!",
							block.getUnlocalizedName()));
		}
		this.setMaxDamage(0); // was previously 7
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int damage) {
		return damage;
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		// return super.getUnlocalizedName(stack) + "." + stack.getItemDamage();
		return super.getUnlocalizedName(stack) + "."
				+ ((IMetaBlockName) this.block).getSpecialName(stack);

	}

	// @Override
	// public boolean showDurabilityBar(ItemStack stack) {
	// return false;
	// }
}
