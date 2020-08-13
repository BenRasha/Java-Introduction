package ProgrammingWithClasses.SimpleClassesAndObjects;
class Test1{
    private int fstNumber;
    private int scdNumber;
    public void setFstNumber(int fstNumber){
        this.fstNumber=fstNumber;
    }
    public void setScdNumber(int scdNumber){
        this.scdNumber=scdNumber;
    }
    public void numberOutput(){
        System.out.println("First number:"+fstNumber);
        System.out.println("Second number:"+scdNumber);
    }
    public int getSum() {
        return fstNumber+scdNumber;
    }
    public int numberComparator() {
        return Math.max(fstNumber,scdNumber);
    }
}
public class Task1 {
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
