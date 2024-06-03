package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Manacles extends Item {
    public Manacles() {
        this.name = "Manacles";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.weight = 6.0;
    }
}
