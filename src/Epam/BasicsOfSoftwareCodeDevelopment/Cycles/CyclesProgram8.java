package Epam.BasicsOfSoftwareCodeDevelopment.Cycles;

/*Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.*/

import java.util.Scanner;
public class CyclesProgram8 {
    public static int input()
    {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        return x;
    }
    public static void main(String[] args)
    {
        System.out.print("Input your first number:");
        int x=input();
        System.out.print("Input your second number:");
        int y=input();
       String xToString= Integer.toString(x);
       String[]arrX=xToString.split("");
       String tToString=Integer.toString(y);
       String[]arrY=tToString.split("");
        System.out.print("Number:");
       for(int i=0;i<arrX.length;i++)
       {
           for(int j=0;j<arrY.length;j++)
           {
               if(arrX[i].equals(arrY[j]))
               {
                   System.out.print(arrX[i]+",");
               }
           }
       }
    }
}
