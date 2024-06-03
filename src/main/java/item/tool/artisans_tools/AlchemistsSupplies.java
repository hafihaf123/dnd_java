package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class AlchemistsSupplies extends Item implements ArtisansTools {
    public AlchemistsSupplies() {
        this.name = "AlchemistsSupplies";
        this.cost = new Coin(CoinUnits.GP, 50);
        this.weight = 8.0;
    }
}
