package strategy;

public class Thunder implements Magic {

    private final Member member;

    public Thunder(Member member) {
        this.member = member;
    }

    @Override
    public String name() {
        return "thunder";
    }

    @Override
    public int constMagicPoint() {
        return 5;
    }

    @Override
    public int attackDamage() {
        return member.level * 3;
    }
}
