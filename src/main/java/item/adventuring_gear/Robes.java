package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Robes extends Item {
    public Robes() {
        this.name = "Robes";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 4.0;
    }
}
