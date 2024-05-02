package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class MapOrScrollCase extends Item {
    public MapOrScrollCase() {
        this.name = "MapOrScrollCase";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 1.0;
    }
}
