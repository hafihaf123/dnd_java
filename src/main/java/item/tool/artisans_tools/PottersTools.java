package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class PottersTools extends Item implements ArtisansTools {
    public PottersTools() {
        this.name = "PottersTools";
        this.cost = new Coin(CoinType.GP, 10);
        this.weight = 3.0;
    }
}
