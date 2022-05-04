package policy.rules;

import policy.PurchaseHistory;

public class GoldCustomerPurchaseAmountRule implements ExcellentCustomerRule {
    @Override
    public boolean ok(PurchaseHistory history) {
        return 200000 <= history.totalAmount;
    }
}
