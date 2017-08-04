package com.kreezxil.compressedblocks;

import com.kreezxil.compressedblocks.CreativeTabs.BlocksTab;
import com.kreezxil.compressedblocks.CreativeTabs.ItemsTab;
import com.kreezxil.compressedblocks.proxies.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CompressedBlocks.MODID, version = CompressedBlocks.VERSION, name = CompressedBlocks.MODNAME)
public class CompressedBlocks {
	public static final String MODNAME = "Compressed Blocks by Kreezxil";
	public static final String MODID = "kreezxilscompressedblocks";
	public static final String VERSION = "1.12.1-4.1.0.1578";

	public static CreativeTabs itemsTab = new ItemsTab("itemsTab");
	public static CreativeTabs blocksTab = new BlocksTab("blocksTab");

	@SidedProxy(clientSide = "com.kreezxil.compressedblocks.proxies.ClientProxy", serverSide = "com.kreezxil.compressedblocks.proxies.ServerProxy")
	public static CommonProxy proxy;

	@Instance
	public static CompressedBlocks instance = new CompressedBlocks();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		this.proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		this.proxy.init(event);
	}

}
