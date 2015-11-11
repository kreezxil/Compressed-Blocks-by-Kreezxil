package com.kreezxil.compressedblocks.blocks;

import java.util.List;
import java.util.Random;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.ModBlocks;

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

public class CompressedFlint extends Block {

	public static final PropertyInteger TIER = PropertyInteger.create("tier", 0, 7);

	public CompressedFlint() {
		super(Material.rock);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TIER, 0));
		this.setUnlocalizedName("CompressedFlint");
		this.setCreativeTab(CompressedBlocks.blocksTab);
		/*this.setHardness(10f);
		this.setResistance(2f);
		this.setHarvestLevel("pickaxe",0);*/
	}

	@Override
	public float getBlockHardness(World world, BlockPos pos){
		int tier = ((Integer)world.getBlockState(pos).getValue(TIER)).intValue();
		switch(tier){
		case 0:
			return 10f;
		case 1:
			return 20f;
		case 2:
			return 40f;
		case 3:
			return 80f;
		case 4:
			return 160f;
		case 5:
			return 320f;
		case 6:
			return 640f;
		case 7:
			return 1280f;
		default:
			return 10f;
		}
	}

	@Override
	public float getExplosionResistance(Entity exploder)
	{
		return this.blockHardness * 0.2F * 3 / 5.0F;
	}

	@Override
	public String getHarvestTool(IBlockState state)
	{
		return "pickaxe";
	}

	@Override
	public int getHarvestLevel(IBlockState state)
	{
		int tier = ((Integer)state.getValue(TIER)).intValue();
		switch(tier){
		case 0:
			return 0;
		case 1:
			return 0;
		case 2:
			return 1;
		case 3:
			return 1;
		case 4:
			return 2;
		case 5:
			return 2;
		case 6:
			return 2;
		case 7:
			return 3;
		default:
			return 0;
		}
	}

	@Override
	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[] {TIER});
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return getDefaultState().withProperty(TIER, Integer.valueOf(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((Integer)state.getValue(TIER)).intValue();
	}

	@Override
	public int quantityDropped(Random par1Random){
		return 9;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random par2Random, int par3){
		int tier = ((Integer)state.getValue(TIER)).intValue();
		switch(tier){
		case 0:
			return Items.flint;
		case 1:
			return Item.getItemFromBlock(ModBlocks.CompressedFlint);
		case 2:
			return Item.getItemFromBlock(ModBlocks.CompressedFlint);
		case 3:
			return Item.getItemFromBlock(ModBlocks.CompressedFlint);
		case 4:
			return Item.getItemFromBlock(ModBlocks.CompressedFlint);
		case 5:
			return Item.getItemFromBlock(ModBlocks.CompressedFlint);
		case 6:
			return Item.getItemFromBlock(ModBlocks.CompressedFlint);
		case 7:
			return Item.getItemFromBlock(ModBlocks.CompressedFlint);
		default:
			return Items.flint;
		}
	}

	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
		list.add(new ItemStack(itemIn, 1, 0));
		list.add(new ItemStack(itemIn, 1, 1));
		list.add(new ItemStack(itemIn, 1, 2));
		list.add(new ItemStack(itemIn, 1, 3));
		list.add(new ItemStack(itemIn, 1, 4));
		list.add(new ItemStack(itemIn, 1, 5));
		list.add(new ItemStack(itemIn, 1, 6));
		list.add(new ItemStack(itemIn, 1, 7));
	}

	@Override
	public int damageDropped(IBlockState state) {
		int tier = ((Integer)state.getValue(TIER)).intValue();
		if(tier != 0 && tier < 8)
			return tier-1;
		else
			return 0;
	}

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos) {
		return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
	}
}
