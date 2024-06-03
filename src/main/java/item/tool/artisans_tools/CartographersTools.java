package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class CartographersTools extends Item implements ArtisansTools {
    public CartographersTools() {
        this.name = "CartographersTools";
        this.cost = new Coin(CoinUnits.GP, 15);
        this.weight = 6.0;
    }
}
