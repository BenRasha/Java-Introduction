package ProgrammingWithClasses.SimpleClassesAndObjects;
class Test2{
    private int a;
    private int b;
    public Test2(int a,int b){
        this.a=a;
        this.b=b;
    }
    public Test2(){
        this.a=3;
        this.b=5;
    }
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a=a;
    }
    public int getB(){
        return b;
    }
    public void setB(int b){
        this.b=b;
    }
}
public class Task2 {
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
