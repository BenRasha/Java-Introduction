package SimpleClassesAndObjects.Task7;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
периметра и точки пересечения медиан.
 */

public class Main {
    public static void main(String args[]){
        Triangle triangle=new Triangle(1,2,-3,4,5,7);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getSquare());
        triangle.meridianOutput();
    }
}
