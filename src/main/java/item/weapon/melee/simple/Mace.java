package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.Weapon;

public class Mace extends Weapon implements SimpleWeapon {
    public Mace() {
        this.name = "Mace";
        this.cost = new Coin(CoinType.GP, 5);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(6);
        this.weight = 4;
    }
}
