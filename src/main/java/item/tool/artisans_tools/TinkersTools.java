package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class TinkersTools extends Item implements ArtisansTools {
    public TinkersTools() {
        this.name = "TinkersTools";
        this.cost = new Coin(CoinType.GP, 50);
        this.weight = 10.0;
    }
}
