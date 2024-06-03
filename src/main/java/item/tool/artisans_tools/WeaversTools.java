package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class WeaversTools extends Item implements ArtisansTools {
    public WeaversTools() {
        this.name = "WeaversTools";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 5.0;
    }
}
