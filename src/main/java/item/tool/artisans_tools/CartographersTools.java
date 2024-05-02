package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class CartographersTools extends Item implements ArtisansTools {
    public CartographersTools() {
        this.name = "CartographersTools";
        this.cost = new Coin(CoinType.GP, 15);
        this.weight = 6.0;
    }
}
