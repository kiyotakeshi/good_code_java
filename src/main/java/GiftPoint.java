public class GiftPoint {
    private static final int MIN_POINT = 0;
    private static final int STANDARD_MEMBER_POINT = 3000;
    private static final int PREMIUM_MEMBER_POINT = 10000;
    final int value;

    private GiftPoint(int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException("point is not over 0");
        }
        value = point;
    }

    // 目的別にインスタンス生成をするファクトリメソッドを定義
    static GiftPoint forStandardMember() {
        return new GiftPoint(STANDARD_MEMBER_POINT);
    }

    static GiftPoint forPremiumMember() {
        return new GiftPoint(PREMIUM_MEMBER_POINT);
    }

    GiftPoint add(final GiftPoint other) {
        return new GiftPoint(value + other.value);
    }

    boolean isEnough(final ConsumptionPoint point) {
        return point.value <= value;
    }

    GiftPoint consume(final ConsumptionPoint point) {
        if (!isEnough(point)) {
            throw new IllegalArgumentException("lack of point");
        }
        return new GiftPoint(value - point.value);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "GiftPoint{" +
                "value=" + value +
                '}';
    }
}
