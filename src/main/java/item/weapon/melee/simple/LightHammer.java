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

public class LightHammer extends Weapon implements SimpleWeapon, ThrownWeapon, LightWeapon {
    public LightHammer() {
        this.name = "Light Hammer";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(4);
        this.weight = new Weight(WeightUnits.LB, 2);
        this.normalRange = 20;
        this.maxRange = 60;
    }
}
