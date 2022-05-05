package valueObject;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class HitPointTest {

    @Test
    void hp() {
        var sut = new HitPoint(30);
        HitPoint damagedHp = sut.damage(15);
        assertThat(damagedHp.getValue()).isEqualTo(15);

        HitPoint recoveredHp = damagedHp.recover(10000);
        assertThat(recoveredHp.getValue()).isEqualTo(HitPoint.MAX);
    }

    @Test
    void min() {
        assertThatThrownBy(() -> {
            new HitPoint(-1);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("specify over " + HitPoint.MIN);
    }

    @Test
    void max() {
        assertThatThrownBy(() -> {
            new HitPoint(10000);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("specify under " + HitPoint.MAX);
    }
}
