package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.AmmunitionAdventuringGear;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class SlingBullets extends Item implements AmmunitionAdventuringGear {
    public SlingBullets() {
        this.name = "SlingBullets";
        this.cost = new Coin(CoinType.CP, 4);
        this.weight = 1.5;
    }
}
