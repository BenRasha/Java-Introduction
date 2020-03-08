package Epam.Algorithms.OneDimentionalSorting;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

    public static void input(int []array)
    {
        for(int i=0;i<array.length;i++)
        {
            array[i]=(int)(1+Math.random()*5);
        }
    }

    public static void output(int []array1,int[]array2)
    {
        System.out.println("Your fractions:");
        for(int i=0;i<array1.length;i++){
            System.out.println("["+(i+1)+"] "+array1[i]+" / "+array2[i]);
        }
    }
    private static int gcd(int a,int b){
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
    public static int lcmFinder(int[]array)
    {
        int lcm=array[0];
        for(int i=1;i<array.length;i++){
            lcm=(lcm*array[i])/gcd(lcm,array[i]);
        }
        return lcm;
    }

    public static void task(int[]array1,int []array2)
    {
        System.out.println("Sorted fractions:");
        int length=array1.length;
        int lcm=lcmFinder(array2);
        int []result=new int[length];
        for(int i=0;i<length;i++){
            result[i]=array1[i]*lcm/array2[i];
        }
        Arrays.sort(result);
        for (int i=0;i<length;i++)
        {
            System.out.println("["+(i+1)+"] "+result[i]+" / "+lcm);
        }
    }

    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Input number of fractions: ");
        int size=input.nextInt();
        int []numerators=new int[size];
        input(numerators);
        int []denominators=new int[size];
        input(denominators);
        output(numerators,denominators);
        task(numerators,denominators);
    }
}
