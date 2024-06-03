package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class FineClothes extends Item {
    public FineClothes() {
        this.name = "FineClothes";
        this.cost = new Coin(CoinUnits.GP, 15);
        this.weight = 6.0;
    }
}
