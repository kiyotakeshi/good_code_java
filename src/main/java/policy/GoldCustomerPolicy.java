package policy;

import policy.rules.GoldCustomerPurchaseAmountRule;
import policy.rules.PurchaseFrequencyRule;
import policy.rules.ReturnRateRule;

public class GoldCustomerPolicy {
    private final ExcellentCustomerPolicy policy;

    public GoldCustomerPolicy() {
        policy = new ExcellentCustomerPolicy();
        policy.add(new GoldCustomerPurchaseAmountRule());
        policy.add(new PurchaseFrequencyRule());
        policy.add(new ReturnRateRule());
    }

    boolean complyWithAll(final PurchaseHistory history) {
        return policy.complyWithAll(history);
    }
}
