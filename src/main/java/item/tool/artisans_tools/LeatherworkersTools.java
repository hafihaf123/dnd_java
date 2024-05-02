package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class LeatherworkersTools extends Item implements ArtisansTools {
    public LeatherworkersTools() {
        this.name = "LeatherworkersTools";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 5.0;
    }
}
