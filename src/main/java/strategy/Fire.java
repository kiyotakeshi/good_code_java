package strategy;

public class Fire implements Magic {

    private final Member member;

    public Fire(Member member) {
        this.member = member;
    }

    @Override
    public String name() {
        return "fire";
    }

    @Override
    public int constMagicPoint() {
        return 2;
    }

    @Override
    public int attackDamage() {
        return 10 + (member.level * 2);
    }
}
