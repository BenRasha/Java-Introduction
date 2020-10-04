package Epam.BasicsOfSoftwareCodeDevelopment.Cycles;

/*Для каждого натурального числа в промежутке от mдо nвывести все делители, кроме единицы и самого числа. mи nвводятся с клавиатуры.*/

import java.util.Scanner;
public class CyclesProgram7 {
    public static int input()
    {
        int x;
        Scanner scan=new Scanner(System.in);
        x=scan.nextInt();
        return x;
    }
    public static void main(String[]args)
    {
        System.out.print("Input m:");
        int m=input();
        System.out.print("Input n:");
        int n=input();
       for(int i=m;i<=n;i++)
       {
           System.out.println("Your number is:"+i);
           for(int j=2;j<i;j++)
           {
               if(i%j==0)
               {
                   System.out.println("Divider:"+j);
               }
           }
       }
    }
}
