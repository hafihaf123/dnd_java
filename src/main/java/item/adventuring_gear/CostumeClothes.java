package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class CostumeClothes extends Item {
    public CostumeClothes() {
        this.name = "CostumeClothes";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 4.0;
    }
}
