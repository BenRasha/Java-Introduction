package AggregationAndComposition.Task5;

public enum Food {
    NOT_INCLUDED,
    BREAKFAST,
    ALL_INCLUSIVE;

    @Override
    public String toString() {
        return super.toString().replaceAll("_"," ").toLowerCase();
    }
}
