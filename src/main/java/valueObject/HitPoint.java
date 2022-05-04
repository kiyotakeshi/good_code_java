package valueObject;

public class HitPoint {
    static final int MIN = 0;
    static final int MAX = 99;
    // インスタンス変数は immutable にする
    final int value;

    // 引数も immutable にする
    public HitPoint(final int value) {
        // ガード節
        if (value < MIN) throw new IllegalArgumentException("specify over " + MIN);
        if (MAX < value) throw new IllegalArgumentException("specify under " + MAX);

        this.value = value;
    }

    HitPoint damage(final int damageAmount) {
        final int damaged = value - damageAmount;
        final int corrected = Math.max(damaged, MIN);
        // 変更値を持ったクラスを新たに生成する
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
        return "valueObject.HitPoint{" +
                "value=" + value +
                '}';
    }
}
