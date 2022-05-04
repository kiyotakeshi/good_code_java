package earyReturn;


public class HealthCondition {
    Member member;

    static HealthStatus checkCondition(Member member){
        float hitPointRate = member.hitPoint / member.maxHitPoint;

        // 早期return
        if(hitPointRate == 0) return HealthStatus.dead;
        if(hitPointRate < 0.3) return HealthStatus.danger;

        return HealthStatus.fine;
    }
}

