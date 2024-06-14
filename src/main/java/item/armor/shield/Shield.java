package main.java.item.armor.shield;

import main.java.item.Item;
import main.java.item.armor.Armor;
import main.java.item.armor.ArmorCategory;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Shield extends Item {
    public Shield() {
        this.name = "Shield";
        this.cost = new Coin(CoinUnits.GP, 10);
        this.weight = new Weight(WeightUnits.LB, 6);
    }
}
