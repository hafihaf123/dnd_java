package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class SignetRing extends Item {
    public SignetRing() {
        this.name = "SignetRing";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = 0.0;
    }
}
