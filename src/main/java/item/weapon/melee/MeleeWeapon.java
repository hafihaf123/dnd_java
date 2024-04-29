package main.java.item.weapon.melee;

import main.java.attributes.Attribute;
import main.java.creature.Creature;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;

import java.util.Scanner;

public abstract class MeleeWeapon extends Weapon {
    @Override
    public boolean isTargetInRange(int distance) throws UnsupportedOperationException {
        if (this.isThrown)
            throw new UnsupportedOperationException("The weapon has the 'thrown' property. Please call an appropriate function.");
        if (this.isSpecial)
            throw new UnsupportedOperationException("The weapon has the 'special' property. Please call an appropriate function.");
        if (this.isReach && distance <= 10)
            return true;
        return distance <= 5;
    }

    @Override
    public boolean hasHit(int enemyArmorClass, Creature wearer) throws IllegalArgumentException, UnsupportedOperationException {
        if (this.isSpecial)
            throw new UnsupportedOperationException("The weapon has the 'special' property. Please call an appropriate function.");

        Dice d20 = new Dice(20);
        int roll = d20.roll();
        if (this.isHeavy) {
            int newRoll = d20.roll();
            if (newRoll < roll)
                roll = newRoll;
        }

        if (hasProficiency())
            roll += wearer.getProficiencyBonus();
        if (this.isFinesse) {
            System.out.println("Which modifier do you want to use? (STR/DEX)");
            Scanner scanner = new Scanner(System.in);
            Attribute attribute = Attribute.valueOf(scanner.next());
            if (attribute == Attribute.DEX || attribute == Attribute.STR)
                roll += wearer.getAttributes().getModifier(attribute);
            else
                throw new IllegalArgumentException(STR."Invalid attribute choice: \{attribute}");
        } else
            roll += wearer.getAttributes().getModifier(Attribute.STR);

        return roll >= enemyArmorClass;
    }

    @Override
    public void dealDamage(int distance, Creature enemy, Creature wearer) throws IllegalArgumentException, UnsupportedOperationException {
        if (this.isSpecial)
            throw new UnsupportedOperationException("The weapon has the 'special' property. Please call an appropriate function.");
        if (this.isVersatile)
            throw new UnsupportedOperationException("The weapon has the 'versatile' property. Please call an appropriate function.");

        super.dealDamage(distance, enemy, wearer);

        int damageRoll = this.hitDice.roll(this.numOfRolls);

        if (this.isFinesse) {
            System.out.println("Which modifier do you want to use? (STR/DEX)");
            Scanner scanner = new Scanner(System.in);
            Attribute attribute = Attribute.valueOf(scanner.next());
            if (attribute == Attribute.DEX || attribute == Attribute.STR)
                damageRoll += wearer.getAttributes().getModifier(attribute);
            else
                throw new IllegalArgumentException(STR."Invalid attribute choice: \{attribute}");
        } else
            damageRoll += wearer.getAttributes().getModifier(Attribute.STR);

        enemy.damage(damageRoll, this.damageType);
    }
}
