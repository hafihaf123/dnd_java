package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class MerchantsScale extends Item {
    public MerchantsScale() {
        this.name = "MerchantsScale";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 3.0;
    }
}
