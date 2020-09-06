package AggregationAndComposition.Task5;

public class Main {
    public static void main(String args[]){
        TravelAgency alatanTour=new TravelAgency("Alatan Tour");
        alatanTour.addTour(new Tour("Egypt",TypeOfTour.RECREATION,Food.ALL_INCLUSIVE,Transport.PLANE,NumberOfDays.TWO_WEEKS));
        alatanTour.addTour(new Tour("USA",TypeOfTour.EXCURSION,Food.BREAKFAST,Transport.SHIP,NumberOfDays.ONE_WEEK));
        alatanTour.addTour(new Tour("Israel",TypeOfTour.REHAB,Food.NOT_INCLUDED,Transport.PLANE,NumberOfDays.ONE_MONTH));
        alatanTour.addTour(new Tour("Italy",TypeOfTour.SHOPPING,Food.BREAKFAST,Transport.PLANE,NumberOfDays.TWO_WEEKS));
        alatanTour.addTour(new Tour("Portugal",TypeOfTour.CRUISE,Food.ALL_INCLUSIVE,Transport.SHIP,NumberOfDays.TWO_WEEKS));
        alatanTour.addTour(new Tour("Moscow",TypeOfTour.EXCURSION,Food.NOT_INCLUDED,Transport.BUS,NumberOfDays.ONE_WEEK));
        Client first=new Client("Dmitriy","Nosov");
        alatanTour.addClient(first);
        alatanTour.countrySearch("Italy");
        alatanTour.typeOfTourSearch(TypeOfTour.REHAB);
        alatanTour.foodSort();
        alatanTour.printTours();
    }
}
