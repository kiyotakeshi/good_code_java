package policy.rules;

import policy.PurchaseHistory;

public class ReturnRateRule implements ExcellentCustomerRule {

    @Override
    public boolean ok(PurchaseHistory history) {
        // > ((Object) history.returnRate).getClass()
        // class java.lang.Float

        // ((Object) 0.01).getClass()
        // class java.lang.Double
        return history.returnRate < 0.01f;
    }
}
