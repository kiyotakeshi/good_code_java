import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GiftPointTest {

    @Test
    void constructor() {
        GiftPoint standardGiftPoint = GiftPoint.forStandardMember();
        assertThat(standardGiftPoint.getValue()).isEqualTo(3000);

        GiftPoint premiumGiftPoint = GiftPoint.forPremiumMember();
        assertThat(premiumGiftPoint.getValue()).isEqualTo(10000);
    }

    @Test
    void consume() {
        GiftPoint standardGiftPoint = GiftPoint.forStandardMember();
        GiftPoint consumedPoint = standardGiftPoint.consume(new ConsumptionPoint(1000));
        assertThat(consumedPoint.getValue()).isEqualTo(2000);
    }

    @Test
    void consume_exception() {
        GiftPoint standardGiftPoint = GiftPoint.forStandardMember();
        assertThatThrownBy(() -> {
            standardGiftPoint.consume(new ConsumptionPoint(4000));
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("lack of point");
    }

    @Test
    void add() {
        GiftPoint standardGiftPoint = GiftPoint.forStandardMember();
        GiftPoint standardGiftPoint2 = GiftPoint.forStandardMember();
        GiftPoint addedGiftPoint = standardGiftPoint.add(standardGiftPoint2);
        assertThat(addedGiftPoint.getValue()).isEqualTo(6000);
    }
}