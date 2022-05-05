package highCohesionLowCoupling;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeliveryChargeTest {

    @Test
    void deliveryChargeIsNotFree() {
        var sellingPrice = new SellingPrice(4999);
        var sut = new DeliveryCharge(sellingPrice);
        assertThat(sut.getAmount()).isEqualTo(750);
    }

    @Test
    void deliveryChargeIsFree() {
        var sellingPrice = new SellingPrice(5000);
        var sut = new DeliveryCharge(sellingPrice);
        assertThat(sut.getAmount()).isEqualTo(0);
    }
}