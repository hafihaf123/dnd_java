package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class JugOrPitcher extends Item {
    public JugOrPitcher() {
        this.name = "JugOrPitcher";
        this.cost = new Coin(CoinType.CP, 2);
        this.weight = 4.0;
    }
}
