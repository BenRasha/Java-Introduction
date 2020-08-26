package Task10;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class ListOfAirlines {
    private String nameOfTheList;
    private ArrayList<Airline>list;
    public ListOfAirlines(String nameOfTheList, ArrayList<Airline>list){
        this.nameOfTheList=nameOfTheList;
        this.list=list;
    }
    public void setNameOfTheList(String nameOfTheList) {
        this.nameOfTheList = nameOfTheList;
    }
    public String getNameOfTheList() {
        return nameOfTheList;
    }
    public void setList(ArrayList<Airline> list) {
        this.list = list;
    }
    public ArrayList<Airline> getList() {
        return list;
    }
    public void addToTheList(String destination, int flightNumber, String flightType,Time departureTime, String dayOfWeek){
        list.add(new Airline(destination,flightNumber,flightType,departureTime,dayOfWeek));
    }
    public void withdrawalOfFlightsToAGivenDestination(String destination){
        for (int i=0;i<list.size();i++){
            if (list.get(i).getDestination()==destination){
                System.out.println(list.get(i));
            }
        }
    }
    public void listOfFlightsForAGivenDayOfTheWeek(String dayOfWeek){
        for (int i=0;i<list.size();i++){
            if (list.get(i).getDayOfWeek()==dayOfWeek){
                System.out.println(list.get(i));
            }
        }
    }
    public void listOfFlightsForAGivenDayOfTheWeekWithTimeBiggerThenNeeded(String dayOfWeek, Time departureTime){
        for (int i=0;i<list.size();i++){
            if (list.get(i).getDayOfWeek()==dayOfWeek && list.get(i).getDepartureTime().compareTo(departureTime)>0){
                System.out.println(list.get(i));
            }
        }
    }
}
