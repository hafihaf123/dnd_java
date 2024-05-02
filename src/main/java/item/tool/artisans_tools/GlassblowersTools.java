package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class GlassblowersTools extends Item implements ArtisansTools {
    public GlassblowersTools() {
        this.name = "GlassblowersTools";
        this.cost = new Coin(CoinType.GP, 30);
        this.weight = 5.0;
    }
}
