package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class SignalWhistle extends Item {
    public SignalWhistle() {
        this.name = "SignalWhistle";
        this.cost = new Coin(CoinType.CP, 5);
        this.weight = 0.0;
    }
}
