package highCohesionLowCoupling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class DeliveryChargeTest {

    @Test
    void deliveryChargeIsNotFree() {
        var sellingPrice = new SellingPrice(4999);
        var deliveryCharge = new DeliveryCharge(sellingPrice);
        assertThat(deliveryCharge.getAmount()).isEqualTo(750);
    }

    @Test
    void deliveryChargeIsFree() {
        var sellingPrice = new SellingPrice(5000);
        var deliveryCharge = new DeliveryCharge(sellingPrice);
        assertThat(deliveryCharge.getAmount()).isEqualTo(0);
    }
}