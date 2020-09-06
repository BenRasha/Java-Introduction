package AggregationAndComposition.Task5;

public enum  TypeOfTour {
    RECREATION,
    EXCURSION,
    REHAB,
    SHOPPING,
    CRUISE;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
