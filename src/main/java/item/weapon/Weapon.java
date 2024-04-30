package main.java.item.weapon;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.Item;

public abstract class Weapon extends Item {
    //damage
    protected Dice hitDice;
    protected int numOfRolls = 1;
    protected DamageType damageType;

    //special fields
    //thrown or ranged
    /** distance in feet, after which the dealDamage roll has a disadvantage */
    protected int normalRange;
    /** in feet */
    protected int maxRange;
    //versatile
    protected Dice twoHandedHitDice;
}