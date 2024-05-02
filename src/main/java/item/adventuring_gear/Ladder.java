package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Ladder extends Item {
    public Ladder() {
        this.name = "Ladder";
        this.cost = new Coin(CoinType.SP, 1);
        this.weight = 25.0;
    }
}
