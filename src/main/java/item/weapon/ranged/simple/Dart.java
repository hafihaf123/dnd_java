package main.java.item.weapon.ranged.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.FinesseWeapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.properties.ThrownWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Dart extends Weapon implements SimpleWeapon, ThrownWeapon, FinesseWeapon {
    public Dart() {
        this.name = "Dart";
        this.cost = new Coin(CoinUnits.CP, 5);
        this.damageType = DamageType.PIERCING;
        this.hitDice = new Dice(4);
        this.weight = new Weight(WeightUnits.LB, 0.25);
        this.normalRange = new Length(LengthUnits.FT, 20);
        this.maxRange = new Length(LengthUnits.FT, 60);
    }
}
