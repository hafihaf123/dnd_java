package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Dulcimer extends Item implements MusicalInstrument {
    public Dulcimer() {
        this.name = "Dulcimer";
        this.cost = new Coin(CoinType.GP, 25);
        this.weight = 10.0;
    }
}
