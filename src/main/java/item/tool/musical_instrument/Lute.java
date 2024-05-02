package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Lute extends Item implements MusicalInstrument {
    public Lute() {
        this.name = "Lute";
        this.cost = new Coin(CoinType.GP, 35);
        this.weight = 2.0;
    }
}
