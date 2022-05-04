package policy.rules;

import policy.PurchaseHistory;

public interface ExcellentCustomerRule {
    boolean ok(final PurchaseHistory history);
}
