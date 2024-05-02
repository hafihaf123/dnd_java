package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Abacus extends Item {
    public Abacus() {
        this.name = "Abacus";
        this.cost = new Coin(CoinType.GP, 2);
        this.weight = 2.0;
    }
}
