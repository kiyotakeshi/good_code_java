package policy;

import org.junit.jupiter.api.Test;
import policy.rules.GoldCustomerPurchaseAmountRule;

import static org.assertj.core.api.Assertions.assertThat;

public class GoldCustomerPurchaseAmountRuleTest {

    @Test
    void ok() {
        var purchaseHistory = new PurchaseHistory(200000, 1, 0.01f);
        var purchaseHistory2 = new PurchaseHistory(199999, 1, 0.01f);
        var sut = new GoldCustomerPurchaseAmountRule();
        assertThat(sut.ok(purchaseHistory)).isTrue();
        assertThat(sut.ok(purchaseHistory2)).isFalse();
    }
}