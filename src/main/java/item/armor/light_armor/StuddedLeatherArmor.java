package main.java.item.armor.light_armor;

import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class StuddedLeatherArmor extends Armor {
    public StuddedLeatherArmor() {
        this.name = "Studded leather armor";
        this.armorCategory = ArmorCategory.LIGHT_ARMOR;
        this.cost = new Coin(CoinUnits.GP, 45);
        this.baseArmorClass = 12;
        this.stealthDisadvantage = false;
        this.weight = new Weight(WeightUnits.LB, 13);
    }
}
