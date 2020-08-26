package Task9;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ListOfBooks russianClassic=new ListOfBooks("Russian Classic",new ArrayList<>());
        russianClassic.addToTheList("Pushkin","Avrora",1820,1023,50,"leather binding");
        russianClassic.addToTheList("Lermontov","Classic",1835,845,6,"leather binding");
        russianClassic.addToTheList("Gogol","Avrora",1849,2356,12,"leather binding");
        russianClassic.addToTheList("Chehov","Classic",1890,1120,6,"leather binding");
        russianClassic.addToTheList("Pushkin","Avrora",1853,25670,25,"leather binding");
        System.out.println("Books of the needed author:");
        russianClassic.authorBooksOutput("Pushkin");
        System.out.println("Books of the needed publishing house:");
        russianClassic.publishingHouseBooksOutput("Avrora");
        System.out.println("Books, that have been released after inputed year:");
        russianClassic.listOfBooksReleasedAfterInputYear(1845);
    }
}
