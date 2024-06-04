package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.properties.ThrownWeapon;
import main.java.item.weapon.properties.VersatileWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Spear extends Weapon implements SimpleWeapon, ThrownWeapon, VersatileWeapon {
    public Spear() {
        this.name = "Spear";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.damageType = DamageType.PIERCING;
        this.hitDice = new Dice(6);
        this.weight = new Weight(WeightUnits.LB, 3);
        this.normalRange = 20;
        this.maxRange = 60;
        this.twoHandedHitDice = new Dice(8);
    }
}
