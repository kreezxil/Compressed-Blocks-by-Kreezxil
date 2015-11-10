package com.kreezxil.compressedblocks.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.ModBlocks;

public class BlockRenderRegister {

	public static String modid = CompressedBlocks.MODID;

	public static void blockReg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),0,new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5),"inventory"));
	}

	public static void registerBlockRenderer() {
		blockReg(ModBlocks.ActivatedCarbonite);
		blockReg(ModBlocks.coalAndGravelMix);
		blockReg(ModBlocks.CompressedCobblestone);
		blockReg(ModBlocks.CompressedCoalBlock);
		blockReg(ModBlocks.CompressedDirt);
		blockReg(ModBlocks.CompressedFlint);
		blockReg(ModBlocks.CompressedGravel);
		blockReg(ModBlocks.CompressedSand);
		blockReg(ModBlocks.CompressedTNT);
		blockReg(ModBlocks.DoubleCompressedCoalBlock);
		blockReg(ModBlocks.DoubleCompressedCobblestone);
		blockReg(ModBlocks.DoubleCompressedDirt);
		blockReg(ModBlocks.DoubleCompressedFlint);
		blockReg(ModBlocks.DoubleCompressedGravel);
		blockReg(ModBlocks.DoubleCompressedSand);
		blockReg(ModBlocks.OctupleCompressedCobblestone);
		blockReg(ModBlocks.OctupleCompressedDirt);
		blockReg(ModBlocks.OctupleCompressedFlint);
		blockReg(ModBlocks.OctupleCompressedGravel);
		blockReg(ModBlocks.OctupleCompressedSand);
		blockReg(ModBlocks.QuadrupleCompressedCoalBlock);
		blockReg(ModBlocks.QuadrupleCompressedCobblestone);
		blockReg(ModBlocks.QuadrupleCompressedDirt);
		blockReg(ModBlocks.QuadrupleCompressedFlint);
		blockReg(ModBlocks.QuadrupleCompressedGravel);
		blockReg(ModBlocks.QuadrupleCompressedSand);
		blockReg(ModBlocks.QuintupleCompressedCobblestone);
		blockReg(ModBlocks.QuintupleCompressedDirt);
		blockReg(ModBlocks.QuintupleCompressedFlint);
		blockReg(ModBlocks.QuintupleCompressedGravel);
		blockReg(ModBlocks.QuintupleCompressedSand);
		blockReg(ModBlocks.SeptupleCompressedCobblestone);
		blockReg(ModBlocks.SeptupleCompressedDirt);
		blockReg(ModBlocks.SeptupleCompressedFlint);
		blockReg(ModBlocks.SeptupleCompressedGravel);
		blockReg(ModBlocks.SeptupleCompressedSand);
		blockReg(ModBlocks.SextupleCompressedCobblestone);
		blockReg(ModBlocks.SextupleCompressedDirt);
		blockReg(ModBlocks.SextupleCompressedFlint);
		blockReg(ModBlocks.SextupleCompressedGravel);
		blockReg(ModBlocks.SextupleCompressedSand);
		blockReg(ModBlocks.TripleCompressedCoalBlock);
		blockReg(ModBlocks.TripleCompressedCobblestone);
		blockReg(ModBlocks.TripleCompressedDirt);
		blockReg(ModBlocks.TripleCompressedFlint);
		blockReg(ModBlocks.TripleCompressedGravel);
		blockReg(ModBlocks.TripleCompressedSand);
	}
	

}
