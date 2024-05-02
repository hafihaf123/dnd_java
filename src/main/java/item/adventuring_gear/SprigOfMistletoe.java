package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.DruidicFocus;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class SprigOfMistletoe extends Item implements DruidicFocus {
    public SprigOfMistletoe() {
        this.name = "SprigOfMistletoe";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 0.0;
    }
}
