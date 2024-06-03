package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class MasonsTools extends Item implements ArtisansTools {
    public MasonsTools() {
        this.name = "MasonsTools";
        this.cost = new Coin(CoinUnits.GP, 10);
        this.weight = 8.0;
    }
}
