package strategy;

import java.util.HashMap;
import java.util.Map;

public class MagicSwitch {
    Map<MagicType, Magic> magics = new HashMap<>();

    public MagicSwitch(Member member) {
        final Fire fire = new Fire(member);
        final Thunder thunder = new Thunder(member);

        magics.put(MagicType.fire, fire);
        magics.put(MagicType.thunder, thunder);
    }

    void magicAttack(final MagicType magicType) {
        System.out.println("magic type: " + magicType);

        // interface により実装を切り変える strategy pattern
        final Magic usingMagic = magics.get(magicType);
        System.out.println("magic point: " + usingMagic.constMagicPoint());
        System.out.println("attack damage: " + usingMagic.attackDamage());
    }
}
