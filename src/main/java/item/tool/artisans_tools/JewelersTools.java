package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class JewelersTools extends Item implements ArtisansTools {
    public JewelersTools() {
        this.name = "JewelersTools";
        this.cost = new Coin(CoinUnits.GP, 25);
        this.weight = 2.0;
    }
}
