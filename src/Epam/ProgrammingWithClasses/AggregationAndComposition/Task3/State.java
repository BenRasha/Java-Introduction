package AggregationAndComposition.Task3;

import java.util.ArrayList;

public class State {
    private String stateName;
    private City capital;
    private ArrayList<Region>regions;
    State(String stateName, City capital){
        this.stateName = stateName;
        this.capital=capital;
        this.regions=new ArrayList<>();
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public String getStateName() {
        return stateName;
    }
    public void setCapital(City capital) {
        this.capital = capital;
    }
    public City getCapital() {
        return capital;
    }
    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }
    public ArrayList<Region> getRegions() {
        return regions;
    }
    public void addRegions(Region region){
        regions.add(region);
    }
    public void capitalPrint(){
        System.out.println("Capital:"+getCapital().getCityName());
    }
    public void numberOfRegionsPrint(){
        System.out.println("Number of regions:"+regions.size());
    }
    public void areaPrint(){
        double area=0;
        for (Region region:regions){
            area+=region.getRegionalArea();
        }
        System.out.println("Area:"+area+" thousand square kilometres");
    }
    public void regionalCenterNamePrint(){
        System.out.println("Regional centers of the "+ stateName +":");
        for(Region region:regions){
            System.out.print(region.getRegionalCenter().getCityName()+",");
        }
    }
}
