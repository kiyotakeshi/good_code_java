package highCohesionLowCoupling;

public class SellingCommission {
    private static final float SELLING_COMMISSION_RATE = 0.1f;
    final int amount;

    public SellingCommission(final SellingPrice sellingPrice) {
        amount = (int) (sellingPrice.amount * SELLING_COMMISSION_RATE);
    }

    public int getAmount() {
        return amount;
    }
}
