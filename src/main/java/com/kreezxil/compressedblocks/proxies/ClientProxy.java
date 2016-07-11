package com.kreezxil.compressedblocks.proxies;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.kreezxil.compressedblocks.client.render.blocks.BlockRenderRegister;
import com.kreezxil.compressedblocks.client.render.items.ItemRenderRegister;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);

		BlockRenderRegister.preInit();

	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		ItemRenderRegister.registerItemRenderer();
		BlockRenderRegister.registerBlockRenderer();

	}

}
