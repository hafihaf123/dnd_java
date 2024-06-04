package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class CarpentersTools extends Item implements ArtisansTools {
    public CarpentersTools() {
        this.name = "CarpentersTools";
        this.cost = new Coin(CoinUnits.GP, 8);
        this.weight = new Weight(WeightUnits.LB, 6.0);
    }
}
