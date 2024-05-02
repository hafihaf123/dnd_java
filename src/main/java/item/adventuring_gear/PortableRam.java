package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class PortableRam extends Item {
    public PortableRam() {
        this.name = "PortableRam";
        this.cost = new Coin(CoinType.GP, 4);
        this.weight = 35.0;
    }
}
