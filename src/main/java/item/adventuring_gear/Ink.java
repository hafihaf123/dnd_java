package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Ink extends Item {
    public Ink() {
        this.name = "Ink";
        this.cost = new Coin(CoinType.GP, 10);
        this.weight = 0.0;
    }
}
