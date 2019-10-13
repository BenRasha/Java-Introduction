package Epam.BasicsOfSoftwareCodeDevelopment.Cycles;

import java.util.Scanner;
public class CyclesProgram2 {
    public static int input()
    {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        return x;
    }
    public static void main(String[] args)
    {
        System.out.print("Input start of the segment: ");
        int a=input();
        System.out.print("Input end of the segment:");
        int b=input();
        System.out.print("Input the step:");
        int h=input();
        int x=input();
        int y=0;
        for(int i=a;i<b;i+=h)
        {
            if(x>2)
            {
                y=x;
            }else{
                y=-x;
            }
        }
        for(int i=a;i<b;i+=h)
        {
            System.out.println("Result:"+y);
        }
    }
}
