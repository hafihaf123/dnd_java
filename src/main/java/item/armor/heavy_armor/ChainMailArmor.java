package main.java.item.armor.heavy_armor;

import main.java.coin.Coin;
import main.java.coin.CoinType;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;

public class ChainMailArmor extends Armor {
    public ChainMailArmor() {
        this.name = "Chain mail";
        this.armorCategory = ArmorCategory.HEAVY_ARMOR;
        this.cost = new Coin(CoinType.GP, 75);
        this.baseArmorClass = 16;
        this.strengthRequirement = 13;
        this.stealthDisadvantage = true;
        this.weight = 55;
    }
}
