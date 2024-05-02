package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class MasonsTools extends Item implements ArtisansTools {
    public MasonsTools() {
        this.name = "MasonsTools";
        this.cost = new Coin(CoinType.GP, 10);
        this.weight = 8.0;
    }
}
