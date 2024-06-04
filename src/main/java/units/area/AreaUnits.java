package main.java.units.area;

import main.java.units.EnumUnit;

public enum AreaUnits implements EnumUnit {
	FEET_SQUARED(1),
	YARD_SQUARED(9);
	
	private final int toFeetSquared;
	
	AreaUnits(int toFeetSquared) {
		this.toFeetSquared = toFeetSquared;
	}
	
	@Override
	public int getBasicUnit() {
		return toFeetSquared;
	}
}
