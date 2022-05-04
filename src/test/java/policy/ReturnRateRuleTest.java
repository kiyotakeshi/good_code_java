package policy;

import org.junit.jupiter.api.Test;
import policy.rules.ReturnRateRule;

import static org.assertj.core.api.Assertions.assertThat;

public class ReturnRateRuleTest {

    @Test
    void ok() {
        var purchaseHistory = new PurchaseHistory(200000, 5, 0.009f);
        var purchaseHistory2 = new PurchaseHistory(200000, 5, 0.01f);
        var sut = new ReturnRateRule();
        assertThat(sut.ok(purchaseHistory)).isTrue();
        assertThat(sut.ok(purchaseHistory2)).isFalse();
    }
}