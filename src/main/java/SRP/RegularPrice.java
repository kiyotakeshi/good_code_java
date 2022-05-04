package SRP;

public class RegularPrice {
    private static final int MIN_AMOUNT = 0;
    final int amount;

    public RegularPrice(final int amount) {
        if (amount < MIN_AMOUNT) {
            throw new IllegalArgumentException("price must be over 0");
        }
        this.amount = amount;
    }
}
