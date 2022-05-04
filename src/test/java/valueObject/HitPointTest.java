package valueObject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HitPointTest {

    @Test
    void hp() {
        var hp = new HitPoint(30);
        HitPoint damagedHp = hp.damage(15);
        Assertions.assertThat(damagedHp.getValue()).isEqualTo(15);

        HitPoint recoveredHp = damagedHp.recover(10000);
        Assertions.assertThat(recoveredHp.getValue()).isEqualTo(HitPoint.MAX);
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
