package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.properties.VersatileWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Quarterstaff extends Weapon implements SimpleWeapon, VersatileWeapon {
    public Quarterstaff() {
        this.name = "Quarterstaff";
        this.cost = new Coin(CoinUnits.SP, 2);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(6);
        this.weight = new Weight(WeightUnits.LB, 4);
        this.twoHandedHitDice = new Dice(8);
    }
}
