package Epam.Algorithms.OneDimensional;

import java.util.Scanner;
public class OneDimensional10 {
    public static void task(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            if(i%2==0)
            {
                array[i]=0;
            }
        }
    }
    public static void print(int array[])
    {
        System.out.println("New array:");
        for(int i=0;i<array.length;i++)
        {
            System.out.println("["+(i+1)+"]"+array[i]);
        }
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input array size:");
        int n=scanner.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(-50+Math.random()*100);
            System.out.println("["+(i+1)+"]"+arr[i]);
        }
        task(arr);
        print(arr);
    }
}
