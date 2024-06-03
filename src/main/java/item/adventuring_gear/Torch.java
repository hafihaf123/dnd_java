package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Torch extends Item {
    public Torch() {
        this.name = "Torch";
        this.cost = new Coin(CoinUnits.CP, 1);
        this.weight = 1.0;
    }
}
