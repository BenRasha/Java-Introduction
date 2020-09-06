package AggregationAndComposition.Task5;

import java.util.ArrayList;
import java.util.Comparator;

public class TravelAgency {
    private String name;
    ArrayList<Client>clients;
    ArrayList<Tour>tours;
    TravelAgency(String name){
        this.name=name;
        this.tours=new ArrayList<>();
        this.clients=new ArrayList<>();
    }
    public void addTour(Tour tour){
        tours.add(tour);
    }
    public void addClient(Client client){
        clients.add(client);
    }
    public void printTours(){
        tours.stream().forEach(System.out::println);
    }
    public void countrySearch(String country){
        tours.stream().filter(tour -> tour.getCountry().equals(country)).forEach(System.out::println);
    }
    public void typeOfTourSearch(TypeOfTour type){
        tours.stream().filter(tour -> tour.getType().equals(type)).forEach(System.out::println);
    }
    public void foodSort(){
        tours.sort(Comparator.comparing(tour -> tour.getFood()));
    }
}
