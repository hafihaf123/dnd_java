package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class CostumeClothes extends Item {
    public CostumeClothes() {
        this.name = "CostumeClothes";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = 4.0;
    }
}
