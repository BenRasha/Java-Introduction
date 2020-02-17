package Epam.Algorithms.ArraysOfArrays;

import java.util.Scanner;

public class Task13 {
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
    public static void sort(int arr[][],int n)
    {
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[j][i]>arr[k][i])
                    {
                        temp=arr[j][i];
                        arr[j][i]=arr[k][i];
                        arr[k][i]=temp;
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input matrix size:");
        int n = scanner.nextInt();
        int arr[][]=new int[n][n];
        input(arr,n);
        System.out.println("Your matrix:");
        output(arr,n);
        System.out.println("Sorted matrix:");
        sort(arr,n);
        output(arr,n);
    }
}
