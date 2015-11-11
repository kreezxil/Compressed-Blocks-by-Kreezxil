package com.kreezxil.compressedblocks;

import com.kreezxil.compressedblocks.blocks.ActivatedCarbonite;
import com.kreezxil.compressedblocks.blocks.CompressedCoalBlock;
import com.kreezxil.compressedblocks.blocks.CompressedCobblestone;
import com.kreezxil.compressedblocks.blocks.CompressedDirt;
import com.kreezxil.compressedblocks.blocks.CompressedFlint;
import com.kreezxil.compressedblocks.blocks.CompressedGravel;
import com.kreezxil.compressedblocks.blocks.CompressedSand;
import com.kreezxil.compressedblocks.blocks.CompressedTNT;
import com.kreezxil.compressedblocks.blocks.DoubleCompressedCoalBlock;
import com.kreezxil.compressedblocks.blocks.DoubleCompressedCobblestone;
import com.kreezxil.compressedblocks.blocks.DoubleCompressedDirt;
import com.kreezxil.compressedblocks.blocks.DoubleCompressedGravel;
import com.kreezxil.compressedblocks.blocks.DoubleCompressedSand;
import com.kreezxil.compressedblocks.blocks.OctupleCompressedCobblestone;
import com.kreezxil.compressedblocks.blocks.OctupleCompressedDirt;
import com.kreezxil.compressedblocks.blocks.OctupleCompressedGravel;
import com.kreezxil.compressedblocks.blocks.OctupleCompressedSand;
import com.kreezxil.compressedblocks.blocks.QuadrupleCompressedCoalBlock;
import com.kreezxil.compressedblocks.blocks.QuadrupleCompressedCobblestone;
import com.kreezxil.compressedblocks.blocks.QuadrupleCompressedDirt;
import com.kreezxil.compressedblocks.blocks.QuadrupleCompressedGravel;
import com.kreezxil.compressedblocks.blocks.QuadrupleCompressedSand;
import com.kreezxil.compressedblocks.blocks.QuintupleCompressedCobblestone;
import com.kreezxil.compressedblocks.blocks.QuintupleCompressedDirt;
import com.kreezxil.compressedblocks.blocks.QuintupleCompressedGravel;
import com.kreezxil.compressedblocks.blocks.QuintupleCompressedSand;
import com.kreezxil.compressedblocks.blocks.SeptupleCompressedCobblestone;
import com.kreezxil.compressedblocks.blocks.SeptupleCompressedDirt;
import com.kreezxil.compressedblocks.blocks.SeptupleCompressedGravel;
import com.kreezxil.compressedblocks.blocks.SeptupleCompressedSand;
import com.kreezxil.compressedblocks.blocks.SextupleCompressedCobblestone;
import com.kreezxil.compressedblocks.blocks.SextupleCompressedDirt;
import com.kreezxil.compressedblocks.blocks.SextupleCompressedGravel;
import com.kreezxil.compressedblocks.blocks.SextupleCompressedSand;
import com.kreezxil.compressedblocks.blocks.TripleCompressedCoalBlock;
import com.kreezxil.compressedblocks.blocks.TripleCompressedCobblestone;
import com.kreezxil.compressedblocks.blocks.TripleCompressedDirt;
import com.kreezxil.compressedblocks.blocks.TripleCompressedGravel;
import com.kreezxil.compressedblocks.blocks.TripleCompressedSand;
import com.kreezxil.compressedblocks.blocks.coalAndGravelMix;
import com.kreezxil.compressedblocks.itemblocks.ItemBlockCompressedFlint;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block coalAndGravelMix;
	public static Block ActivatedCarbonite;
	public static Block CompressedCobblestone;
	public static Block CompressedCoalBlock;
	public static Block CompressedDirt;
	public static Block CompressedFlint;
	public static Block CompressedGravel;
	public static Block CompressedSand;
	public static Block CompressedTNT;
	public static Block DoubleCompressedCoalBlock;
	public static Block DoubleCompressedCobblestone;
	public static Block DoubleCompressedDirt;
	public static Block DoubleCompressedGravel;
	public static Block DoubleCompressedSand;
	public static Block OctupleCompressedCobblestone;
	public static Block OctupleCompressedDirt;
	public static Block OctupleCompressedGravel;
	public static Block OctupleCompressedSand;
	public static Block QuadrupleCompressedCoalBlock;
	public static Block QuadrupleCompressedCobblestone;
	public static Block QuadrupleCompressedDirt;
	public static Block QuadrupleCompressedGravel;
	public static Block QuadrupleCompressedSand;
	public static Block QuintupleCompressedCobblestone;
	public static Block QuintupleCompressedDirt;
	public static Block QuintupleCompressedGravel;
	public static Block QuintupleCompressedSand;
	public static Block SeptupleCompressedCobblestone;
	public static Block SeptupleCompressedDirt;
	public static Block SeptupleCompressedGravel;
	public static Block SeptupleCompressedSand;
	public static Block SextupleCompressedCobblestone;
	public static Block SextupleCompressedDirt;
	public static Block SextupleCompressedGravel;
	public static Block SextupleCompressedSand;
	public static Block TripleCompressedCoalBlock;
	public static Block TripleCompressedCobblestone;
	public static Block TripleCompressedDirt;
	public static Block TripleCompressedGravel;
	public static Block TripleCompressedSand;


	public static void reg(Block block, String UnlocalizedName) {
		GameRegistry.registerBlock(block, UnlocalizedName);
	}

	public static void regFuel() {
		GameRegistry.registerFuelHandler(new createFuel());
	}

	public static void createBlocks() {
		GameRegistry.registerBlock(CompressedFlint = new CompressedFlint(), ItemBlockCompressedFlint.class, "CompressedFlint");

		reg(coalAndGravelMix = new coalAndGravelMix("coalAndGravelMix"),"coalAndGravelMix");
		reg(ActivatedCarbonite = new ActivatedCarbonite("ActivatedCarbonite"),"ActivatedCarbonite");
		reg(CompressedCobblestone = new CompressedCobblestone("CompressedCobblestone"),"CompressedCobblestone");
		reg(CompressedCoalBlock = new CompressedCoalBlock("CompressedCoalBlock"),"CompressedCoalBlock");
		reg(CompressedDirt = new CompressedDirt("CompressedDirt"),"CompressedDirt");
		reg(CompressedGravel = new CompressedGravel("CompressedGravel"),"CompressedGravel");
		reg(CompressedSand = new CompressedSand("CompressedSand"),"CompressedSand");
		reg(CompressedTNT = new CompressedTNT("CompressedTNT"),"CompressedTNT");
		reg(DoubleCompressedCoalBlock = new DoubleCompressedCoalBlock("DoubleCompressedCoalBlock"),"DoubleCompressedCoalBlock");
		reg(DoubleCompressedCobblestone = new DoubleCompressedCobblestone("DoubleCompressedCobblestone"),"DoubleCompressedCobblestone");
		reg(DoubleCompressedDirt = new DoubleCompressedDirt("DoubleCompressedDirt"),"DoubleCompressedDirt");
		reg(DoubleCompressedGravel = new DoubleCompressedGravel("DoubleCompressedGravel"),"DoubleCompressedGravel");
		reg(DoubleCompressedSand = new DoubleCompressedSand("DoubleCompressedSand"),"DoubleCompressedSand");
		reg(OctupleCompressedCobblestone = new OctupleCompressedCobblestone("OctupleCompressedCobblestone"),"OctupleCompressedCobblestone");
		reg(OctupleCompressedDirt = new OctupleCompressedDirt("OctupleCompressedDirt"),"OctupleCompressedDirt");
		reg(OctupleCompressedGravel = new OctupleCompressedGravel("OctupleCompressedGravel"),"OctupleCompressedGravel");
		reg(OctupleCompressedSand = new OctupleCompressedSand("OctupleCompressedSand"),"OctupleCompressedSand");
		reg(QuadrupleCompressedCoalBlock = new QuadrupleCompressedCoalBlock("QuadrupleCompressedCoalBlock"),"QuadrupleCompressedCoalBlock");
		reg(QuadrupleCompressedCobblestone = new QuadrupleCompressedCobblestone("QuadrupleCompressedCobblestone"),"QuadrupleCompressedCobblestone");
		reg(QuadrupleCompressedDirt = new QuadrupleCompressedDirt("QuadrupleCompressedDirt"),"QuadrupleCompressedDirt");
		reg(QuadrupleCompressedGravel = new QuadrupleCompressedGravel("QuadrupleCompressedGravel"),"QuadrupleCompressedGravel");
		reg(QuadrupleCompressedSand = new QuadrupleCompressedSand("QuadrupleCompressedSand"),"QuadrupleCompressedSand");
		reg(QuintupleCompressedCobblestone = new QuintupleCompressedCobblestone("QuintupleCompressedCobblestone"),"QuintupleCompressedCobblestone");
		reg(QuintupleCompressedDirt = new QuintupleCompressedDirt("QuintupleCompressedDirt"),"QuintupleCompressedDirt");
		reg(QuintupleCompressedGravel = new QuintupleCompressedGravel("QuintupleCompressedGravel"),"QuintupleCompressedGravel");
		reg(QuintupleCompressedSand = new QuintupleCompressedSand("QuintupleCompressedSand"),"QuintupleCompressedSand");
		reg(SeptupleCompressedCobblestone = new SeptupleCompressedCobblestone("SeptupleCompressedCobblestone"),"SeptupleCompressedCobblestone");
		reg(SeptupleCompressedDirt = new SeptupleCompressedDirt("SeptupleCompressedDirt"),"SeptupleCompressedDirt");
		reg(SeptupleCompressedGravel = new SeptupleCompressedGravel("SeptupleCompressedGravel"),"SeptupleCompressedGravel");
		reg(SeptupleCompressedSand = new SeptupleCompressedSand("SeptupleCompressedSand"),"SeptupleCompressedSand");
		reg(SextupleCompressedCobblestone = new SextupleCompressedCobblestone("SextupleCompressedCobblestone"),"SextupleCompressedCobblestone");
		reg(SextupleCompressedDirt = new SextupleCompressedDirt("SextupleCompressedDirt"),"SextupleCompressedDirt");
		reg(SextupleCompressedGravel = new SextupleCompressedGravel("SextupleCompressedGravel"),"SextupleCompressedGravel");
		reg(SextupleCompressedSand = new SextupleCompressedSand("SextupleCompressedSand"),"SextupleCompressedSand");
		reg(TripleCompressedCoalBlock = new TripleCompressedCoalBlock("TripleCompressedCoalBlock"),"TripleCompressedCoalBlock");
		reg(TripleCompressedCobblestone = new TripleCompressedCobblestone("TripleCompressedCobblestone"),"TripleCompressedCobblestone");
		reg(TripleCompressedDirt = new TripleCompressedDirt("TripleCompressedDirt"),"TripleCompressedDirt");
		reg(TripleCompressedGravel = new TripleCompressedGravel("TripleCompressedGravel"),"TripleCompressedGravel");
		reg(TripleCompressedSand = new TripleCompressedSand("TripleCompressedSand"),"TripleCompressedSand");

		regFuel();

	}
}
