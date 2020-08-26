package Task10;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

public class Airline {
    private String destination;
    private int flightNumber;
    private String flightType;
    private Time departureTime;
    private String dayOfWeek;
    public Airline(String destination, int flightNumber, String flightType, Time departureTime, String dayOfWeek){
       this.destination=destination;
       this.flightNumber=flightNumber;
       this.flightType=flightType;
       this.departureTime=departureTime;
       this.dayOfWeek=dayOfWeek;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getDestination() {
        return destination;
    }
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }
    public String getFlightType() {
        return flightType;
    }
    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }
    public Time getDepartureTime() {
        return departureTime;
    }
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    public String getDayOfWeek() {
        return dayOfWeek;
    }
    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", flightType='" + flightType + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                '}';
    }
}
