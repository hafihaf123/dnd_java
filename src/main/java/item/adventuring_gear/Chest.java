package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Chest extends Item {
    public Chest() {
        this.name = "Chest";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = 25.0;
    }
}
