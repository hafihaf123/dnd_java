package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Pouch extends Item {
    public Pouch() {
        this.name = "Pouch";
        this.cost = new Coin(CoinUnits.SP, 5);
        this.weight = 1.0;
    }
}
