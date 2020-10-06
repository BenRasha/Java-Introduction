package Epam.Algorithms.ArraysOfArrays;

/* Сформировать случайную матрицу mxn, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.*/

import java.util.Scanner;
public class Task14 {
    public static void input(int arr[][],int n,int m)
    {
        int count;
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=0;j<m;j++)
            {
                if(count<=i){
                    arr[i][j]=0;
                    count++;
                }else{
                    arr[i][j]=1;
                }
            }
        }
    }
    public static void output(int arr[][],int n,int m)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input number of rows:");
        int n = scanner.nextInt();
        System.out.print("Input number of columns:");
        int m = scanner.nextInt();
        int arr[][]=new int[n][m];
        input(arr,n,m);
        System.out.println("Your matrix:");
        output(arr,n,m);
    }
}
