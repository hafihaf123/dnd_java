package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Pole extends Item {
    public Pole() {
        this.name = "Pole";
        this.cost = new Coin(CoinType.CP, 5);
        this.weight = 7.0;
    }
}