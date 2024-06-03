package main.java.item.weapon.ranged.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.FinesseWeapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.properties.ThrownWeapon;

public class Dart extends Weapon implements SimpleWeapon, ThrownWeapon, FinesseWeapon {
    public Dart() {
        this.name = "Dart";
        this.cost = new Coin(CoinUnits.CP, 5);
        this.damageType = DamageType.PIERCING;
        this.hitDice = new Dice(4);
        this.weight = 0.25;
        this.normalRange = 20;
        this.maxRange = 60;
    }
}
