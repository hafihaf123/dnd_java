package main.java.proficiency;

import main.java.attributes.Attribute;
import main.java.item.armor.ArmorCategory;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.WeaponType;
import main.java.skills.Skill;

import java.util.Set;

public class Proficiencies {
    private final Set<Skill> skillProficiencies;
    private final Set<Attribute> savingThrowProficiencies;
    private final Set<ArmorCategory> armorCategoryProficiencies;
    private final Set<WeaponType> weaponTypeProficiencies;
    private final Set<Weapon> weaponProficiencies;

    public Proficiencies(
            Set<Skill> skillProficiencies,
            Set<Attribute> savingThrowProficiencies,
            Set<ArmorCategory> armorCategoryProficiencies,
            Set<WeaponType> weaponTypeProficiencies,
            Set<Weapon> weaponProficiencies
    ) {
        this.skillProficiencies = skillProficiencies;
        this.savingThrowProficiencies = savingThrowProficiencies;
        this.armorCategoryProficiencies = armorCategoryProficiencies;
        this.weaponTypeProficiencies = weaponTypeProficiencies;
        this.weaponProficiencies = weaponProficiencies;
    }

    public void addProficiency(Skill skill) {
        skillProficiencies.add(skill);
    }

    public void removeProficiency(Skill skill) {
        skillProficiencies.remove(skill);
    }

    public boolean hasProficiency(Skill skill) {
        return skillProficiencies.contains(skill);
    }

    public void addProficiency(Attribute attribute) {
        savingThrowProficiencies.add(attribute);
    }

    public void removeProficiency(Attribute attribute) {
        savingThrowProficiencies.remove(attribute);
    }

    public boolean hasProficiency(Attribute attribute) {
        return savingThrowProficiencies.contains(attribute);
    }

    public void addProficiency(ArmorCategory armorCategory) {
        armorCategoryProficiencies.add(armorCategory);
    }

    public void removeProficiency(ArmorCategory armorCategory) {
        armorCategoryProficiencies.remove(armorCategory);
    }

    public boolean hasProficiency(ArmorCategory armorCategory) {
        return armorCategoryProficiencies.contains(armorCategory);
    }

    public void addProficiency(WeaponType weaponType) {
        weaponTypeProficiencies.add(weaponType);
    }

    public void removeProficiency(WeaponType weaponType) {
        weaponTypeProficiencies.remove(weaponType);
    }

    public boolean hasProficiency(WeaponType weaponType) {
        return weaponTypeProficiencies.contains(weaponType);
    }

    public void addProficiency(Weapon weapon) {
        weaponProficiencies.add(weapon);
    }

    public void removeProficiency(Weapon weapon) {
        weaponProficiencies.remove(weapon);
    }

    public boolean hasProficiency(Weapon weapon) {
        return weaponProficiencies.contains(weapon);
    }
}
