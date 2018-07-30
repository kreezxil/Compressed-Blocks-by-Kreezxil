package com.kreezxil.compressedblocks.Init;

import java.util.ArrayList;
import java.util.List;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InitItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final ItemBase carbonDust = new ItemBase("carbondust");
	public static final ItemBase BuckyBall = new ItemBase("buckyball");
	public static final ItemBase CarbonMesh = new ItemBase("carbonmesh");
	public static final ItemBase CarbonNanoTube = new ItemBase("carbonnanotube");
	public static final ItemBase UnfiredBuckyBall = new ItemBase("unfiredbuckyball");
	public static final ItemBase UnfiredCarbonMesh = new ItemBase("unfiredcarbonmesh");
	public static final ItemBase UnfiredCarbonNanoTube = new ItemBase("unfiredcarbonnanotube");
	public static final ItemBase UnfiredDiamond = new ItemBase("unfireddiamond");
}
