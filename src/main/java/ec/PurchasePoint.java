package ec;

public class PurchasePoint {
    public int amount;

    public PurchasePoint(int amount) {
        if (amount < 0){
            throw new IllegalArgumentException("point must be over 0");
        }
        this.amount = amount;
    }
}
