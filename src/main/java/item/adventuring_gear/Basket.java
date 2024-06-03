package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Basket extends Item {
    public Basket() {
        this.name = "Basket";
        this.cost = new Coin(CoinUnits.SP, 4);
        this.weight = 2.0;
    }
}
