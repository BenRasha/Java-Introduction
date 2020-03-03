package Epam.Algorithms.OneDimentionalSorting;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void input(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (0 + Math.random() * 100);
        }
    }

    public static void output(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("[" + (i + 1) + "]" + arr[i]);
        }
    }

    private static void swap(int[] array, int ind1, int ind2)
    {
        int tmp=array[ind1];
        array[ind1]=array[ind2];
        array[ind2]=tmp;
    }

    public static void sort(int []arr)
    {
        for(int left=0;left<arr.length;left++){
            int maxInd=left;
            for(int i=left;i<arr.length;i++){
                if(arr[i]>arr[maxInd]){
                    maxInd=i;
                }
            }
            swap(arr,left,maxInd);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input size of the sequence:");
        int size=scanner.nextInt();
        int []sequence=new int[size];
        input(sequence,size);
        System.out.println("Your sequence");
        output(sequence,size);
        System.out.println("Sorted sequence:");
        sort(sequence);
    }
}
