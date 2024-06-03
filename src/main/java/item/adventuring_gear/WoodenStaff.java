package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.DruidicFocus;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class WoodenStaff extends Item implements DruidicFocus {
    public WoodenStaff() {
        this.name = "WoodenStaff";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = 4.0;
    }
}
