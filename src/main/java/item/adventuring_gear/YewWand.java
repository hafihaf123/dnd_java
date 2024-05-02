package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.DruidicFocus;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class YewWand extends Item implements DruidicFocus {
    public YewWand() {
        this.name = "YewWand";
        this.cost = new Coin(CoinType.GP, 10);
        this.weight = 1.0;
    }
}
