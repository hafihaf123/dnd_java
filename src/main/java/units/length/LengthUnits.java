package main.java.units.length;

import main.java.units.EnumUnit;

public enum LengthUnits implements EnumUnit {
    IN(1),
    FT(12),
    YD(36),
    MI(63360);

    private final int toInches;

    LengthUnits(int toInches) {
        this.toInches = toInches;
    }

    @Override
    public int getBasicUnit() {
        return toInches;
    }
}
