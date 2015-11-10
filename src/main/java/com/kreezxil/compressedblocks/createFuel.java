package com.kreezxil.compressedblocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class createFuel implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		Item item = fuel.getItem();
		int id = 0;
		
		if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) 
			id = Block.getIdFromBlock(Block.getBlockFromItem(item));
		else 
			id = Item.getIdFromItem(item);
		
		if(id==Block.getIdFromBlock(ModBlocks.CompressedCoalBlock))
			return 1600;
		else if(id==Block.getIdFromBlock(ModBlocks.DoubleCompressedCoalBlock))
			return 16000;
		else if(id==Block.getIdFromBlock(ModBlocks.TripleCompressedCoalBlock))
			return 1600000;
		else if(id==Block.getIdFromBlock(ModBlocks.QuadrupleCompressedCoalBlock))
			return 16000000;
		else
			return 0;
	}

}
