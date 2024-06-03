package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class SignalWhistle extends Item {
    public SignalWhistle() {
        this.name = "SignalWhistle";
        this.cost = new Coin(CoinUnits.CP, 5);
        this.weight = 0.0;
    }
}
