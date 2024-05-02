package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class JewelersTools extends Item implements ArtisansTools {
    public JewelersTools() {
        this.name = "JewelersTools";
        this.cost = new Coin(CoinType.GP, 25);
        this.weight = 2.0;
    }
}
