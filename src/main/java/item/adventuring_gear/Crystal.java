package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.ArcaneFocus;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Crystal extends Item implements ArcaneFocus {
    public Crystal() {
        this.name = "Crystal";
        this.cost = new Coin(CoinType.GP, 10);
        this.weight = 1.0;
    }
}
