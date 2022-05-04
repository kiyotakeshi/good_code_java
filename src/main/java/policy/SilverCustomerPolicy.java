package policy;

import policy.rules.PurchaseFrequencyRule;
import policy.rules.ReturnRateRule;

class SilverCustomerPolicy {
  private final ExcellentCustomerPolicy policy;

  SilverCustomerPolicy() {
    policy = new ExcellentCustomerPolicy();
    policy.add(new PurchaseFrequencyRule());
    policy.add(new ReturnRateRule());
  }

  boolean complyWithAll(final PurchaseHistory history) {
    return policy.complyWithAll(history);
  }
}
