package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class BrewersSupplies extends Item implements ArtisansTools {
    public BrewersSupplies() {
        this.name = "BrewersSupplies";
        this.cost = new Coin(CoinUnits.GP, 20);
        this.weight = 9.0;
    }
}
