package firstClassCollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class PartyTest {

    private Party party;

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
        party = new Party(members);
    }

    @Test
    void isFull() {
        assertThat(party.isFull()).isFalse();

        var member4 = new Member(4);
        Party addedParty = party.add(member4);
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
            party.add(member3);
        }).isInstanceOf(RuntimeException.class)
                .hasMessageContaining("already party in");
    }
}