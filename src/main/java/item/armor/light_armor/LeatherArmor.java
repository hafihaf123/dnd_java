package main.java.item.armor.light_armor;

import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class LeatherArmor extends Armor {
    public LeatherArmor() {
        this.name = "Leather armor";
        this.armorCategory = ArmorCategory.LIGHT_ARMOR;
        this.cost = new Coin(CoinUnits.GP, 10);
        this.baseArmorClass = 11;
        this.stealthDisadvantage = false;
        this.weight = new Weight(WeightUnits.LB, 10);
    }
}
