package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class BrewersSupplies extends Item implements ArtisansTools {
    public BrewersSupplies() {
        this.name = "BrewersSupplies";
        this.cost = new Coin(CoinType.GP, 20);
        this.weight = 9.0;
    }
}
