package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class SignetRing extends Item {
    public SignetRing() {
        this.name = "SignetRing";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 0.0;
    }
}
