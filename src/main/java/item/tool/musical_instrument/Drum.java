package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Drum extends Item implements MusicalInstrument {
    public Drum() {
        this.name = "Drum";
        this.cost = new Coin(CoinType.GP, 6);
        this.weight = 3.0;
    }
}
