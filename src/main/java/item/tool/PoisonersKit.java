package main.java.item.tool;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class PoisonersKit extends Item {
    public PoisonersKit() {
        this.name = "PoisonersKit";
        this.cost = new Coin(CoinUnits.GP, 50);
        this.weight = 2.0;
    }
}
