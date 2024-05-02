package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class FineClothes extends Item {
    public FineClothes() {
        this.name = "FineClothes";
        this.cost = new Coin(CoinType.GP, 15);
        this.weight = 6.0;
    }
}
