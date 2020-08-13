package ProgrammingWithClasses.SimpleClassesAndObjects.Task1;

public class Main {
    public static void main(String args[])
    {
        Test1 ob1=new Test1();
        ob1.setFstNumber(3);
        ob1.setScdNumber(5);
        ob1.numberOutput();
        System.out.println("Sum of two numbers:" + ob1.getSum());
        System.out.println("Biggest number:"+ob1.numberComparator());
    }
}
