package Epam.Algorithms.OneDimentionalSorting;

import java.util.Scanner;
public class Task1 {
    public static void input(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        {
            arr[i]=(int)(0+Math.random()*10);
        }
    }
    public static void output(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.println("["+(i+1)+"]"+arr[i]);
        }
    }
    public static void task(int arr1[],int arr2[],int size1,int size2,int k)
    {
        for(int i=0;i<k;i++)
        {
            System.out.println(arr1[i]);
        }
        for(int j=0;j<size2;j++)
        {
            System.out.println(arr2[j]);
        }
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input size of the first array:");
        int n=scanner.nextInt();
        int firstArray[]=new int[n];
        input(firstArray,n);
        System.out.println("Your first array:");
        output(firstArray,n);
        System.out.print("Input size of the second array:");
        int m=scanner.nextInt();
        int secondArray[]=new int[m];
        input(secondArray,m);
        System.out.println("Your second array:");
        output(secondArray,m);
        System.out.print("Input k:");
        int k=scanner.nextInt();
        task(firstArray,secondArray,n,m,k);
    }
}
