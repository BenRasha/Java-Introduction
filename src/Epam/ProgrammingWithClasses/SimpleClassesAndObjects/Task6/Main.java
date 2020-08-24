package SimpleClassesAndObjects.Task6;

public class Main {
    public static void main(String args[]){
        Time time=new Time(24,46,12);
        System.out.println(time.toString());
        time.setMinute(67);
        System.out.println(time.toString());
        time.timeIncrease(45,56,1);
        System.out.println(time.toString());
        time.timeDecrease(1,2,15);
        System.out.println(time.toString());
    }
}
