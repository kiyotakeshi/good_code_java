package highCohesionLowCoupling;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SellingCommissionTest {

    @Test
    void commission() {
        var sellingPrice = new SellingPrice(1000);
        var sut = new SellingCommission(sellingPrice);
        assertThat(sut.getAmount()).isEqualTo(100);
    }
}