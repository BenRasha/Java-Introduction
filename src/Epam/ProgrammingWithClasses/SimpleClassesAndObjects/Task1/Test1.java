package ProgrammingWithClasses.SimpleClassesAndObjects.Task1;

public class Test1 {
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
