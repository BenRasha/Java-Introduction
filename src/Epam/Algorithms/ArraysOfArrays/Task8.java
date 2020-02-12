package Epam.Algorithms.ArraysOfArrays;

import java.util.Scanner;
public class Task8 {
    public static void input(int arr[][],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=(int)(0+Math.random()*10);
            }
        }
    }
    public static void output(int arr[][],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(" "+arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void columnsChanger(int arr[][],int n,int m,int fstColumnChoose,int scndColumnChoose)
    {
        for(int i=0;i<n;i++)
        {
            int swap=arr[i][fstColumnChoose];
            arr[i][fstColumnChoose]=arr[i][scndColumnChoose];
            arr[i][scndColumnChoose]=swap;
        }
    }
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows:");
        int n = scanner.nextInt();
        System.out.print("Input number of columns:");
        int m= scanner.nextInt();
        int arr[][] = new int[n][m];
        input(arr,n,m);
        System.out.println("Your matrix:");
        output(arr,n,m);
        System.out.print("Input number of first column that you want to mix:");
        int fstColumnChoose=scanner.nextInt();
        System.out.print("Input number of second column that you want to mix:");
        int scndColumnChoose=scanner.nextInt();
        columnsChanger(arr,n,m,fstColumnChoose,scndColumnChoose);
        output(arr,n,m);
    }
}
