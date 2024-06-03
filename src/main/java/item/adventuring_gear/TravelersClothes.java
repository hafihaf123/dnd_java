package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class TravelersClothes extends Item {
    public TravelersClothes() {
        this.name = "TravelersClothes";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.weight = 4.0;
    }
}
