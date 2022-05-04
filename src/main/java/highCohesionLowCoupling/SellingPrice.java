package highCohesionLowCoupling;

public class SellingPrice {
    final int amount;

    public SellingPrice(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("price must be over 0");
        }
        this.amount = amount;
    }
}
