package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class PottersTools extends Item implements ArtisansTools {
    public PottersTools() {
        this.name = "PottersTools";
        this.cost = new Coin(CoinUnits.GP, 10);
        this.weight = 3.0;
    }
}
