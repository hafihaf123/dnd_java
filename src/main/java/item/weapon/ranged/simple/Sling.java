package main.java.item.weapon.ranged.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.AmmunitionWeapon;
import main.java.item.weapon.properties.SimpleWeapon;

public class Sling extends Weapon implements SimpleWeapon, AmmunitionWeapon {
    public Sling() {
        this.name = "Sling";
        this.cost = new Coin(CoinType.SP, 1);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(4);
        this.weight = 0;
        this.normalRange = 30;
        this.maxRange = 120;
    }
}
