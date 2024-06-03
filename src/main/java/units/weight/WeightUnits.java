package main.java.units.weight;

import main.java.units.EnumUnit;

public enum WeightUnits implements EnumUnit {
	OZ(1),
	LB(16),
	QT(448);
	
	private final int toOunces;
	
	WeightUnits(int toOunces) {
		this.toOunces = toOunces;
	}
	
	public int getBasicUnit() {
		return toOunces;
	}
}
