package main.java.item.coin;

public enum CoinType {
    CP(1),
    SP(10),
    EP(50),
    GP(100),
    PP(1_000);

    private final int toCopper;

    CoinType(int toCopper) {
        this.toCopper = toCopper;
    }

    public int getToCopper() {
        return toCopper;
    }
}
