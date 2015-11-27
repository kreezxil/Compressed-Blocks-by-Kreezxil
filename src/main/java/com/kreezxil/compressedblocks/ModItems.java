package com.kreezxil.compressedblocks;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item carbonDust;
	public static Item BuckyBall;
	public static Item CarbonMesh;
	public static Item CarbonNanoTube;
	public static Item UnfiredBuckyBall;
	public static Item UnfiredCarbonMesh;
	public static Item UnfiredCarbonNanoTube;
	public static Item UnfiredDiamond;

	public static void reg(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}

	public static Item newItem(String unlocalizedName) {
		return new Item().setUnlocalizedName(unlocalizedName).setCreativeTab(
				CompressedBlocks.itemsTab);
	}

	public static void createItems() {
		reg(UnfiredBuckyBall = newItem("UnfiredBuckyBall"));
		reg(carbonDust = newItem("carbonDust"));
		reg(BuckyBall = newItem("BuckyBall"));
		reg(CarbonMesh = newItem("CarbonMesh"));
		reg(CarbonNanoTube = newItem("CarbonNanoTube"));
		reg(UnfiredCarbonMesh = newItem("UnfiredCarbonMesh"));
		reg(UnfiredDiamond = newItem("UnfiredDiamond"));
		reg(UnfiredCarbonNanoTube = newItem("UnfiredCarbonNanoTube"));
	}
}
