public class HitPoint {
    protected static final int MIN = 0;
    protected static final int MAX = 99;
    final int value;

    public HitPoint(int value) {
        if (value < MIN) throw new IllegalArgumentException("specify over " + MIN);
        if (MAX < value) throw new IllegalArgumentException("specify under " + MAX);

        this.value = value;
    }

    HitPoint damage(final int damageAmount) {
        final int damaged = value - damageAmount;
        final int corrected = Math.max(damaged, MIN);
        return new HitPoint(corrected);
    }

    HitPoint recover(final int recoveryAmount) {
        final int recovered = value + recoveryAmount;
        final int corrected = Math.min(MAX, recovered);
        return new HitPoint(corrected);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "HitPoint{" +
                "value=" + value +
                '}';
    }
}
