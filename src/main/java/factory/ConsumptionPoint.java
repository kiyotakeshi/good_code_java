package factory;

public class ConsumptionPoint {
    public final int value;

    public ConsumptionPoint(int point) {
        if(point < 0){
            throw new IllegalArgumentException("consumption point must be over 0");
        }
        value = point;
    }
}
