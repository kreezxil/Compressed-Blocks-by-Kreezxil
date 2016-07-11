package com.kreezxil.compressedblocks.proxies;

import com.kreezxil.compressedblocks.ModBlocks;
import com.kreezxil.compressedblocks.ModItems;
import com.kreezxil.compressedblocks.ModRecipes;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		ModItems.createItems();
		ModBlocks.createBlocks();
		//ModRecipes.addRecipes();
	}

	public void init(FMLInitializationEvent e) {

	}

}
