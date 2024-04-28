package main.java.item.armor.medium_armor;

import main.java.coin.Coin;
import main.java.coin.CoinType;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;

public class BreastplateArmor extends Armor {
    public BreastplateArmor() {
        this.name = "Breastplate";
        this.armorCategory = ArmorCategory.MEDIUM_ARMOR;
        this.cost = new Coin(CoinType.GP, 400);
        this.baseArmorClass = 14;
        this.stealthDisadvantage = false;
        this.weight = 20;
    }
}
