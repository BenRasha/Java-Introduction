package AggregationAndComposition.Task3;

public class Region {
    private String regionalName;
    private double regionalArea;
    private City regionalCenter;
    Region(String regionalName, double regionalArea, City regionalCenter){
        this.regionalName = regionalName;
        this.regionalArea = regionalArea;
        this.regionalCenter = regionalCenter;
    }
    public void setRegionalName(String regionalName) {
        this.regionalName = regionalName;
    }
    public String getRegionalName() {
        return regionalName;
    }
    public void setRegionalArea(double regionalArea) {
        this.regionalArea = regionalArea;
    }
    public double getRegionalArea() {
        return regionalArea;
    }
    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }
    public City getRegionalCenter() {
        return regionalCenter;
    }

}
