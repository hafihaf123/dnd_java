package main.java.item.armor.heavy_armor;

import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;

public class PlateArmor extends Armor {
    public PlateArmor() {
        this.name = "Plate armor";
        this.armorCategory = ArmorCategory.HEAVY_ARMOR;
        this.cost = new Coin(CoinUnits.GP, 18);
        this.baseArmorClass = 18;
        this.strengthRequirement = 15;
        this.stealthDisadvantage = true;
        this.weight = 65;
    }
}
