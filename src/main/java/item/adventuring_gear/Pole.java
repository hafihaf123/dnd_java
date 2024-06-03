package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Pole extends Item {
    public Pole() {
        this.name = "Pole";
        this.cost = new Coin(CoinUnits.CP, 5);
        this.weight = 7.0;
    }
}
