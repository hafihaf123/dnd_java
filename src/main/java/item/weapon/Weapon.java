package main.java.item.weapon;

import main.java.creature.Creature;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.Item;

public abstract class Weapon extends Item {
    protected Dice hitDice;
    protected int numOfRolls = 1;
    protected DamageType damageType;

    // weapon properties
    protected boolean isMartial;
    protected boolean isFinesse;
    protected boolean isHeavy;
    protected boolean isLight;
    protected boolean isReach;
    protected boolean isSpecial;
    protected boolean isThrown;
    /** in feet */
    protected int normalRange = 20;
    /** distance in feet, after which the dealDamage roll has a disadvantage */
    protected int maxRange = 60;
    protected boolean isTwoHanded;
    protected boolean isVersatile;


    public void dealDamage(int distance, Creature enemy, Creature wearer) {
        if (!isTargetInRange(distance))
            return;
        if (!hasHit(enemy.getArmorClass(), wearer))
            return;
    }
    public abstract boolean hasHit(int enemyArmorClass, Creature wearer);

    /** @param distance in feet */
    public abstract boolean isTargetInRange(int distance);
    public boolean hasProficiency() throws RuntimeException {
        throw new RuntimeException("Function 'hasProficiency' is not yet implemented.");
//        return !this.isMartial;
    }
}
