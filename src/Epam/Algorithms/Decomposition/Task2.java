package Epam.Algorithms.Decomposition;

/*Написать метод(методы)для нахождения наибольшего общего делителя четырех натуральных чисел.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void input(int []array)
    {
        Scanner input=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            array[i]=input.nextInt();
        }
    }

    public static void output(int []array)
    {
        System.out.println("Your numbers:");
        System.out.println(Arrays.toString(array));
    }

    private static int gcdOfTwo(int a, int b)
    {
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

    public static int task(int []array)
    {
        int gcd=array[0];
        for(int i=0;i<array.length;i++)
        {
            gcd=gcdOfTwo(gcd,array[i]);
        }
        return gcd;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Input four numbers:");
        int [] numbers=new int[4];
        input(numbers);
        output(numbers);
        System.out.print("Greatest common divider:"+task(numbers));
    }
}
