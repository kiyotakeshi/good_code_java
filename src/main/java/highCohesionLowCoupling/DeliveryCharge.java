package highCohesionLowCoupling;

public class DeliveryCharge {
    private static final int DELIVERRY_FREE_MIN = 5000;
    final int amount;

    public DeliveryCharge(final SellingPrice sellingPrice) {
        amount = DELIVERRY_FREE_MIN <= sellingPrice.amount ? 0 : 750;
    }

    public int getAmount() {
        return amount;
    }
}
