package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.properties.TwoHandedWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Greatclub extends Weapon implements SimpleWeapon, TwoHandedWeapon {
    public Greatclub() {
        this.name = "Greatclub";
        this.cost = new Coin(CoinUnits.SP, 2);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(8);
        this.weight = new Weight(WeightUnits.LB, 10);
    }
}
