package highCohesionLowCoupling;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingPointTest {

    @Test
    void shoppingPoint() {
        var sellingPrice = new SellingPrice(1000);
        var sut = new ShoppingPoint(sellingPrice);
        assertThat(sut.getValue()).isEqualTo(10);
    }
}