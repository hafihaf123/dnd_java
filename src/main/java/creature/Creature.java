package main.java.creature;

import main.java.creature.properties.alignment.Alignment;
import main.java.creature.properties.attributes.Attributes;
import main.java.damage.DamageType;
import main.java.creature.properties.language.Language;
import main.java.creature.properties.size.SizeCategory;

import java.util.Set;

public abstract class Creature {
    protected String name;
    protected int armorClass;
    protected int maxHP;
    protected int currentHP;
    /** in feet */
    protected int speed;
    protected Attributes attributes;
    protected Set<Language> languages;
    protected Alignment alignment;
    protected SizeCategory size;

    //in progress
    protected int proficiencyBonus;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorClass() {
        return this.armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getCurrentHP() {
        return this.currentHP;
    }

    public void heal(int hp) {
        this.currentHP += hp;
        if (this.currentHP > this.maxHP)
            this.currentHP = this.maxHP;
    }

    public void damage(int damage, DamageType damageType) {
        // TODO check for vulnerabilities, resistances and immunities

        this.currentHP -= damage;
        if (this.currentHP <= 0)
            this.die();
    }

    public void die() {
        // TODO

        System.out.println(STR."\{this.name} has died.");
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void increaseMaxHP(int hp) {
        this.maxHP += hp;
    }

    public void decreaseMaxHP(int hp) {
        this.maxHP -= hp;
        if (this.maxHP <= 0)
            this.die();
        if (this.currentHP > this.maxHP)
            this.currentHP = this.maxHP;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Attributes getAttributes() {
        return this.attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public void addLanguage(Language language) {
        this.languages.add(language);
    }

    public void removeLanguage(Language language) {
        this.languages.remove(language);
    }

    public Alignment getAlignment() {
        return this.alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public SizeCategory getSize() {
        return this.size;
    }

    public void setSize(SizeCategory size) {
        this.size = size;
    }

    public int getProficiencyBonus() {
        return this.proficiencyBonus;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }
}
