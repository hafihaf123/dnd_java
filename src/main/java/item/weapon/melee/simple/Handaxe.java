package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.properties.LightWeapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.ThrownWeapon;

public class Handaxe extends Weapon implements SimpleWeapon, ThrownWeapon, LightWeapon {
    public Handaxe() {
        this.name = "Handaxe";
        this.cost = new Coin(CoinType.GP, 5);
        this.damageType = DamageType.SLASHING;
        this.hitDice = new Dice(6);
        this.weight = 2;
        this.normalRange = 20;
        this.maxRange = 60;
    }
}
