package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.LightWeapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.properties.ThrownWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Handaxe extends Weapon implements SimpleWeapon, ThrownWeapon, LightWeapon {
    public Handaxe() {
        this.name = "Handaxe";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.damageType = DamageType.SLASHING;
        this.hitDice = new Dice(6);
        this.weight = new Weight(WeightUnits.LB, 2);
        this.normalRange = 20;
        this.maxRange = 60;
    }
}
