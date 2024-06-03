package main.java.item.tool;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class ThievesTools extends Item {
    public ThievesTools() {
        this.name = "ThievesTools";
        this.cost = new Coin(CoinUnits.GP, 25);
        this.weight = 1.0;
    }
}
