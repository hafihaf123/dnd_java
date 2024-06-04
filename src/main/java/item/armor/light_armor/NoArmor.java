package main.java.item.armor.light_armor;

import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class NoArmor extends Armor {
	public NoArmor() {
		this.name = "No armor";
		this.armorCategory = ArmorCategory.LIGHT_ARMOR;
		this.cost = new Coin(CoinUnits.CP, 0);
		this.baseArmorClass = 10;
		this.stealthDisadvantage = false;
		this.weight = new Weight(WeightUnits.LB, 0);
	}
}
