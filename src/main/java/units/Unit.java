package main.java.units;

public abstract class Unit <T extends EnumUnit> {
	private float amount;
	
	public Unit(T enumUnit, float amount) {
		this.amount = amount * enumUnit.getBasicUnit();
	}
	
	public float getAmount(T enumUnit) {
		return amount /  enumUnit.getBasicUnit();
	}
	
	public void setAmount(T enumUnit, float amount) {
		this.amount = amount * enumUnit.getBasicUnit();
	}
	
	public void addAmount(T enumUnit, float amount) {
		this.amount += amount * enumUnit.getBasicUnit();
	}
	
	public String toString(T enumUnit) {
		return STR."\{getAmount(enumUnit)}\{enumUnit.toString().toLowerCase()}";
	}
}
