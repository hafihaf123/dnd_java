package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class WeaversTools extends Item implements ArtisansTools {
    public WeaversTools() {
        this.name = "WeaversTools";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 5.0;
    }
}
