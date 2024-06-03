package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class GlassblowersTools extends Item implements ArtisansTools {
    public GlassblowersTools() {
        this.name = "GlassblowersTools";
        this.cost = new Coin(CoinUnits.GP, 30);
        this.weight = 5.0;
    }
}
