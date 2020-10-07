package Epam.Algorithms.Decomposition;

/*Написать метод(методы)для нахождения наибольшего общего делителя и наименьшего общего
 кратного двух натуральных чисел:*/


import java.util.Scanner;

public class Task1 {
    static int gcdFinder(int a,int b){
        while (a-b!=0)
        {
            if(a>b){
                a-=b;
            }else{
                b-=a;
            }
        }
        return a;
    }
    static int lcmFinder(int a, int b)
    {
        int lcm=(a*b)/gcdFinder(a,b);
        return lcm;
    }
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Input first number:");
        int a=input.nextInt();
        System.out.print("Input second number:");
        int b=input.nextInt();
        System.out.println("Greatest common divider:"+gcdFinder(a,b)+"\n"+"Least common divider:"+lcmFinder(a,b));
    }
}
