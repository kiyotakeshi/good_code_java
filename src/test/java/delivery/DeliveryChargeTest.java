package delivery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class DeliveryChargeTest {

    private ShoppingCart shoppingCart;

    @BeforeEach
    void setUp() {
        List<Product> products = Arrays.asList(
                new Product(1, "oyatsu1", 200),
                new Product(2, "oyatsu2", 200),
                new Product(3, "oyatsu variety box", 4500)
        );
        shoppingCart = new ShoppingCart(products);
    }

    @Test
    void chargeIsNotFree() {
        var sut = new DeliveryCharge(shoppingCart);
        assertThat(sut.amount).isEqualTo(700);
    }

    @Test
    void chargeIsFree() {
        ShoppingCart addedShoppingCart = shoppingCart.add(new Product(4, "oyatsu4", 100));
        var sut = new DeliveryCharge(addedShoppingCart);
        assertThat(sut.amount).isEqualTo(0);
    }
}