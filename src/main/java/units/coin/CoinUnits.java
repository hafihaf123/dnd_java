package main.java.units.coin;

import main.java.units.EnumUnit;

public enum CoinUnits implements EnumUnit {
    CP(1),
    SP(10),
    EP(50),
    GP(100),
    PP(1_000);

    private final int toCopper;

    CoinUnits(int toCopper) {
        this.toCopper = toCopper;
    }

    public int getBasicUnit() {
        return toCopper;
    }
}