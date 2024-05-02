package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Manacles extends Item {
    public Manacles() {
        this.name = "Manacles";
        this.cost = new Coin(CoinType.GP, 2);
        this.weight = 6.0;
    }
}
