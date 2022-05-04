package SRP;

public class RegularDiscountedPrice {
    private static final int MIN_AMOUNT = 0;
    static final int DISCOUNT_AMOUNT = 500;
    final int amount;

    public RegularDiscountedPrice(final RegularPrice price) {
        int discountedAmount = price.amount - DISCOUNT_AMOUNT;
        if (discountedAmount < MIN_AMOUNT) {
            discountedAmount = MIN_AMOUNT;
        }
        amount = discountedAmount;
    }

    public int getAmount() {
        return amount;
    }
}
