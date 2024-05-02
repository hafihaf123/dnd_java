package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class PanFlute extends Item implements MusicalInstrument {
    public PanFlute() {
        this.name = "PanFlute";
        this.cost = new Coin(CoinType.GP, 12);
        this.weight = 2.0;
    }
}
