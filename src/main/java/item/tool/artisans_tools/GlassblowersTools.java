package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class GlassblowersTools extends Item implements ArtisansTools {
    public GlassblowersTools() {
        this.name = "GlassblowersTools";
        this.cost = new Coin(CoinUnits.GP, 30);
        this.weight = new Weight(WeightUnits.LB, 5.0);
    }
}
