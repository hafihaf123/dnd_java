package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Antitoxin extends Item {
    public Antitoxin() {
        this.name = "Antitoxin";
        this.cost = new Coin(CoinType.GP, 50);
        this.weight = 0.0;
    }
}
