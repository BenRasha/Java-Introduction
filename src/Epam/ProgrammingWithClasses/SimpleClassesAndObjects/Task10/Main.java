package Task10;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set-и get-методы и метод toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ListOfAirlines list=new ListOfAirlines("Belavia",new ArrayList<>());
        list.addToTheList("Amsterdam",23554235,"Boeing",new Time(12,45,13),"Tuesday");
        list.addToTheList("Moscow",235426346,"Boeing 7710",new Time(23,13,34),"Thursday");
        list.addToTheList("Barcelona",2335235,"Boeing 7710",new Time(4,56,0),"Tuesday");
        list.addToTheList("Warsaw",64586568,"Boeing 7710",new Time(16,9,13),"Sunday");
        list.addToTheList("New York",6547456,"Boeing 7710",new Time(14,15,16),"Monday");
        System.out.println("Withdrawal of flights to a given destination:");
        list.withdrawalOfFlightsToAGivenDestination("Amsterdam");
        System.out.println("List of flights for a given day of the week:");
        list.listOfFlightsForAGivenDayOfTheWeek("Tuesday");
        System.out.println("List of flights for a given day of the week, the time of which is longer then a given one");
        list.listOfFlightsForAGivenDayOfTheWeekWithTimeBiggerThenNeeded("Tuesday",new Time(12,45,12));
    }
}
