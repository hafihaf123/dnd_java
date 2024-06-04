package main.java.item.armor.medium_armor;

import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class HideArmor extends Armor {
    public HideArmor() {
        this.name = "Hide";
        this.armorCategory = ArmorCategory.MEDIUM_ARMOR;
        this.cost = new Coin(CoinUnits.GP, 10);
        this.baseArmorClass = 12;
        this.stealthDisadvantage = false;
        this.weight = new Weight(WeightUnits.LB, 12);
    }
}
