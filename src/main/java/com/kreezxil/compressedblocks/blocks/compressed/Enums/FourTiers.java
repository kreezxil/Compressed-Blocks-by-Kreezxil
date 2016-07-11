package com.kreezxil.compressedblocks.blocks.compressed.Enums;

import java.util.Locale;

import net.minecraft.util.IStringSerializable;

public enum FourTiers implements IStringSerializable {

	COMPRESSED, DOUBLE, TRIPLE, QUADRUPLE;

	@Override
	public String getName()
	{
		return name().toLowerCase(Locale.ROOT);
	}
	
	public int getID()
	{
		return ordinal();
	}
}
