package SRP;

public class SummerDiscountedPrice {
    private static final int MIN_AMOUNT = 0;
    private static final int DISCOUNT_AMOUNT = 1000;
    final int amount;

    public SummerDiscountedPrice(final RegularPrice price) {
        int discountedAmount = price.amount - DISCOUNT_AMOUNT;
        if (discountedAmount < MIN_AMOUNT) {
            discountedAmount = MIN_AMOUNT;
        }
        amount = discountedAmount;
    }
}
