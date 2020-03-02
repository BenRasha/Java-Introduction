package Epam.Algorithms.ArraysOfArrays;

import java.util.Scanner;

public class Task15 {
    public static void input(int matrix[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=(int)(0+Math.random()*100);
            }
        }
    }
    public static void output(int matrix[][],int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " +matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int maxSearch(int matrix[][],int n)
    {
        int max=matrix[0][0];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]>max)
                {
                    max=matrix[i][j];
                }
            }
        }
        return max;
    }
    public static void task(int matrix[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]%2!=0)
                {
                    matrix[i][j]=maxSearch(matrix,n);
                }
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input matrix size:");
        int n = scanner.nextInt();
        int matrix[][]=new int[n][n];
        input(matrix,n);
        System.out.println("Your matrix:");
        output(matrix,n);
        task(matrix,n);
        System.out.println("Matrix after rask completion:");
        output(matrix,n);
    }
}
