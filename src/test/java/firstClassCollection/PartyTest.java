package firstClassCollection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PartyTest {

    private Party sut;

    @BeforeEach
    void setUp() {
        var member1 = new Member(1);
        var member2 = new Member(2);
        var member3 = new Member(3);

        List<Member> members = Arrays.asList(
                member1,
                member2,
                member3
        );
        sut = new Party(members);
    }

    @Test
    void isFull() {
        assertThat(sut.isFull()).isFalse();

        var member4 = new Member(4);
        Party addedParty = sut.add(member4);
        System.out.println(addedParty);

        assertThat(addedParty.isFull()).isTrue();

        var member5 = new Member(5);
        assertThatThrownBy(() -> {
            addedParty.add(member5);
        }).isInstanceOf(RuntimeException.class)
                .hasMessageContaining("max participants in");
    }

    @Test
    void exists() {
        var member3 = new Member(3);

        assertThatThrownBy(() -> {
            sut.add(member3);
        }).isInstanceOf(RuntimeException.class)
                .hasMessageContaining("already party in");
    }
}