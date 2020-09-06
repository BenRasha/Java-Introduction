package AggregationAndComposition.Task5;

public enum Transport {
    PLANE,
    BUS,
    TRAIN,
    SHIP;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
