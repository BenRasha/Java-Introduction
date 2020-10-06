package Epam.Algorithms.ArraysOfArrays;

/*Сформировать квадратную матрицу порядка nпо заданному образцу(n-четное):*/

import java.util.Scanner;
public class Task6 {
    public static void input(int arr[][], int n){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(((j >= i) && (j < (n - i))) || ((j <= i) && (j > (n - i - 2)))){
                    arr[i][j]=1;
                }else {
                    arr[i][j] = 0;
                }
            }
        }
    }
    public static void output(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input even size of matrix:");
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        input(arr, n);
        System.out.println("Your matrix:");
        output(arr, n);
    }
}
