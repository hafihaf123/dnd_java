package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Bagpipes extends Item implements MusicalInstrument {
    public Bagpipes() {
        this.name = "Bagpipes";
        this.cost = new Coin(CoinType.GP, 30);
        this.weight = 6.0;
    }
}
