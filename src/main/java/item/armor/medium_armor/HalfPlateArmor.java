package main.java.item.armor.medium_armor;

import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;

public class HalfPlateArmor extends Armor {
    public HalfPlateArmor() {
        this.name = "Half plate armor";
        this.armorCategory = ArmorCategory.MEDIUM_ARMOR;
        this.cost = new Coin(CoinType.GP, 750);
        this.baseArmorClass = 15;
        this.stealthDisadvantage = true;
        this.weight = 40;
    }
}
