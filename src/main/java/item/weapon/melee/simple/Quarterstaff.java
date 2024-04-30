package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.VersatileWeapon;

public class Quarterstaff extends Weapon implements SimpleWeapon, VersatileWeapon {
    public Quarterstaff() {
        this.name = "Quarterstaff";
        this.cost = new Coin(CoinType.SP, 2);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(6);
        this.weight = 4;
        this.twoHandedHitDice = new Dice(8);
    }
}
