package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class TinkersTools extends Item implements ArtisansTools {
    public TinkersTools() {
        this.name = "TinkersTools";
        this.cost = new Coin(CoinUnits.GP, 50);
        this.weight = new Weight(WeightUnits.LB, 10.0);
    }
}
