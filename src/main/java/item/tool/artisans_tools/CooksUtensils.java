package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class CooksUtensils extends Item implements ArtisansTools {
    public CooksUtensils() {
        this.name = "CooksUtensils";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 8.0;
    }
}
