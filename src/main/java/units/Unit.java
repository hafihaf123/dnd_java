package main.java.units;

public abstract class Unit <T extends EnumUnit> {
	private double baseAmount;
	
	public Unit(T enumUnit, double amount) {
		this.baseAmount = amount * enumUnit.getBasicUnit();
	}

	public double getBaseAmount() {
		return baseAmount;
	}

	public double getAmount(T enumUnit) {
		return baseAmount /  enumUnit.getBasicUnit();
	}

	public void setBaseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
	}

	public void setAmount(T enumUnit, double amount) {
		this.baseAmount = amount * enumUnit.getBasicUnit();
	}

	public void setAmount(Unit<T> unit) {
		this.setBaseAmount(unit.getBaseAmount());
	}

	public void addBaseAmount(double baseAmount) {
		this.baseAmount += baseAmount;
	}
	
	public void addAmount(T enumUnit, double amount) {
		this.baseAmount += amount * enumUnit.getBasicUnit();
	}

	public void addAmount(Unit<T> unit) {
		this.baseAmount += unit.getBaseAmount();
	}
	
	public String toString(T enumUnit) {
		return STR."\{getAmount(enumUnit)}\{enumUnit.toString().toLowerCase()}";
	}
}