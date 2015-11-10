package com.kreezxil.compressedblocks;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kreezxil.compressedblocks.items.BuckyBall;
import com.kreezxil.compressedblocks.items.CarbonMesh;
import com.kreezxil.compressedblocks.items.CarbonNanoTube;
import com.kreezxil.compressedblocks.items.UnfiredBuckyBall;
import com.kreezxil.compressedblocks.items.UnfiredCarbonMesh;
import com.kreezxil.compressedblocks.items.UnfiredCarbonNanoTube;
import com.kreezxil.compressedblocks.items.UnfiredDiamond;
import com.kreezxil.compressedblocks.items.carbonDust;

public class ModItems {
	
	public static Item carbonDust;
	public static Item BuckyBall;
	public static Item CarbonMesh;
	public static Item CarbonNanoTube;
	public static Item UnfiredBuckyBall;
	public static Item UnfiredCarbonMesh;
	public static Item UnfiredCarbonNanoTube;
	public static Item UnfiredDiamond;
	
	public static void reg(Item item, String name) {
		GameRegistry.registerItem(item, name);
	}
	
	public static void createItems() {
		reg(UnfiredBuckyBall = new UnfiredBuckyBall("UnfiredBuckyBall"),"UnfiredBuckyBall");
		reg(carbonDust = new carbonDust("carbonDust"),"carbonDust");
		reg(BuckyBall = new BuckyBall("BuckyBall"),"BuckyBall");
		reg(CarbonMesh = new CarbonMesh("CarbonMesh"),"CarbonMesh");
		reg(CarbonNanoTube = new CarbonNanoTube("CarbonNanoTube"),"CarbonNanoTube");
		reg(UnfiredCarbonMesh = new UnfiredCarbonMesh("UnfiredCarbonMesh"),"UnfiredCarbonMesh");
		reg(UnfiredDiamond = new UnfiredDiamond("UnfiredDiamond"),"UnfiredDiamond");
		reg(UnfiredCarbonNanoTube = new UnfiredCarbonNanoTube("UnfiredCarbonNanoTube"),"UnfiredCarbonNanoTube");
	}
}
