package main.java.item.weapon;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.Item;
import main.java.units.length.Length;

public abstract class Weapon extends Item {
    //damage
    protected Dice hitDice;
    protected int numOfRolls = 1;
    protected DamageType damageType;

    //special fields
    //thrown or ranged
    /** distance, after which the dealDamage roll has a disadvantage */
    protected Length normalRange;
    protected Length maxRange;
    //versatile
    protected Dice twoHandedHitDice;
}