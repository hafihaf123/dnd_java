package main.java.units.volume;

import main.java.units.Unit;
import main.java.units.weight.WeightUnits;

public class Volume extends Unit<WeightUnits> {
	public Volume(WeightUnits enumUnit, double amount) {
		super(enumUnit, amount);
	}
}
