package AggregationAndComposition.Task5;

public enum NumberOfDays {
    ONE_WEEK,
    TWO_WEEKS,
    ONE_MONTH;

    @Override
    public String toString() {
        return super.toString().replaceAll("_"," ").toLowerCase();
    }
}
