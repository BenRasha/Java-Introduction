package Epam.Algorithms.ArraysOfArrays;

import java.util.Scanner;
public class Task7 {
    public static void input(double arr[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=Math.sin((i*i-j*j)/n);
            }
        }
    }
    public static void output(double arr[][],int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int task(double arr[][],int n)
    {
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]>0)
                {
                    flag++;
                }
            }
        }
        return flag;
    }
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input matrix size:");
        int n = scanner.nextInt();
        double arr[][]=new double[n][n];
        input(arr,n);
        System.out.println("Your matrix:");
        output(arr,n);
        System.out.println("Number of positive elements:");
        System.out.println(task(arr,n));
    }
}
