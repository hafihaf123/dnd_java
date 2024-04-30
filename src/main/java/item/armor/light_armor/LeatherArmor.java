package main.java.item.armor.light_armor;

import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;

public class LeatherArmor extends Armor {
    public LeatherArmor() {
        this.name = "Leather armor";
        this.armorCategory = ArmorCategory.LIGHT_ARMOR;
        this.cost = new Coin(CoinType.GP, 10);
        this.baseArmorClass = 11;
        this.stealthDisadvantage = false;
        this.weight = 10;
    }
}
