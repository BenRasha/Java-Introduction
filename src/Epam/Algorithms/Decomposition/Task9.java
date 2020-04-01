package Epam.Algorithms.Decomposition;

import java.util.Scanner;
public class Task9 {
    public static double triangleGeron(double a,double b,double c)
    {
        double p=0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public static double squareQuadrilateral(double x,double y, double z, double t)
    {
        double c=Math.sqrt(x*x+y*y);
        double square=0.5*x*y+triangleGeron(z,t,c);
        return square;
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the lengths of the sides of the quadrilateral:");
        double x=scanner.nextDouble();
        double y=scanner.nextDouble();
        double z=scanner.nextDouble();
        double t=scanner.nextDouble();
        System.out.println("Square of quadrilateral:"+squareQuadrilateral(x,y,z,t));
    }
}
