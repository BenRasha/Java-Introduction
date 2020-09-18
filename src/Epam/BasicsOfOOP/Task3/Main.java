package BasicsOfOOP.Task3;

import java.time.LocalDate;

public class Main {
    public static void main(String args[]) throws InterruptedException{
        int year=2020;
        Calendar calendar=new Calendar(year);
        calendar.addHoliday(LocalDate.parse(year+"-01-01"),"New Year");
        calendar.addHoliday(LocalDate.parse(year+"-03-08"),"Women's day");
        calendar.addHoliday(LocalDate.parse(year+"-01-07"),"Christmas");
        calendar.printWeekendsAndHolidays();
    }
}
