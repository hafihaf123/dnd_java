package main.java.item.tool;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class HerbalismKit extends Item {
    public HerbalismKit() {
        this.name = "HerbalismKit";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = 3.0;
    }
}
