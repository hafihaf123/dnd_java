package main.java.item.armor.shield;

import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Shield extends Armor {
    public Shield() {
        this.name = "Shield";
        this.armorCategory = ArmorCategory.SHIELD;
        this.cost = new Coin(CoinUnits.GP, 10);
        this.stealthDisadvantage = false;
        this.weight = new Weight(WeightUnits.LB, 6);
    }

    @Override
    public int getArmorClass(int baseArmorClass) {
        return baseArmorClass + 2;
    }
}
