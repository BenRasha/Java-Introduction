package Epam.BasicsOfSoftwareCodeDevelopment.Branching;

/*Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.*/

import java.util.Scanner;
public class BranchingProgram3 {
    public static int inputOfDots()
    {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        return a;
    }
    public static boolean StraightLine(int a1, int b1, int a2, int b2, int a3, int b3)
    {
       boolean result=(a1/b1==a2/b2) && (a1/b1==a3/b3);
       return result;
    }
    public static void main(String[] args)
    {
        System.out.println("Input your dots:");
        int x1= inputOfDots();
        int y1= inputOfDots();
        System.out.println("("+x1+","+y1+")");
        int x2= inputOfDots();
        int y2= inputOfDots();
        System.out.println("("+x2+","+y2+")");
        int x3= inputOfDots();
        int y3= inputOfDots();
        System.out.println("("+x3+","+y3+")");
        if(StraightLine(y1,x1,y2,x2,y3,x3))
        {
            System.out.println("Dots lie on the same line!");
        }else{
            System.out.println("They don't lie on the same line");
        }
    }
}
