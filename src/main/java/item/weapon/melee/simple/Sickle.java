package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.LightWeapon;
import main.java.item.weapon.properties.SimpleWeapon;

public class Sickle extends Weapon implements SimpleWeapon, LightWeapon {
    public Sickle() {
        this.name = "Sickle";
        this.cost = new Coin(CoinType.GP, 1);
        this.damageType = DamageType.SLASHING;
        this.hitDice = new Dice(4);
        this.weight = 2;
    }
}
