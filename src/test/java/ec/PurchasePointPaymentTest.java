package ec;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PurchasePointPaymentTest {

    @Test
    void success_initialize() {
        var customer = new Customer(new CustomerId(1), new PurchasePoint(2000), true);
        var comicId = new ComicId(1000);
        var comic = new Comic(comicId, new PurchasePoint(0), 5);

        var sut = new PurchasePointPayment(customer, comic);
        assertThat(sut.comicId.getId()).isEqualTo(comicId.getId());
    }

    @Test
    void customer_isDisabled() {
        var customer = new Customer(new CustomerId(1), new PurchasePoint(2000), false);
        var comic = new Comic(new ComicId(1000), new PurchasePoint(0), 5);

        assertThatThrownBy(() -> new PurchasePointPayment(customer, comic))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("invalid customer");
    }

    @Test
    void comic_isOutOfStock() {
        var customer = new Customer(new CustomerId(1), new PurchasePoint(2000), true);
        var comic = new Comic(new ComicId(1000), new PurchasePoint(0), 0);

        assertThatThrownBy(() -> new PurchasePointPayment(customer, comic))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("this comic is out of stock");
    }

    @Test
    void customer_isShortOfPoint() {
        var customer = new Customer(new CustomerId(1), new PurchasePoint(2000), true);
        var comic = new Comic(new ComicId(1000), new PurchasePoint(10000), 1);

        assertThatThrownBy(() -> new PurchasePointPayment(customer, comic))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("short of point");
    }
}