package main.java.item.armor.medium_armor;

import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;

public class ScaleMailArmor extends Armor {
    public ScaleMailArmor() {
        this.name = "Scale mail";
        this.armorCategory = ArmorCategory.MEDIUM_ARMOR;
        this.cost = new Coin(CoinType.GP, 50);
        this.baseArmorClass = 14;
        this.stealthDisadvantage = true;
        this.weight = 45;
    }
}
