package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Horn extends Item implements MusicalInstrument {
    public Horn() {
        this.name = "Horn";
        this.cost = new Coin(CoinType.GP, 3);
        this.weight = 2.0;
    }
}
