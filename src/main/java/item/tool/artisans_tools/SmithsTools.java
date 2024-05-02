package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class SmithsTools extends Item implements ArtisansTools {
    public SmithsTools() {
        this.name = "SmithsTools";
        this.cost = new Coin(CoinType.GP, 20);
        this.weight = 8.0;
    }
}
