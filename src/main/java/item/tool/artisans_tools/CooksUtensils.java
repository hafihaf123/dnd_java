package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class CooksUtensils extends Item implements ArtisansTools {
    public CooksUtensils() {
        this.name = "CooksUtensils";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 8.0;
    }
}
