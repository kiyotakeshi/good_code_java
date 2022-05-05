package strategy;

import org.junit.jupiter.api.Test;

public class MagicSwitchTest {

    @Test
    void magicAttack() {
        var member = new Member(20);
        var sut = new MagicSwitch(member);
        sut.magicAttack(MagicType.fire);

        System.out.println("-----------------");
        sut.magicAttack(MagicType.thunder);
    }
}