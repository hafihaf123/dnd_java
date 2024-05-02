package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.DruidicFocus;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class WoodenStaff extends Item implements DruidicFocus {
    public WoodenStaff() {
        this.name = "WoodenStaff";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 4.0;
    }
}
