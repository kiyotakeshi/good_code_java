package delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartTest {
    private ShoppingCart sut;

    @BeforeEach
    void setUp() {
        List<Product> products = Arrays.asList(
                new Product(1, "popcorn", 130),
                new Product(2, "jumbo", 160),
                new Product(3, "haribo", 250)
        );
        sut = new ShoppingCart(products);
    }

    @Test
    void add() {
        assertThat(sut.getProducts().size()).isEqualTo(3);
        ShoppingCart addedShoppingCart = sut.add(new Product(4, "kataage potato", 160));
        assertThat(addedShoppingCart.getProducts().size()).isEqualTo(4);
    }

    @Test
    void totalPrice() {
        assertThat(sut.totalPrice()).isEqualTo(540);
    }
}