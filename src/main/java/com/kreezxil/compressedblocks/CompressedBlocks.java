package com.kreezxil.compressedblocks;

import com.kreezxil.compressedblocks.CreativeTabs.BlocksTab;
import com.kreezxil.compressedblocks.CreativeTabs.ItemsTab;
import com.kreezxil.compressedblocks.Init.InitRecipes;
import com.kreezxil.compressedblocks.proxies.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CompressedBlocks.MODID, version = CompressedBlocks.VERSION, name = CompressedBlocks.MODNAME)
public class CompressedBlocks {
	public static final String MODNAME = "Compressed Blocks";
	public static final String MODID = "compressedblocks";
	public static final String VERSION = "@version@";

	public static CreativeTabs itemsTab = new ItemsTab("itemsTab");
	public static CreativeTabs blocksTab = new BlocksTab("blocksTab");

	@SidedProxy(clientSide = "com.kreezxil.compressedblocks.proxies.ClientProxy", serverSide = "com.kreezxil.compressedblocks.proxies.CommonProxy")
	public static CommonProxy proxy;

	@Instance
	public static CompressedBlocks instance = new CompressedBlocks();

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		InitRecipes.init();

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
