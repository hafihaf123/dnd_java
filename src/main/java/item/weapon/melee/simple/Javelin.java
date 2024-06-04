package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.properties.ThrownWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Javelin extends Weapon implements SimpleWeapon, ThrownWeapon {
    public Javelin() {
        this.name = "Javelin";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.damageType = DamageType.PIERCING;
        this.hitDice = new Dice(6);
        this.weight = new Weight(WeightUnits.LB, 2);
        this.normalRange = 30;
        this.maxRange = 120;
    }
}
