package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class CobblersTools extends Item implements ArtisansTools {
    public CobblersTools() {
        this.name = "CobblersTools";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = 5.0;
    }
}
