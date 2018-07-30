package com.kreezxil.compressedblocks.Init;

import java.util.ArrayList;
import java.util.List;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.createFuel;
import com.kreezxil.compressedblocks.blocks.ActivatedCarbonite;
import com.kreezxil.compressedblocks.blocks.coalAndGravelMix;
import com.kreezxil.compressedblocks.blocks.compressed.BasicCompressed;
import com.kreezxil.compressedblocks.blocks.compressed.FallingCompressed;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class InitBlocks {

	public static String[] tiers = { "", "Double", "Triple", "Quadruple", "Quintuple", "Sextuple", "Septuple",
			"Octuple" };

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	/*
	 * Compressed Blocks Declarations
	 */
	public static BasicCompressed CompressedCoalBlock = new BasicCompressed("compressedcoalblock").setTier(1);

	public static final List<BasicCompressed> coal = new ArrayList<BasicCompressed>();
	public static final List<BasicCompressed> flint = new ArrayList<BasicCompressed>();
	public static final List<BasicCompressed> cobblestone = new ArrayList<BasicCompressed>();
	public static final List<BasicCompressed> dirt = new ArrayList<BasicCompressed>();
	public static final List<FallingCompressed> gravel = new ArrayList<FallingCompressed>();
	public static final List<FallingCompressed> redsand = new ArrayList<FallingCompressed>();
	public static final List<FallingCompressed> sand = new ArrayList<FallingCompressed>();
	public static final List<BasicCompressed> clay = new ArrayList<BasicCompressed>();
	public static final List<BasicCompressed> diamond = new ArrayList<BasicCompressed>();
	public static final List<BasicCompressed> emerald = new ArrayList<BasicCompressed>();
	public static final List<BasicCompressed> endstone = new ArrayList<BasicCompressed>();
	public static final List<BasicCompressed> enderpearl = new ArrayList<BasicCompressed>();
	public static final List<BasicCompressed> gold = new ArrayList<BasicCompressed>();
	public static final List<BasicCompressed> iron = new ArrayList<BasicCompressed>();
	public static final List<BasicCompressed> lapis = new ArrayList<BasicCompressed>();
	public static final List<BasicCompressed> netherrack = new ArrayList<BasicCompressed>();
	public static final List<BasicCompressed> obsidian = new ArrayList<BasicCompressed>();
	public static final List<BasicCompressed> redstone = new ArrayList<BasicCompressed>();

	/*
	 * Uncompressed Blocks Declarations
	 */
	public static Block ActivatedCarbonite = new ActivatedCarbonite("ActivatedCarbonite");
	public static Block coalAndGravelMix = new coalAndGravelMix("coalAndGravelMix");

	public static void regFuel() {
		GameRegistry.registerFuelHandler(new createFuel());
	}

	public static void createBlocks() {
		for(int i=0;i<=4;i++) {
			coal.add(new BasicCompressed(tiers[i].toLowerCase()+"compressedcoalblock").setTier(i));
		}
	
		for(int i=0;i<=8;i++) {
			dirt.add(new BasicCompressed(tiers[i].toLowerCase()+"compresseddirt").setTier(i));
			flint.add(new BasicCompressed(tiers[i].toLowerCase()+"compressedflint").setTier(i));
			gravel.add(new FallingCompressed(tiers[i].toLowerCase()+"compressedgravel").setTier(i));
			redsand.add(new FallingCompressed(tiers[i].toLowerCase()+"compressedRedSand").setTier(i));
			sand.add(new FallingCompressed(tiers[i].toLowerCase()+"compressedSand").setTier(i));
			enderpearl.add(new BasicCompressed(tiers[i].toLowerCase()+"compressedenderpearl").setTier(i));
			iron.add(new BasicCompressed(tiers[i].toLowerCase()+"compressediron").setTier(i));
			lapis.add(new BasicCompressed(tiers[i].toLowerCase()+"compressedlapis").setTier(i));
			netherrack.add(new BasicCompressed(tiers[i].toLowerCase()+"compressednetherrack").setTier(i));
			redstone.add(new BasicCompressed(tiers[i].toLowerCase()+"compressedredstone").setTier(i));
			obsidian.add(new BasicCompressed(tiers[i].toLowerCase()+"compressedobsidian").setTier(i));
			diamond.add(new BasicCompressed(tiers[i].toLowerCase()+"compresseddiamond").setTier(i));
			emerald.add(new BasicCompressed(tiers[i].toLowerCase()+"compressedemerald").setTier(i));
			endstone.add(new BasicCompressed(tiers[i].toLowerCase()+"compressedendstone").setTier(i));
			gold.add(new BasicCompressed(tiers[i].toLowerCase()+"compressedgold").setTier(i));
			clay.add(new BasicCompressed(tiers[i].toLowerCase()+"compressedclay").setTier(i));
		}
		
		regFuel();

	}
}
