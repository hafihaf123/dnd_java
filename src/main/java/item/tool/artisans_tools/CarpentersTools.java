package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class CarpentersTools extends Item implements ArtisansTools {
    public CarpentersTools() {
        this.name = "CarpentersTools";
        this.cost = new Coin(CoinUnits.GP, 8);
        this.weight = 6.0;
    }
}
