package policy.rules;

import policy.PurchaseHistory;

public class PurchaseFrequencyRule implements ExcellentCustomerRule {
    @Override
    public boolean ok(PurchaseHistory history) {
        return 5 <= history.purchaseFrequencyPerMonth;
    }
}
