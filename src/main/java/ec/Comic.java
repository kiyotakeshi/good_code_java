package ec;

public class Comic {
    public ComicId id;
    public PurchasePoint currentPurchasePoint;
    private int stock;

    public Comic(ComicId id, PurchasePoint point, int stock) {
        this.id = id;
        this.currentPurchasePoint = point;
        this.stock = stock;
    }

    public boolean hasStock() {
        return stock >= 1;
    }
}
