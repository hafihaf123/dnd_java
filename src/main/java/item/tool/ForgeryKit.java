package main.java.item.tool;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class ForgeryKit extends Item {
    public ForgeryKit() {
        this.name = "ForgeryKit";
        this.cost = new Coin(CoinUnits.GP, 15);
        this.weight = 5.0;
    }
}
