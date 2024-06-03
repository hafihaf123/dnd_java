package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Piton extends Item {
    public Piton() {
        this.name = "Piton";
        this.cost = new Coin(CoinUnits.CP, 5);
        this.weight = 0.25;
    }
}
