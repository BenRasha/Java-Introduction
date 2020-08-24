package SimpleClassesAndObjects.Task5;

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
