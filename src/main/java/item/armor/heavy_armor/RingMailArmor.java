package main.java.item.armor.heavy_armor;

import main.java.coin.Coin;
import main.java.coin.CoinType;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;

public class RingMailArmor extends Armor {
    public RingMailArmor() {
        this.name = "Ring mail";
        this.armorCategory = ArmorCategory.HEAVY_ARMOR;
        this.cost = new Coin(CoinType.GP, 30);
        this.baseArmorClass = 14;
        this.stealthDisadvantage = true;
        this.weight = 40;
    }
}
