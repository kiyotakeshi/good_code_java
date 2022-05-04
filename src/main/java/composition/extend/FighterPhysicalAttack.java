package composition.extend;

public class FighterPhysicalAttack extends PhysicalAttack {
    @Override
    int singleAttack() {
        return super.singleAttack() + 20;
    }

    @Override
    int doubleAttack() {
        return super.doubleAttack() + 10;
    }
}
