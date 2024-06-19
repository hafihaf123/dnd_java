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

    public Dice getHitDice() {
        return hitDice;
    }

    public void setHitDice(Dice hitDice) {
        this.hitDice = hitDice;
    }

    public int getNumOfRolls() {
        return numOfRolls;
    }

    public void setNumOfRolls(int numOfRolls) {
        this.numOfRolls = numOfRolls;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public Length getNormalRange() {
        return normalRange;
    }

    public void setNormalRange(Length normalRange) {
        this.normalRange = normalRange;
    }

    public Length getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(Length maxRange) {
        this.maxRange = maxRange;
    }

    public Dice getTwoHandedHitDice() {
        return twoHandedHitDice;
    }

    public void setTwoHandedHitDice(Dice twoHandedHitDice) {
        this.twoHandedHitDice = twoHandedHitDice;
    }
}