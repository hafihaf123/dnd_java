package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class JugOrPitcher extends Item {
    public JugOrPitcher() {
        this.name = "JugOrPitcher";
        this.cost = new Coin(CoinUnits.CP, 2);
        this.weight = 4.0;
    }
}
