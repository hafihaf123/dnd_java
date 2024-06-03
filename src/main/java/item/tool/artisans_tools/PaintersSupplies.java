package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class PaintersSupplies extends Item implements ArtisansTools {
    public PaintersSupplies() {
        this.name = "PaintersSupplies";
        this.cost = new Coin(CoinUnits.GP, 10);
        this.weight = 5.0;
    }
}
