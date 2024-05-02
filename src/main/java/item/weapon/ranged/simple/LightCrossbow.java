package main.java.item.weapon.ranged.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.AmmunitionWeapon;
import main.java.item.weapon.properties.LoadingWeapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.properties.TwoHandedWeapon;

public class LightCrossbow extends Weapon implements SimpleWeapon, AmmunitionWeapon, LoadingWeapon, TwoHandedWeapon {
    public LightCrossbow() {
        this.name = "Crossbow, light";
        this.cost = new Coin(CoinType.GP, 25);
        this.damageType = DamageType.PIERCING;
        this.hitDice = new Dice(8);
        this.weight = 5;
        this.normalRange = 80;
        this.maxRange = 320;
    }
}