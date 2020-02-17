package Epam.Algorithms.ArraysOfArrays;

import java.util.Scanner;
public class Task10 {
    public static void input(int arr[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=(int)(-5+Math.random()*10);
            }
        }
    }
    public static void output(int arr[][],int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void task(int arr[][],int n)
    {
        System.out.println("Positive elements of the main diagonal:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]>0) {
                    System.out.println(arr[i][j]);
                }
                i++;
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input matrix size:");
        int n = scanner.nextInt();
        int arr[][]=new int[n][n];
        input(arr,n);
        System.out.println("Your matrix:");
        output(arr,n);
        task(arr,n);
    }
}
