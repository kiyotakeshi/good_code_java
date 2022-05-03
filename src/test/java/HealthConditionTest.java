import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HealthConditionTest {

    @Test
    void checkCondition() {
        Member member = new Member(100, 100);
        HealthStatus healthStatus = HealthCondition.checkCondition(member);
        assertThat(healthStatus).isEqualTo(HealthStatus.fine);
    }
}