package Epam.BasicsOfSoftwareCodeDevelopment.Linear;

import java.util.Scanner;
public class LinearProgramm3 {
    static public void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input x:");
        int x=scanner.nextInt();
        System.out.print("Input y:");
        int y=scanner.nextInt();
        int result;
        result= (int) ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y));
        System.out.println("Your result is:" +result);
    }
}
