package AggregationAndComposition.Task3;

import java.util.ArrayList;

public class City {
    private String cityName;
    private ArrayList<District>districts;
    City(String cityName){
        this.cityName=cityName;
        this.districts=new ArrayList<>();
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getCityName() {
        return cityName;
    }
    public void addDistricts(District district){
        districts.add(district);
    }
}
