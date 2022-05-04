package firstClassCollection;

import java.util.ArrayList;
import java.util.List;

// コレクションに関連するロジックをカプセル化したクラス = first class object
public class Party {
    static final int MAX_MEMBER_COUNT = 4;
    private final List<Member> members;

    public Party(List<Member> members) {
        this.members = members;
    }

    Party add(final Member newMember) {
        if (exists(newMember)) {
            throw new RuntimeException("already party in");
        }
        if (isFull()) {
            throw new RuntimeException("max participants in");
        }
        // 副作用を防ぐため新しいリストを作り直す
        final List<Member> newMembers = new ArrayList<>(this.members);
        newMembers.add(newMember);
        return new Party(newMembers);
    }

    boolean isFull() {
        return members.size() == MAX_MEMBER_COUNT;
    }

    private boolean exists(Member member) {
        return members.stream().anyMatch(m -> m.id == member.id);
    }

    @Override
    public String toString() {
        return "Party{" +
                "members=" + members +
                '}';
    }
}
