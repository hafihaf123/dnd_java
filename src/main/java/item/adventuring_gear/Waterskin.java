package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Waterskin extends Item {
    public Waterskin() {
        this.name = "Waterskin";
        this.cost = new Coin(CoinType.SP, 2);
        this.weight = 5.0;
    }
}
