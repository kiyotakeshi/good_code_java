package policy;

public class PurchaseHistory {
    public int totalAmount;
    public int purchaseFrequencyPerMonth;
    public float returnRate;

    public PurchaseHistory(int totalAmount, int purchaseFrequencyPerMonth, float returnRate) {
        this.totalAmount = totalAmount;
        this.purchaseFrequencyPerMonth = purchaseFrequencyPerMonth;
        this.returnRate = returnRate;
    }
}
