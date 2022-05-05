package delivery;

public class DeliveryCharge {
    private static final int CHARGE_FREE_THRESHOLD = 5000;
    private static final int PAY_CHARGE = 700;
    private static final int CHARGE_FREE = 0;
    final int amount;

    DeliveryCharge(final ShoppingCart shoppingCart) {
        amount = (shoppingCart.totalPrice() < CHARGE_FREE_THRESHOLD) ? PAY_CHARGE : CHARGE_FREE;
    }

    public int getAmount() {
        return amount;
    }
}
