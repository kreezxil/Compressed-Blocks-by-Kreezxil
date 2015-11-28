package com.kreezxil.compressedblocks.blocks.compressed;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.ModBlocks;
import com.kreezxil.compressedblocks.blocks.EnumTier;
import com.kreezxil.compressedblocks.itemBlocks.IMetaBlockName;

public class Clay extends Block implements IMetaBlockName {
	// previously there was no implements
	public static String harvestTool = "shovel";
	public static int MAXTIER = 8;
	public static String UnlocalizedName = "CompressedClay";
	public static float baseHardness = 4f;
	public static float hardnessFactor = 1.75f;
	public static float explosionFactor = 2f;
	public static int WOOD = 0;
	public static int STONE = 1;
	public static int IRON = 2;
	public static int DIAMOND = 3;
	public static int[] harvestLevel = { WOOD, WOOD, WOOD, STONE, STONE, STONE,
			IRON, IRON };
	public static String[] tiers = { "", "Double", "Triple", "Quadruple",
			"Quintuple", "Sextuple", "Septuple", "Octuple" };

	public static final PropertyEnum TIER = PropertyEnum.create("tier",
			EnumTier.class);

	public Clay() {
		super(Material.rock);
		this.setDefaultState(this.blockState.getBaseState().withProperty(TIER,
				EnumTier.COMPRESSED));
		this.setUnlocalizedName(UnlocalizedName);
		this.setCreativeTab(CompressedBlocks.blocksTab);
	}

	@Override
	public float getBlockHardness(World world, BlockPos pos) {
		IBlockState state = world.getBlockState(pos);
		EnumTier stateTier = (EnumTier) state.getValue(TIER);
		int tier = stateTier.getID();
		if (tier > 0 && tier < MAXTIER) {
			return baseHardness * tier * hardnessFactor * tier;
		}
		return baseHardness;

	}

	@Override
	public float getExplosionResistance(World world, BlockPos pos,
			Entity exploder, Explosion explosion) {
		return this.getBlockHardness(world, pos) * explosionFactor;
	}

	@Override
	public String getHarvestTool(IBlockState state) {
		return harvestTool;
	}

	@Override
	public int getHarvestLevel(IBlockState state) {
		EnumTier stateTier = (EnumTier) state.getValue(TIER);
		int tier = stateTier.getID();
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
		EnumTier tier;
		switch (meta) {
		case 1:
			tier = EnumTier.DOUBLE;
			break;
		case 2:
			tier = EnumTier.TRIPLE;
			break;
		case 3:
			tier = EnumTier.QUADRUPLE;
			break;
		case 4:
			tier = EnumTier.QUINTUPLE;
			break;
		case 5:
			tier = EnumTier.SEXTUPLE;
			break;
		case 6:
			tier = EnumTier.SEPTUPLE;
			break;
		case 7:
			tier = EnumTier.OCTUPLE;
			break;
		default: // 0 and undefined
			tier = EnumTier.COMPRESSED;
		}
		return getDefaultState().withProperty(TIER, tier);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		EnumTier tier = (EnumTier) state.getValue(TIER);
		return tier.getID();
	}

	@Override
	public int quantityDropped(Random par1Random) {
		return 9;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random par2Random, int par3) {
		EnumTier stateTier = (EnumTier) state.getValue(TIER);
		int tier = stateTier.getID();
		if (tier > 0 && tier < MAXTIER) {
			return Item.getItemFromBlock(ModBlocks.CompressedClay);
		}

		// this is tier 0
		return Item.getItemFromBlock(Blocks.clay);
	}

	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
		for (int i = 0; i < MAXTIER; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}

	@Override
	public int damageDropped(IBlockState state) {
		EnumTier stateTier = (EnumTier) state.getValue(TIER);
		int tier = stateTier.getID();
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

	@Override
	public String getSpecialName(ItemStack stack) {
		return tiers[stack.getItemDamage()];
	}

}