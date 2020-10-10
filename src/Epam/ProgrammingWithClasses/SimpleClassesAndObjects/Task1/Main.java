package ProgrammingWithClasses.SimpleClassesAndObjects.Task1;

/* Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
 Добавьте метод, который находит сумму значений этих переменных, и метод,который находит наибольшее значение из этих двух переменных.
 */

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
