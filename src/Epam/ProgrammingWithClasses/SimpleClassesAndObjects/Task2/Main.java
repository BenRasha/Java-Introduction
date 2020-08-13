package ProgrammingWithClasses.SimpleClassesAndObjects.Task2;

public class Main {
    public static void main(String args[])
    {
        Test2 test2_1=new Test2();
        Test2 test2_2=new Test2(3,5);
        test2_1.setA(6);
        test2_1.setB(7);
        System.out.println("test2_1:");
        System.out.println("first number:"+test2_1.getA());
        System.out.println("second number:"+test2_1.getB());
        System.out.println("test2_2:");
        System.out.println("first number:"+test2_2.getA());
        System.out.println("second number:"+test2_2.getB());

    }
}
