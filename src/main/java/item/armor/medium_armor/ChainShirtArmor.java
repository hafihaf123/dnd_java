package main.java.item.armor.medium_armor;

import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;

public class ChainShirtArmor extends Armor {
    public ChainShirtArmor() {
        this.name = "Chain shirt";
        this.armorCategory = ArmorCategory.MEDIUM_ARMOR;
        this.cost = new Coin(CoinUnits.GP, 50);
        this.baseArmorClass = 13;
        this.stealthDisadvantage = false;
        this.weight = 20;
    }
}
