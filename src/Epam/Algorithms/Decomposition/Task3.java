package Epam.Algorithms.Decomposition;

/*Вычислить площадь правильного шестиугольника со стороной а,
 используя методвычисления площади треугольника.
 */

import java.util.Scanner;

public class Task3 {

    public static double areaFinder(double a)
    {
        double areaTriangle=Math.sqrt(3)/4*Math.pow(a,2);
        double area=6*areaTriangle;
        return area;
    }
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the side of the hexagon:");
        double a=input.nextDouble();
        System.out.println("Hexagon area:"+areaFinder(a));
    }
}
