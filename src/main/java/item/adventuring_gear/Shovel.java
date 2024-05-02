package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Shovel extends Item {
    public Shovel() {
        this.name = "Shovel";
        this.cost = new Coin(CoinType.GP, 2);
        this.weight = 5.0;
    }
}