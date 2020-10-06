package Epam.Algorithms.ArraysOfArrays;

/*Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/

import java.util.Scanner;
public class Task2 {
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
    public static void task(int arr[][],int rows,int columns)
    {
        for(int i=0;i<rows;i++)
        {
            System.out.print(arr[i][i]+"\n");
        }
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner((System.in));
        System.out.print("Input number of rows:");
        int rows=scanner.nextInt();
        int columns=rows;
        int arr[][]=new int[rows][columns];
        input(arr,rows,columns);
        output(arr,rows,columns);
        System.out.println("Task completion");
        task(arr,rows,columns);
    }
}
