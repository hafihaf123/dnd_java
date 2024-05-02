package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class TravelersClothes extends Item {
    public TravelersClothes() {
        this.name = "TravelersClothes";
        this.cost = new Coin(CoinType.GP, 2);
        this.weight = 4.0;
    }
}
