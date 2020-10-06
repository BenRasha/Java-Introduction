package Epam.Algorithms.ArraysOfArrays;

/*Сформировать квадратную матрицу порядка nпо заданному образцу(n-четное):*/

import java.util.Scanner;
public class Task4 {
    public static void input(int arr[][], int n)
    {
        int count=1;
        int flag=n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i%2==0) {
                    arr[i][j]=count;
                    count++;
                }
                else{
                    arr[i][j]=flag;
                    flag--;
                }
            }
            count=1;
            flag=arr.length;
        }
    }
    public static void output(int arr[][], int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input size of matrix:");
        int n=scanner.nextInt();
        int arr[][]=new int[n][n];
        input(arr,n);
        System.out.println("Your matrix:");
        output(arr,n);
    }
}
