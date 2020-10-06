package Epam.Algorithms.ArraysOfArrays;

/*Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/

import java.util.Scanner;
public class Task3 {
    public static void input(int arr[][], int rows, int columns)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]= (int)(10+Math.random()*20);
            }
        }
    }
    public static void output(int arr[][], int rows, int columns)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(" "+arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rawOutput(int arr[][],int rows,int columns,int k)
    {
        for(int i=k-1;i<k;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(" "+arr[i][j]+" ");
            }
        }
    }
    public static void columnOutput(int arr[][],int rows,int columns,int p)
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=p-1;j<p;j++)
            {
                System.out.print(" "+arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner((System.in));
        System.out.print("Input number of rows:");
        int rows=scanner.nextInt();
        System.out.print("Input number of columns:");
        int columns=scanner.nextInt();
        int arr[][]=new int[rows][columns];
        input(arr,rows,columns);
        output(arr,rows,columns);
        System.out.print("Input number of raw that you want to see:");
        int k=scanner.nextInt();
        rawOutput(arr,rows,columns,k);
        System.out.println();
        System.out.print("Input number of column that you want to see:");
        int p=scanner.nextInt();
        columnOutput(arr,rows,columns,p);
    }
}
