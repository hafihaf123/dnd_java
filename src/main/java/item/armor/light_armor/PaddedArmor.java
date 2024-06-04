package main.java.item.armor.light_armor;

import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class PaddedArmor extends Armor {
    public PaddedArmor() {
        this.name = "Padded armor";
        this.armorCategory = ArmorCategory.LIGHT_ARMOR;
        this.cost = new Coin(CoinUnits.GP, 5);
        this.baseArmorClass = 11;
        this.stealthDisadvantage = true;
        this.weight = new Weight(WeightUnits.LB, 8);
    }
}
