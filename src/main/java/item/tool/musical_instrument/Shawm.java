package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Shawm extends Item implements MusicalInstrument {
    public Shawm() {
        this.name = "Shawm";
        this.cost = new Coin(CoinType.GP, 2);
        this.weight = 1.0;
    }
}
