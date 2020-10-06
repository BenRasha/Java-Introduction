package Epam.Algorithms.ArraysOfArrays;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.*/

import java.util.Scanner;
public class Task9 {
    public static void input(int arr[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=(int)(0+Math.random()*10);
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
    public static void sumAnalyzer(int arr[][],int n)
    {
        int sumCheck[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sumCheck[i]+=arr[j][i];
            }
        }
        int max=sumCheck[0];
        for(int i=0;i<n;i++)
        {
            if(sumCheck[i]>max)
            {
                max=sumCheck[i];
            }
        }
        System.out.println("Highest sum"+'\n'+max);
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
        sumAnalyzer(arr,n);
    }
}
