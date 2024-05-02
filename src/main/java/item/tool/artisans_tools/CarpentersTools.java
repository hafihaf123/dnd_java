package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class CarpentersTools extends Item implements ArtisansTools {
    public CarpentersTools() {
        this.name = "CarpentersTools";
        this.cost = new Coin(CoinType.GP, 8);
        this.weight = 6.0;
    }
}
