package valueObject;

import org.junit.jupiter.api.Test;

import java.util.Currency;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class MoneyTest {

    @Test
    void money() {
        Currency jp = Currency.getInstance(Locale.JAPAN);
        var sut = new Money(100, jp);
        assertThat(sut.getAmount()).isEqualTo(100);
    }

    @Test
    void amount_validation() {
        Currency jp = Currency.getInstance(Locale.JAPAN);

        assertThatThrownBy(() -> {
            var money = new Money(-1, jp);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void currency_validation() {
        assertThatThrownBy(() -> {
            var money = new Money(100, null);
        }).isInstanceOf(NullPointerException.class);
    }

    @Test
    void add() {
        Currency jp = Currency.getInstance(Locale.JAPAN);
        var money = new Money(100, jp);
        var money2 = new Money(10000, jp);
        Money addedMoney = money.add(money2);
        assertThat(addedMoney.getAmount()).isEqualTo(money.getAmount() + money2.getAmount());
    }

    @Test
    void add_validation() {
        Currency usd = Currency.getInstance(Locale.US);
        Currency jp = Currency.getInstance(Locale.JAPAN);
        var money = new Money(100, usd);
        var money2 = new Money(10000, jp);
        assertThatThrownBy(() -> {
            money.add(money2);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("different currency type");
    }
}