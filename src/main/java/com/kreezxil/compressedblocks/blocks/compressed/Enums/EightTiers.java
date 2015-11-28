package com.kreezxil.compressedblocks.blocks.compressed.Enums;

import net.minecraft.util.IStringSerializable;

public enum EightTiers implements IStringSerializable {

	COMPRESSED(0, "Normal"), DOUBLE(1, "Double"), TRIPLE(2, "Triple"), QUADRUPLE(3,
			"Quadruple"), QUINTUPLE(4, "Quintuple"), SEXTUPLE(5, "Sextuple"), SEPTUPLE(
			6, "Septuple"), OCTUPLE(7, "Octuple");

	private int ID;
	private String name;

	private EightTiers(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return getName();
	}
}
