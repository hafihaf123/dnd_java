package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.DruidicFocus;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class YewWand extends Item implements DruidicFocus {
    public YewWand() {
        this.name = "YewWand";
        this.cost = new Coin(CoinUnits.GP, 10);
        this.weight = 1.0;
    }
}
