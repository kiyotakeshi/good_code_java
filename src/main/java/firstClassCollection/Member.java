package firstClassCollection;

public class Member {
    public final int id;

    public Member(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                '}';
    }
}
