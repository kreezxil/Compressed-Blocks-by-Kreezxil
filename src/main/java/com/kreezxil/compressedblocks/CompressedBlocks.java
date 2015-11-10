package com.kreezxil.compressedblocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.kreezxil.compressedblocks.CreativeTabs.BlocksTab;
import com.kreezxil.compressedblocks.CreativeTabs.ItemsTab;

@Mod(modid = CompressedBlocks.MODID, version = CompressedBlocks.VERSION)
public class CompressedBlocks {
    public static final String MODID = "kreezxilscompressedblocks";
    public static final String VERSION = "2.0.1";
    
    public static CreativeTabs itemsTab = new ItemsTab("itemsTab");
    public static CreativeTabs blocksTab = new BlocksTab("blocksTab");
    
    @SidedProxy(clientSide="com.kreezxil.compressedblocks.ClientProxy", serverSide="com.kreezxil.compressedblocks.ServerProxy")
    public static CommonProxy proxy;
    
    @Instance
    public static CompressedBlocks instance = new CompressedBlocks(); 
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	this.proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	this.proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	this.proxy.postInit(event);
    }

}
