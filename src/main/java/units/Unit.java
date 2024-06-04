package main.java.units;

public abstract class Unit <T extends EnumUnit> {
	private double amount;
	
	public Unit(T enumUnit, double amount) {
		this.amount = amount * enumUnit.getBasicUnit();
	}
	
	public double getAmount(T enumUnit) {
		return amount /  enumUnit.getBasicUnit();
	}
	
	public void setAmount(T enumUnit, double amount) {
		this.amount = amount * enumUnit.getBasicUnit();
	}
	
	public void addAmount(T enumUnit, double amount) {
		this.amount += amount * enumUnit.getBasicUnit();
	}
	
	public String toString(T enumUnit) {
		return STR."\{getAmount(enumUnit)}\{enumUnit.toString().toLowerCase()}";
	}
}