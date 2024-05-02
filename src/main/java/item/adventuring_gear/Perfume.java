package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Perfume extends Item {
    public Perfume() {
        this.name = "Perfume";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 0.0;
    }
}
