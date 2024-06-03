package main.java.item.armor.shield;

import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;

public class Shield extends Armor {
    public Shield() {
        this.name = "Shield";
        this.armorCategory = ArmorCategory.SHIELD;
        this.cost = new Coin(CoinUnits.GP, 10);
        this.stealthDisadvantage = false;
        this.weight = 6;
    }

    @Override
    public int getArmorClass(int baseArmorClass) {
        return baseArmorClass + 2;
    }
}
