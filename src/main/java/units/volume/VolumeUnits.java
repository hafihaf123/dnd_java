package main.java.units.volume;

import main.java.units.EnumUnit;

public enum VolumeUnits implements EnumUnit {
	FL_OZ(1),
	VIAL(4),
	MUG(8),
	PINT(16),
	BOTTLE(24),
	PITCHER(60),
	GALLON(128);
	
	private final int toFluidOunces;
	
	VolumeUnits(int toFluidOunces) {
		this.toFluidOunces = toFluidOunces;
	}
	
	@Override
	public int getBasicUnit() {
		return toFluidOunces;
	}
}
