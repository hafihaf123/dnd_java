package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Perfume extends Item {
    public Perfume() {
        this.name = "Perfume";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = 0.0;
    }
}
