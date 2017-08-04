package com.kreezxil.compressedblocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class createFuel implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == Item
				.getItemFromBlock(ModBlocks.CompressedCoalBlock)) {
			switch (fuel.getItemDamage()) {
			case 1:
				return 16000;
			case 2:
				return 160000;
			case 3:
				return 1600000;
			default:
				return 1600;
			}
		} else {
			return 0;
		}
	}
}
