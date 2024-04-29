package main.java.item.weapon.melee.simple;

import main.java.coin.Coin;
import main.java.coin.CoinType;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.SimpleWeapon;
import main.java.item.weapon.melee.MeleeWeapon;

public class Dagger extends MeleeWeapon implements SimpleWeapon {

    public Dagger() {
        this.name = "Dagger";
        this.isMartial = false;
        this.cost = new Coin(CoinType.GP, 2);
        this.damageType = DamageType.PIERCING;
        this.hitDice = new Dice(4);
        this.weight = 1;
        this.isFinesse = true;
        this.isLight = true;
        this.isThrown = true;
        this.normalRange = 20;
        this.maxRange = 60;
    }

    @Override
    public boolean isTargetInRange(int distance) {
        return distance <= maxRange;
    }
}
