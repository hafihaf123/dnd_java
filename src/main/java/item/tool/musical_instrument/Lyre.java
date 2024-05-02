package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Lyre extends Item implements MusicalInstrument {
    public Lyre() {
        this.name = "Lyre";
        this.cost = new Coin(CoinType.GP, 30);
        this.weight = 2.0;
    }
}
