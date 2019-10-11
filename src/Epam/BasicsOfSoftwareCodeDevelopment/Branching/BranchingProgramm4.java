package Epam.BasicsOfSoftwareCodeDevelopment.Branching;

import java.util.Scanner;
public class BranchingProgramm4 {
    public static int input()
    {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        return x;
    }
    public static void main(String[] args)
    {
        System.out.println("Input size of the hole(A,B) and size of the brick(x,y,z):");
        int A=input();
        int B=input();
        System.out.println("("+A+","+B+")");
        int x=input();
        int y=input();
        int z=input();
        System.out.println("("+x+","+y+","+z+")");
        if(  (  (A>=x) && (B>=y)  ) || (  (A>=y) && (B>=x)  )  )
        {
            System.out.println("Gets in");
        }else if(  (  (A>=x) && (B>=z)  ) || (  (A>=z) && (B>=x)  )  )
        {
            System.out.println("Gets in");
        }else if(  (  (A>=z) && (B>=y)  ) || (  (A>=y) && (B>=z)  )  )
        {
            System.out.println("Gets in");
        }else{
            System.out.println("Failed to get in");
        }
    }
}
