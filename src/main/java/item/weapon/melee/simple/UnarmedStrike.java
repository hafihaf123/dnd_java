package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.SimpleWeapon;

public class UnarmedStrike extends Weapon implements SimpleWeapon {
    public UnarmedStrike() {
        this.name = "Unarmed strike";
        this.cost = new Coin(CoinUnits.CP, 0);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(1);
        this.weight = 0;
    }
}
