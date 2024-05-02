package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Vial extends Item {
    public Vial() {
        this.name = "Vial";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 0.0;
    }
}
