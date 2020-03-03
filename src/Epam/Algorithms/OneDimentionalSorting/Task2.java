package Epam.Algorithms.OneDimentionalSorting;

import java.util.Arrays;
import java.util.Scanner;
public class Task2 {
    public static void input(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (0 + Math.random() * 100);
        }
        Arrays.sort(arr);
    }

    public static void output(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("[" + (i + 1) + "]" + arr[i]);
        }
    }

    public static void task(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        Arrays.sort(result);
        for(int i=0;i<arr1.length+arr2.length;i++)
        {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of the first sequence:");
        int n = scanner.nextInt();
        int firstSequence[] = new int[n];
        input(firstSequence, n);
        System.out.println("Your first array:");
        output(firstSequence, n);
        System.out.print("Input size of the second array:");
        int m = scanner.nextInt();
        int secondSequence[] = new int[m];
        input(secondSequence, m);
        System.out.println("Your second array:");
        output(secondSequence, m);
        System.out.println("Task completion:");
        task(firstSequence,secondSequence);
    }
}
