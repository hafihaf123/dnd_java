package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Vial extends Item {
    public Vial() {
        this.name = "Vial";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 0.0;
    }
}
