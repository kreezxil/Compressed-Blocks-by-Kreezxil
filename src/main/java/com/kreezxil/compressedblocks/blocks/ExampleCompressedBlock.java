/*
 * Default template for the compressed blocks block
 */
/*
package com.kreezxil.compressedblocks.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.ModBlocks;

public class ExampleCompressedBlock extends Block {

	public static final String harvestTool = "pickaxe";
	public static final Item tier0Drop = Items.flint; // or just
														// Item.getItemFromBlock(blockIn)
	
	//
	//public static final Block masterBlock = ModBlocks.CompressedFlint;
	// -- not legal for some reason
	//
	
	public static final int MAXTIER = 8;
	public static final String UnlocalizedName = "ExampleCompressedBlock";
	public static final float baseHardness = 10f;
	public static final float hardnessFactor = 2;
	public static final int WOOD = 0;
	public static final int STONE = 1;
	public static final int IRON = 2;
	public static final int DIAMOND = 3;
	public static final int[] harvestLevel = { WOOD, WOOD, WOOD, IRON, IRON,
			IRON, DIAMOND, DIAMOND };

	public static final PropertyInteger TIER = PropertyInteger.create("tier",
			0, MAXTIER - 1);

	public ExampleCompressedBlock() {
		super(Material.rock);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TIER,
				0));
		this.setUnlocalizedName(UnlocalizedName);
		this.setCreativeTab(CompressedBlocks.blocksTab);
	}

	@Override
	public float getBlockHardness(World world, BlockPos pos) {
		int tier = ((Integer) world.getBlockState(pos).getValue(TIER))
				.intValue();
		switch (tier) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			return baseHardness * tier * hardnessFactor * tier;
		default: // aka tier 0 and undefined
			return baseHardness;
		}
	}

	@Override
	public float getExplosionResistance(Entity exploder) {
		return this.blockHardness * 0.2F * 3 / 5.0F;
	}

	@Override
	public String getHarvestTool(IBlockState state) {
		return harvestTool;
	}

	@Override
	public int getHarvestLevel(IBlockState state) {
		int tier = ((Integer) state.getValue(TIER)).intValue();
		if (tier >= 0 && tier < MAXTIER) {
			return harvestLevel[tier];
		} else {
			return harvestLevel[0];
		}
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { TIER });
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TIER, Integer.valueOf(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((Integer) state.getValue(TIER)).intValue();
	}

	@Override
	public int quantityDropped(Random par1Random) {
		return 9;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random par2Random, int par3) {
		int tier = ((Integer) state.getValue(TIER)).intValue();
		switch (tier) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			return Item.getItemFromBlock(masterBlock);
		default: // aka tier 0 and undefined
			return tier0Drop;
		}
	}

	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
		for (int i = 0; i < MAXTIER; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}

	@Override
	public int damageDropped(IBlockState state) {
		int tier = ((Integer) state.getValue(TIER)).intValue();
		if (tier != 0 && tier < MAXTIER)
			return tier - 1;
		else
			return 0;
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world,
			BlockPos pos) {
		return new ItemStack(Item.getItemFromBlock(this), 1,
				this.getMetaFromState(world.getBlockState(pos)));
	}
}
*/