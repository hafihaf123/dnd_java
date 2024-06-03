package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class CalligraphersSupplies extends Item implements ArtisansTools {
    public CalligraphersSupplies() {
        this.name = "CalligraphersSupplies";
        this.cost = new Coin(CoinUnits.GP, 10);
        this.weight = 5.0;
    }
}
