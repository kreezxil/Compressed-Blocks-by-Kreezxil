package com.kreezxil.compressedblocks.blocks.compressed;

import java.util.List;
import java.util.Random;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.IHasModel;
import com.kreezxil.compressedblocks.Init.InitBlocks;
import com.kreezxil.compressedblocks.Init.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BasicCompressed extends Block implements IHasModel {

	public static final String harvestTool = "pickaxe";
	public static final float baseHardness = 2f;
	public static final float hardnessFactor = 0.3f;
	public static final float explosionFactor = 0.175f;
	public static final int WOOD = 0;
	public static final int STONE = 1;
	public static final int IRON = 2;
	public static final int DIAMOND = 3;
	public static int[] harvestLevel = { STONE, STONE, STONE, STONE, IRON,
			IRON, IRON, IRON };
	public static String[] tiers = { "", "Double", "Triple", "Quadruple",
			"Quintuple", "Sextuple", "Septuple", "Octuple" };
	private static String name;

	public static int tier = 1; // default tier == tier is a multiplier

	public BasicCompressed(String name) {
		super(Material.ROCK);
		this.name = name;
		setUnlocalizedName(CompressedBlocks.MODID + "." + name);
		setCreativeTab(CompressedBlocks.blocksTab);
		setRegistryName(name);
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

	@Override
	public void registerModels() {
		CompressedBlocks.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	public BasicCompressed setTier(int x) {
		this.tier = x;
		return this;
	}

	@Override
	public float getBlockHardness(IBlockState blockstate, World world, BlockPos pos) {
		return baseHardness * tier * hardnessFactor * tier;
	}

	@Override
	public float getExplosionResistance(World world, BlockPos pos, Entity exploder, Explosion explosion) {
		return this.getBlockHardness(this.getDefaultState(), world, pos) * explosionFactor;
	}

	@Override
	public String getHarvestTool(IBlockState state) {
		return harvestTool;
	}

	@Override
	public int getHarvestLevel(IBlockState state) {
		return tier >= 0 ? harvestLevel[tier] : harvestLevel[0];
	}

	@Override
	public int quantityDropped(Random par1Random) {
		return 9;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random par2Random, int par3) {
		return tier >= 1 ? Item.getItemFromBlock(InitBlocks.CompressedCoalBlock.setTier(tier - 1))
				: Item.getItemFromBlock(Blocks.COAL_BLOCK);
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
			EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
	}

}