package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class BlockAndTackle extends Item {
    public BlockAndTackle() {
        this.name = "BlockAndTackle";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 5.0;
    }
}
