package main.java.item.weapon.melee.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.Weapon;

public class LightHammer extends Weapon implements SimpleWeapon {
    public LightHammer() {
        this.name = "Light Hammer";
        this.cost = new Coin(CoinType.GP, 2);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(4);
        this.weight = 2;
        this.isLight = true;
        this.isThrown = true;
        this.normalRange = 20;
        this.maxRange = 60;
    }
}
