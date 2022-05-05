package ec;

public class Customer {
    public final CustomerId id;
    public final PurchasePoint possessionPoint;
    private final boolean enable;

    public Customer(CustomerId id, PurchasePoint point, boolean active) {
        this.id = id;
        possessionPoint = point;
        this.enable = active;
    }

    public boolean isDisabled() {
        return !enable;
    }

    public boolean isShortOfPoint(Comic comic) {
        return possessionPoint.amount < comic.currentPurchasePoint.amount;
    }
}
