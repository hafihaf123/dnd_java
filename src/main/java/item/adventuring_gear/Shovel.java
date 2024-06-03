package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Shovel extends Item {
    public Shovel() {
        this.name = "Shovel";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.weight = 5.0;
    }
}
