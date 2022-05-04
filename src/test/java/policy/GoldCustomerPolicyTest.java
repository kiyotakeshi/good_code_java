package policy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GoldCustomerPolicyTest {

    private GoldCustomerPolicy sut;

    @BeforeEach
    void setUp() {
        sut = new GoldCustomerPolicy();
    }

    @Test
    void allMatch() {
        var purchaseHistory = new PurchaseHistory(200000, 5, 0.009f);
        assertThat(sut.complyWithAll(purchaseHistory)).isTrue();
    }

    @Test
    void notMatch_GoldCustomerPurchaseAmountRule() {
        var purchaseHistory = new PurchaseHistory(199999, 5, 0.009f);
        assertThat(sut.complyWithAll(purchaseHistory)).isFalse();
    }

    @Test
    void notMatch_PurchaseFrequencyRule() {
        var purchaseHistory = new PurchaseHistory(200000, 4, 0.009f);
        assertThat(sut.complyWithAll(purchaseHistory)).isFalse();
    }

    @Test
    void notMatch_ReturnRateRule() {
        var purchaseHistory = new PurchaseHistory(200000, 5, 0.01f);
        assertThat(sut.complyWithAll(purchaseHistory)).isFalse();
    }
}