package SimpleClassesAndObjects.Task5;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
 Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющий получить его текущее состояние.
 Написать код, демонстрирующийвсе возможности класса.
 */

public class Main {
    public static void main(String args[]){
        Counter ob1=new Counter();
        ob1.increaser();
        ob1.increaser();
        ob1.increaser();
        ob1.decreaser();
        System.out.println(ob1.getCounter());
        Counter ob2=new Counter(10,100);
        ob2.increaser();
        ob2.increaser();
        ob2.decreaser();
        System.out.println(ob2.getCounter());
    }
}
