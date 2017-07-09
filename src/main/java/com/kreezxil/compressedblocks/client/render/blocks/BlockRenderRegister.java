package com.kreezxil.compressedblocks.client.render.blocks;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.ModBlocks;
import com.kreezxil.compressedblocks.blocks.CompressedBlock;
import com.kreezxil.compressedblocks.blocks.compressed.Enums.EightTiers;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.client.model.ModelLoader;

public class BlockRenderRegister {

	public static String modid = CompressedBlocks.MODID;
	public static String[] tiers = { "", "Double", "Triple", "Quadruple", "Quintuple", "Sextuple", "Septuple",
			"Octuple" };

	public static void blockReg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}

	public static void blockReg(Block block, int state, String name) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), state,
				new ModelResourceLocation(modid + ":" + name, "inventory"));
	}

	public static void stateReg(Block block, int maxTier) {
		for (int state = 0; state < maxTier; state++) {
			blockReg(block, state, tiers[state] + block.getUnlocalizedName().substring(5));
		}
	}

	public static void registerBlockRenderer() {
		blockReg(ModBlocks.ActivatedCarbonite);
		blockReg(ModBlocks.coalAndGravelMix);
	}

	private static <T extends Enum<T> & IStringSerializable> void registerCompVariantsDefaulted(CompressedBlock b, Class<T> enumclazz,
			String variantHeader) {
		Item item = Item.getItemFromBlock(b);
		int tier = 0;
		for (T e : enumclazz.getEnumConstants()) {
			String variantName = variantHeader + "=" + e.getName().toLowerCase();
			ModelLoader.setCustomModelResourceLocation(item, e.ordinal(),
					new ModelResourceLocation(b.getRegistryName(), variantName));
			tier++;
			if (tier == b.MAXTIER)
				break;
		}
	}

	public static void preInit() {

		/*registerVariantsDefaulted(ModBlocks.CompressedCobblestone, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedDirt, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedGravel, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedSand, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedRedSand, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedFlint, EightTiers.class, "variant", 8);*/
		registerCompVariantsDefaulted(ModBlocks.CompressedCoalBlock, EightTiers.class, "tier");
		/*registerVariantsDefaulted(ModBlocks.CompressedEnder_Pearl, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedIron, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedLapis, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedNetherrack, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedDiamond, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedEmerald, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedEnd_Stone, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedGold, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedClay, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedObsidian, EightTiers.class, "variant", 8);
		registerVariantsDefaulted(ModBlocks.CompressedRedstone, EightTiers.class, "variant", 8);*/
	}
}
