package main.java.item.weapon.ranged.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.AmmunitionWeapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.properties.TwoHandedWeapon;

public class Shortbow extends Weapon implements SimpleWeapon, AmmunitionWeapon, TwoHandedWeapon {
    public Shortbow() {
        this.name = "Shortbow";
        this.cost = new Coin(CoinType.GP, 25);
        this.damageType = DamageType.PIERCING;
        this.hitDice = new Dice(6);
        this.weight = 2;
        this.normalRange = 80;
        this.maxRange = 320;
    }
}
