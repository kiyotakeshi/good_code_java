package highCohesionLowCoupling;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingPointTest {

    @Test
    void shoppingPoint() {
        var sellingPrice = new SellingPrice(1000);
        var shoppingPoint = new ShoppingPoint(sellingPrice);
        assertThat(shoppingPoint.getValue()).isEqualTo(10);
    }
}