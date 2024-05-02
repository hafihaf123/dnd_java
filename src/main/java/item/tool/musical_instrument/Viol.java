package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Viol extends Item implements MusicalInstrument {
    public Viol() {
        this.name = "Viol";
        this.cost = new Coin(CoinType.GP, 30);
        this.weight = 1.0;
    }
}
