package composition.extend;

public class PhysicalAttack {

    int singleAttack() {
        return 10;
    }

    int doubleAttack() {
        return this.singleAttack() * 2;
    }
}