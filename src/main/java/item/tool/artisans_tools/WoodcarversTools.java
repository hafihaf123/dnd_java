package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class WoodcarversTools extends Item implements ArtisansTools {
    public WoodcarversTools() {
        this.name = "WoodcarversTools";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 5.0;
    }
}
