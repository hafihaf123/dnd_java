package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Chest extends Item {
    public Chest() {
        this.name = "Chest";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 25.0;
    }
}