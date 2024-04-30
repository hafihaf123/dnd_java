package main.java.item.coin;

public class Coin {
    private final int amountInCP;

    public Coin(CoinType coinType, int amount) {
        this.amountInCP = amount * coinType.getToCopper();
    }

    public float getAmount(CoinType coinType) {
        return (float) amountInCP /  coinType.getToCopper();
    }

    public String toString(CoinType coinType) {
        return STR."\{getAmount(coinType)}\{coinType.toString().toLowerCase()}";
    }
}
