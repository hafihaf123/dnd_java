package main.java.item.weapon;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.Item;

public abstract class Weapon extends Item {
    protected Dice hitDice;
    protected int numOfRolls = 1;
    protected DamageType damageType;

    // weapon properties
    protected boolean isFinesse;
    protected boolean isHeavy;
    protected boolean isLight;
    protected boolean isReach;
    protected boolean isSpecial;
    protected boolean isThrown;
    /** distance in feet, after which the dealDamage roll has a disadvantage */
    protected int normalRange = 20;
    /** in feet */
    protected int maxRange = 60;
    protected boolean isTwoHanded;
    protected boolean isVersatile;
}