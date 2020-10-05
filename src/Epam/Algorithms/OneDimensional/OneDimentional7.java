package Epam.Algorithms.OneDimensional;

/*Даны действительные числа a1,a2...an. Найти*/

import java.util.Scanner;
public class OneDimentional7 {
    public static void main(String[]args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Input array size:");
        int n=scanner.nextInt();
        int []arr=new int[2*n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(-100+Math.random()*200);
            System.out.println("["+(i+1)+"]"+arr[i]);
        }
        int firstIndex=0;
        int secondIndex=arr.length-1;
        int max=Integer.MIN_VALUE;
        for( ;firstIndex<secondIndex;firstIndex++,secondIndex--)
        {
            max=Integer.max(arr[firstIndex]+arr[secondIndex],max);
        }
        System.out.println("Element:"+max);
    }
}
