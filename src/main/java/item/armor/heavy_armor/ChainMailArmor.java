package main.java.item.armor.heavy_armor;

import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class ChainMailArmor extends Armor {
    public ChainMailArmor() {
        this.name = "Chain mail";
        this.armorCategory = ArmorCategory.HEAVY_ARMOR;
        this.cost = new Coin(CoinUnits.GP, 75);
        this.baseArmorClass = 16;
        this.strengthRequirement = 13;
        this.stealthDisadvantage = true;
        this.weight = new Weight(WeightUnits.LB, 55);
    }
}
