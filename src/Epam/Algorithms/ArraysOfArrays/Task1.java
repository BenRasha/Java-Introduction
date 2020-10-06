package Epam.Algorithms.ArraysOfArrays;

/*Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.*/

import java.util.Scanner;
public class Task1 {
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
            for(int j=0;j<columns;j+=2)
            {
                if(arr[0][j]>arr[rows-1][j]) {
                    System.out.print(" " + arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner((System.in));
        System.out.print("Input number of rows:");
        int rows=scanner.nextInt();
        System.out.print("Input number of columns:");
        int columns=scanner.nextInt();
        int arr[][]=new int[rows][columns];
        input(arr,rows,columns);
        output(arr,rows,columns);
        System.out.println("Task completion:");
        task(arr,rows,columns);
    }
}
