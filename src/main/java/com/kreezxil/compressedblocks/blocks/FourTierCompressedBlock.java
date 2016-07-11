package com.kreezxil.compressedblocks.blocks;

import java.util.List;
import java.util.Random;

import com.kreezxil.compressedblocks.CompressedBlocks;
import com.kreezxil.compressedblocks.blocks.compressed.Enums.FourTiers;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class FourTierCompressedBlock extends CompressedBlock {

	public static final PropertyEnum TIER = PropertyEnum.create("tier", FourTiers.class);

	public FourTierCompressedBlock(Material materialIn, String harvestToolIn, int maxTierIn, String nameIn,
			float baseHardnessIn, float hardnessFactorIn, float explosionFactorIn, Item inputItem,
			int... harvestLevels) {
		super(materialIn);
		harvestTool = harvestToolIn;
		MAXTIER = maxTierIn;
		UnlocalizedName = nameIn;
		baseHardness = baseHardnessIn;
		hardnessFactor = hardnessFactorIn;
		explosionFactor = explosionFactorIn;
		itemIn = inputItem;
		harvestLevel = harvestLevels;
		this.setDefaultState(this.blockState.getBaseState().withProperty(TIER, FourTiers.COMPRESSED));
		this.setUnlocalizedName(UnlocalizedName);
		this.setRegistryName(UnlocalizedName);
		this.setCreativeTab(CompressedBlocks.blocksTab);
	}

	@Override
	public float getBlockHardness(IBlockState blockState, World worldIn, net.minecraft.util.math.BlockPos pos) {

		IBlockState state = worldIn.getBlockState(pos);
		FourTiers stateTier = (FourTiers) state.getValue(TIER);
		int tier = stateTier.getID();
		if (tier > 0 && tier < MAXTIER) {
			return baseHardness * tier * hardnessFactor * tier;
		}
		return baseHardness;

	}

	@Override
	public float getExplosionResistance(World world, net.minecraft.util.math.BlockPos pos, Entity exploder,
			Explosion explosion) {
		return this.getBlockHardness(this.getStateById(exploder.getEntityId()), world, pos) * explosionFactor;
	}

	@Override
	public String getHarvestTool(IBlockState state) {
		return harvestTool;
	}

	@Override
	public int getHarvestLevel(IBlockState state) {
		FourTiers stateTier = (FourTiers) state.getValue(TIER);
		int tier = stateTier.getID();
		if (tier >= 0 && tier < MAXTIER) {
			return harvestLevel[tier];
		} else {
			return harvestLevel[0];
		}
	}

	@Override
	public BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, TIER);
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		FourTiers tier;
		switch (meta) {
		case 1:
			tier = FourTiers.DOUBLE;
			break;
		case 2:
			tier = FourTiers.TRIPLE;
			break;
		case 3:
			tier = FourTiers.QUADRUPLE;
			break;
		default: // 0 and undefined
			tier = FourTiers.COMPRESSED;
		}
		return getDefaultState().withProperty(TIER, tier);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		FourTiers tier = (FourTiers) state.getValue(TIER);
		return tier.getID();
	}

	@Override
	public int quantityDropped(Random par1Random) {
		return 9;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random par2Random, int par3) {
		FourTiers stateTier = (FourTiers) state.getValue(TIER);
		int tier = stateTier.getID();
		if (tier > 0 && tier < MAXTIER) {
			return Item.getItemFromBlock(this);
		}

		// this is tier 0
		return itemIn;
	}

	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
		for (int i = 0; i < MAXTIER; i++) {
			list.add(new ItemStack(itemIn, 1, i));
		}
	}

	@Override
	public int damageDropped(IBlockState state) {
		FourTiers stateTier = (FourTiers) state.getValue(TIER);
		int tier = stateTier.getID();
		if (tier != 0 && tier < MAXTIER)
			return tier - 1;
		else
			return 0;
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos,
			EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
	}

	@Override
	public String getSpecialName(ItemStack stack) {
		return tiers[stack.getItemDamage()];
	}
}
