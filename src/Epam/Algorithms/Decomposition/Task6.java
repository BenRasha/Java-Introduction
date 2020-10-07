package Epam.Algorithms.Decomposition;

/*Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.*/

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void fill(int[]array)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Input three numbers:");
        for(int i=0;i<array.length;i++)
        {
            array[i]=input.nextInt();
        }
    }
    public static void output(int []array)
    {
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
    public static void task(int []array) {
        int gcd = array[0];
        for (int i = 0; i < array.length; i++) {
            gcd = gcdOfTwo(gcd, array[i]);
        }
        if(gcd==1){
            System.out.println("mutually simple");
        }else{
            System.out.println("Not mutually simple");
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int []array=new int[3];
        fill(array);
        output(array);
        task(array);
    }
}
