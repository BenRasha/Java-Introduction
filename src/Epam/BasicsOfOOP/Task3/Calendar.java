package BasicsOfOOP.Task3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Calendar {
    private int year;
    private ArrayList<Holiday> holidaysAndWeekends;
    Calendar(int year){
        this.year=year;
        this.holidaysAndWeekends =new ArrayList<>();
        addWeekend(year);
    }
    private void addWeekend(int year){
        LocalDate date=LocalDate.of(year,1,1);
        while (date.getYear()==year){
            if (date.getDayOfWeek()== DayOfWeek.SATURDAY){
                holidaysAndWeekends.add(new Holiday(date,"Saturday"));
                date.plusDays(1);
            }else if(date.getDayOfWeek()==DayOfWeek.SUNDAY){
                holidaysAndWeekends.add(new Holiday(date,"Sunday"));
                date.plusDays(6);
            }else{
                date=date.plusDays(1);
            }
        }
    }
    public void addHoliday(LocalDate date,String nameOfHoliday){
        holidaysAndWeekends.add(new Holiday(date,nameOfHoliday));
    }
    public void printWeekendsAndHolidays()throws InterruptedException {
        Collections.sort(holidaysAndWeekends);
        for (Holiday holiday : holidaysAndWeekends) {
            if (!holiday.nameOfHoliday.equals("Saturday") && !holiday.nameOfHoliday.equals("Sunday")) {
                System.err.println(holiday + "HOLIDAY!!!!!!!!!!!");
                System.err.flush();
                Thread.sleep(100);
            } else {
                System.out.println(holiday);

            }
        }
    }

    private class Holiday implements Comparable<Holiday> {
        private LocalDate holiday;
        private String nameOfHoliday;
        Holiday(LocalDate holiday, String nameOfHoliday){
            this.holiday=holiday;
            this.nameOfHoliday=nameOfHoliday;
        }
        public void setHoliday(LocalDate holiday) {
            this.holiday = holiday;
        }
        public LocalDate getHoliday() {
            return holiday;
        }
        public void setNameOfHoliday(String nameOfHoliday) {
            this.nameOfHoliday = nameOfHoliday;
        }
        public String getNameOfHoliday() {
            return nameOfHoliday;
        }

        @Override
        public String toString() {
            return "Day{" +
                    "holiday=" + holiday +
                    ", nameOfHoliday='" + nameOfHoliday + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Holiday o) {
            return this.holiday.compareTo(o.getHoliday());
        }
    }
}
