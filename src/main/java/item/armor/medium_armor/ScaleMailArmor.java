package main.java.item.armor.medium_armor;

import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class ScaleMailArmor extends Armor {
    public ScaleMailArmor() {
        this.name = "Scale mail";
        this.armorCategory = ArmorCategory.MEDIUM_ARMOR;
        this.cost = new Coin(CoinUnits.GP, 50);
        this.baseArmorClass = 14;
        this.stealthDisadvantage = true;
        this.weight = new Weight(WeightUnits.LB, 45);
    }
}
