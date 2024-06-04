package main.java.item.armor.medium_armor;

import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class HalfPlateArmor extends Armor {
    public HalfPlateArmor() {
        this.name = "Half plate armor";
        this.armorCategory = ArmorCategory.MEDIUM_ARMOR;
        this.cost = new Coin(CoinUnits.GP, 750);
        this.baseArmorClass = 15;
        this.stealthDisadvantage = true;
        this.weight = new Weight(WeightUnits.LB, 40);
    }
}
