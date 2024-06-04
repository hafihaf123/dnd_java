package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.LightWeapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Sickle extends Weapon implements SimpleWeapon, LightWeapon {
    public Sickle() {
        this.name = "Sickle";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.damageType = DamageType.SLASHING;
        this.hitDice = new Dice(4);
        this.weight = new Weight(WeightUnits.LB, 2);
    }
}
