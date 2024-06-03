package main.java.item.weapon.melee.simple;

import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.properties.LightWeapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.Weapon;

public class Club extends Weapon implements SimpleWeapon, LightWeapon {
    public Club() {
        this.name = "Club";
        this.cost = new Coin(CoinUnits.SP, 1);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(4);
        this.weight = 2;
    }
}