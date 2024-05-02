package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Oil extends Item {
    public Oil() {
        this.name = "Oil";
        this.cost = new Coin(CoinType.SP, 1);
        this.weight = 1.0;
    }
}
