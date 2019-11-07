package Epam.Algorithms;

import java.util.Scanner;

public class OneDimentional4 {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input array size:");
        int n=scanner.nextInt();
        double []arr=new double[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=-5+Math.random()*10;
            System.out.println("["+(i+1)+"]"+arr[i]);
        }
        int min=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] < arr[min])
            {
                min=i;
            }
            if(arr[i]>arr[max])
            {
                max=i;
            }
        }
        System.out.println("Max element:"+arr[max]+" it's index:"+(max+1));
        System.out.println("Min element:"+arr[min]+" it's index:"+(min+1));
        double temp=arr[max];
        arr[max]=arr[min];
        arr[min]=temp;
        System.out.println("Sorted array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("["+(i+1)+"]"+arr[i]);
        }
    }
}
