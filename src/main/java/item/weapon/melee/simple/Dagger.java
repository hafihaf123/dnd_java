package main.java.item.weapon.melee.simple;

import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.Weapon;

public class Dagger extends Weapon implements SimpleWeapon {

    public Dagger() {
        this.name = "Dagger";
        this.cost = new Coin(CoinType.GP, 2);
        this.damageType = DamageType.PIERCING;
        this.hitDice = new Dice(4);
        this.weight = 1;
        this.isFinesse = true;
        this.isLight = true;
        this.isThrown = true;
        this.normalRange = 20;
        this.maxRange = 60;
    }
}
