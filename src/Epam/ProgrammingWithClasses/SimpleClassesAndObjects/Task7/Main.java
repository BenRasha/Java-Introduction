package SimpleClassesAndObjects.Task7;

public class Main {
    public static void main(String args[]){
        Triangle triangle=new Triangle(1,2,-3,4,5,7);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getSquare());
        triangle.meridianOutput();
    }
}
