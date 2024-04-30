package main.java.item.armor;

import main.java.item.Item;

public abstract class Armor extends Item {
    protected ArmorCategory armorCategory;
    protected boolean stealthDisadvantage;
    protected int baseArmorClass;
    protected int strengthRequirement = 0;

    public int getArmorClass(int wearerDexterityModifier) {
        if (this.armorCategory == ArmorCategory.HEAVY_ARMOR || this.armorCategory == ArmorCategory.SHIELD)
            return this.baseArmorClass;
        if (this.armorCategory == ArmorCategory.MEDIUM_ARMOR && wearerDexterityModifier > 2)
            return this.baseArmorClass + 2;
        return this.baseArmorClass + wearerDexterityModifier;
    }

    public boolean isStrengthRequirementMet(int wearerStrength) {
        return wearerStrength > this.strengthRequirement;
    }

    public boolean hasStealthDisadvantage() {
        return this.stealthDisadvantage;
    }
}
