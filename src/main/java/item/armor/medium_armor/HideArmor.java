package main.java.item.armor.medium_armor;

import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;

public class HideArmor extends Armor {
    public HideArmor() {
        this.name = "Hide";
        this.armorCategory = ArmorCategory.MEDIUM_ARMOR;
        this.cost = new Coin(CoinType.GP, 10);
        this.baseArmorClass = 12;
        this.stealthDisadvantage = false;
        this.weight = 12;
    }
}
