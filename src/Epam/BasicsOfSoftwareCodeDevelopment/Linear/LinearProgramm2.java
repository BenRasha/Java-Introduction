package Epam.BasicsOfSoftwareCodeDevelopment.Linear;

import java.util.Scanner;
public class LinearProgramm2 {
    static public void main(String[] args ){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input a:");
        double a=scanner.nextInt();
        System.out.print("Input b:");
        double b=scanner.nextInt();
        System.out.print("Input c:");
        double c=scanner.nextInt();
        double result;
        result=(b+Math.sqrt(b*b+4*a*c))/(2*a)-Math.pow(a,3)*c+Math.pow(b,-2);
        System.out.println("Your result is:" +result);
    }
}