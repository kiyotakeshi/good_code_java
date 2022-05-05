package composition.extend;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FighterPhysicalAttackTest {

    @Test
    void attackDamage() {
        var sut = new FighterPhysicalAttack();
        assertThat(sut.singleAttack()).isEqualTo(30);

        // スーパークラスにて singleAttackDamage() を2回呼び出している
        // return this.singleAttack() * 2;

        // それぞれの呼び出しに対してサブクラスで override したものが呼び出されている
        // return super.singleAttack() + 20;
        assertThat(sut.doubleAttack()).isEqualTo(70);
    }
}