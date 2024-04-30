package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.properties.ThrownWeapon;
import main.java.item.weapon.properties.VersatileWeapon;

public class Spear extends Weapon implements SimpleWeapon, ThrownWeapon, VersatileWeapon {
    public Spear() {
        this.name = "Spear";
        this.cost = new Coin(CoinType.GP, 1);
        this.damageType = DamageType.PIERCING;
        this.hitDice = new Dice(6);
        this.weight = 3;
        this.normalRange = 20;
        this.maxRange = 60;
        this.twoHandedHitDice = new Dice(8);
    }
}
