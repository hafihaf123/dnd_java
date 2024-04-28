package main.java.item.armor;

import main.java.item.Item;

public abstract class Armor extends Item {
    protected ArmorCategory armorCategory;
    protected boolean stealthDisadvantage;
    protected int baseArmorClass;
    protected int strengthRequirement = 0;

    public int getArmorClass() throws IllegalArgumentException {
        if (armorCategory == ArmorCategory.LIGHT_ARMOR || armorCategory == ArmorCategory.MEDIUM_ARMOR)
            throw new IllegalArgumentException(STR."you must apply dexterity modifier to \{name}");
        return baseArmorClass;
    }

    public int getArmorClass(int wearerDexterityModifier) {
        if (armorCategory == ArmorCategory.HEAVY_ARMOR || armorCategory == ArmorCategory.SHIELD)
            return getArmorClass();
        if (armorCategory == ArmorCategory.MEDIUM_ARMOR && wearerDexterityModifier > 2)
            return baseArmorClass + 2;
        return baseArmorClass + wearerDexterityModifier;
    }

    public boolean isStrengthRequirementMet(int wearerStrength) {
        return wearerStrength > strengthRequirement;
    }

    public boolean hasStealthDisadvantage() {
        return stealthDisadvantage;
    }
}
