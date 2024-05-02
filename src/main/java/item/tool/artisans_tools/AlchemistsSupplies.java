package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class AlchemistsSupplies extends Item implements ArtisansTools {
    public AlchemistsSupplies() {
        this.name = "AlchemistsSupplies";
        this.cost = new Coin(CoinType.GP, 50);
        this.weight = 8.0;
    }
}
