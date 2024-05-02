package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class PaintersSupplies extends Item implements ArtisansTools {
    public PaintersSupplies() {
        this.name = "PaintersSupplies";
        this.cost = new Coin(CoinType.GP, 10);
        this.weight = 5.0;
    }
}