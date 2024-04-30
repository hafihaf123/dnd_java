package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.TwoHandedWeapon;

public class Greatclub extends Weapon implements SimpleWeapon, TwoHandedWeapon {
    public Greatclub() {
        this.name = "Greatclub";
        this.cost = new Coin(CoinType.SP, 2);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(8);
        this.weight = 10;
    }
}
