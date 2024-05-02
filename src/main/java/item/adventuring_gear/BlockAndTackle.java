package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class BlockAndTackle extends Item {
    public BlockAndTackle() {
        this.name = "BlockAndTackle";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 5.0;
    }
}
