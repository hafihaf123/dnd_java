package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Antitoxin extends Item {
    public Antitoxin() {
        this.name = "Antitoxin";
        this.cost = new Coin(CoinUnits.GP, 50);
        this.weight = 0.0;
    }
}
