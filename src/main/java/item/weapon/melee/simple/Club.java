package main.java.item.weapon.melee.simple;

import main.java.coin.Coin;
import main.java.coin.CoinType;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.SimpleWeapon;
import main.java.item.weapon.melee.MeleeWeapon;

public class Club extends MeleeWeapon implements SimpleWeapon {
    public Club() {
        this.name = "Club";
        this.isMartial = false;
        this.cost = new Coin(CoinType.SP, 1);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(4);
        this.weight = 2;
        this.isLight = true;
    }
}
