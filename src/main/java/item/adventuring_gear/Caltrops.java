package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Caltrops extends Item {
    public Caltrops() {
        this.name = "Caltrops";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 2.0;
    }
}
