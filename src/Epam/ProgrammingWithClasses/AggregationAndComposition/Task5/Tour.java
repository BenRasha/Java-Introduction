package AggregationAndComposition.Task5;

public class Tour {
    private String country;
    private TypeOfTour type;
    private Food food;
    private Transport transport;
    private NumberOfDays numberOfDays;
    Tour(String country,TypeOfTour type,Food food,Transport transport,NumberOfDays numberOfDays){
        this.country=country;
        this.type=type;
        this.food=food;
        this.transport=transport;
        this.numberOfDays=numberOfDays;
    }
    public String getCountry() {
        return country;
    }
    public TypeOfTour getType() {
        return type;
    }
    public Food getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "country='" + country + '\'' +
                ", type=" + type +
                ", food=" + food +
                ", transport=" + transport +
                ", numberOfDays=" + numberOfDays +
                '}';
    }
}
