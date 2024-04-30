package main.java.item.weapon.melee.simple;

import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.properties.LightWeapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.Weapon;

public class Club extends Weapon implements SimpleWeapon, LightWeapon {
    public Club() {
        this.name = "Club";
        this.cost = new Coin(CoinType.SP, 1);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(4);
        this.weight = 2;
    }
}
