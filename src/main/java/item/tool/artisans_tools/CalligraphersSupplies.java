package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class CalligraphersSupplies extends Item implements ArtisansTools {
    public CalligraphersSupplies() {
        this.name = "CalligraphersSupplies";
        this.cost = new Coin(CoinType.GP, 10);
        this.weight = 5.0;
    }
}
