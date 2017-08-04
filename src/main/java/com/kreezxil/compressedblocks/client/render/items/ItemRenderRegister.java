package com.kreezxil.compressedblocks.client.render.items;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;

public final class ItemRenderRegister {
	
	public static String modid = CompressedBlocks.MODID;
	
	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerItemRenderer() {
		reg(ModItems.carbonDust);
		reg(ModItems.BuckyBall);
		reg(ModItems.CarbonMesh);
		reg(ModItems.CarbonNanoTube);
		reg(ModItems.UnfiredCarbonNanoTube);
		reg(ModItems.UnfiredBuckyBall);
		reg(ModItems.UnfiredCarbonMesh);
		reg(ModItems.UnfiredDiamond);
	}
}
