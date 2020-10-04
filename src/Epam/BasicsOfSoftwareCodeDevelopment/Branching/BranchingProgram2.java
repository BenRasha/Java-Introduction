package Epam.BasicsOfSoftwareCodeDevelopment.Branching;

/*Найти max{min(a, b), min(c, d)}*/

import java.util.Scanner;
public class BranchingProgram2 {
    public static int input ()
    {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        return x;
    }
    public static void main(String[] args)
    {
        System.out.println("Input your a, b, c, d");
        int a=input();
        int b=input();
        int c=input();
        int d=input();
        int result=Math.max((Math.min(a,b)),Math.min(c,d));
        System.out.println("Your result:"+result);
    }
}
