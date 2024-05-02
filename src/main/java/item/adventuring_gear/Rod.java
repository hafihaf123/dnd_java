package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.ArcaneFocus;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Rod extends Item implements ArcaneFocus {
    public Rod() {
        this.name = "Rod";
        this.cost = new Coin(CoinType.GP, 10);
        this.weight = 2.0;
    }
}
