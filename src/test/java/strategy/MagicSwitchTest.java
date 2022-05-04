package strategy;

import org.junit.jupiter.api.Test;

public class MagicSwitchTest {

    @Test
    void magicAttack() {
        var member = new Member(20);
        var magicSwitch = new MagicSwitch(member);
        magicSwitch.magicAttack(MagicType.fire);

        System.out.println("-----------------");
        magicSwitch.magicAttack(MagicType.thunder);
    }
}