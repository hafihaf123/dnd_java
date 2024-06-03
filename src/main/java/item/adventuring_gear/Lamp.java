package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Lamp extends Item {
    public Lamp() {
        this.name = "Lamp";
        this.cost = new Coin(CoinUnits.SP, 5);
        this.weight = 1.0;
    }
}
