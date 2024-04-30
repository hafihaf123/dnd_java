package main.java.item.armor.light_armor;

import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;

public class PaddedArmor extends Armor {
    public PaddedArmor() {
        this.name = "Padded armor";
        this.armorCategory = ArmorCategory.LIGHT_ARMOR;
        this.cost = new Coin(CoinType.GP, 5);
        this.baseArmorClass = 11;
        this.stealthDisadvantage = true;
        this.weight = 8;
    }
}
