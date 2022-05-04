package highCohesionLowCoupling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class SellingCommissionTest {

    @Test
    void commission() {
        var sellingPrice = new SellingPrice(1000);
        var sellingCommission = new SellingCommission(sellingPrice);
        assertThat(sellingCommission.getAmount()).isEqualTo(100);
    }
}