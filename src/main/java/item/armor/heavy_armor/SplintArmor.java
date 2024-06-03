package main.java.item.armor.heavy_armor;

import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;

public class SplintArmor extends Armor {
    public SplintArmor() {
        this.name = "Splint";
        this.armorCategory = ArmorCategory.HEAVY_ARMOR;
        this.cost = new Coin(CoinUnits.GP, 200);
        this.baseArmorClass = 17;
        this.strengthRequirement = 15;
        this.stealthDisadvantage = true;
        this.weight = 60;
    }
}
