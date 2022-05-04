package policy;

import org.junit.jupiter.api.Test;
import policy.rules.PurchaseFrequencyRule;

import static org.assertj.core.api.Assertions.assertThat;

public class PurchaseFrequencyRuleTest {
    @Test
    void ok() {
        var purchaseHistory = new PurchaseHistory(200000, 5, 0.009f);
        var purchaseHistory2 = new PurchaseHistory(200000, 4, 0.009f);
        var sut = new PurchaseFrequencyRule();
        assertThat(sut.ok(purchaseHistory)).isTrue();
        assertThat(sut.ok(purchaseHistory2)).isFalse();
    }
}