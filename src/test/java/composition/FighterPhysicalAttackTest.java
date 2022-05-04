package composition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FighterPhysicalAttackTest {

    @Test
    void attackDamage() {
        var physicalAttack = new PhysicalAttack();
        var fighterPhysicalAttack = new FighterPhysicalAttack(physicalAttack);
        assertThat(fighterPhysicalAttack.singleAttack()).isEqualTo(40);

        // スーパークラスにて singleAttackDamage() を2回呼び出している
        // return this.singleAttack() * 2;

        // 親クラスに処理を委譲した後に + 10 している
        // return physicalAttack.doubleAttack() + 10;
        assertThat(fighterPhysicalAttack.doubleAttack()).isEqualTo(30);
    }
}