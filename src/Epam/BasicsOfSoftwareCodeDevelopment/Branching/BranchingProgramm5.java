package Epam.BasicsOfSoftwareCodeDevelopment.Branching;

import java.util.Scanner;
public class BranchingProgramm5 {
    public static int input()
    {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        return x;
    }
    public static void main(String[] args)
    {
        System.out.println("Input x:");
        int x=input();
        double function=0;
        if(x<=3)
        {
            function=x*x-3*x+9;
        }else{
            function= (1/(Math.pow(x,3)+6));
        }
        System.out.println("Result:"+function);
    }
}
