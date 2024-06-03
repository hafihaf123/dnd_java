package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.weapon.properties.LightWeapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.ThrownWeapon;

public class LightHammer extends Weapon implements SimpleWeapon, ThrownWeapon, LightWeapon {
    public LightHammer() {
        this.name = "Light Hammer";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(4);
        this.weight = 2;
        this.normalRange = 20;
        this.maxRange = 60;
    }
}
