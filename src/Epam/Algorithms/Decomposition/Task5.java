package Epam.Algorithms.Decomposition;

/* Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 которое меньше максимального элемента массива, но больше всех других элементов).
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void fill(int[]array)
    {
        Scanner input=new Scanner(System.in);
        for(int i=0;i<array.length;i++)
        {
            array[i]=input.nextInt();
        }
    }
    public static void output(int []array)
    {
        System.out.println(Arrays.toString(array));
    }
    public static int maxIndexFinder(int []array)
    {
        int max=array[0];
        int index=0;
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>max){
                max=array[i];
                index=i;
            }
        }
        return index;
    }
    public static void swap(int []array,int index1,int index2)
    {
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    public static void task(int []array) {
        swap(array, maxIndexFinder(array), array.length-1);
        int secondLargestElement=array[0];
        for(int i=0;i<array.length-2;i++){
            if(array[i]>secondLargestElement){
                secondLargestElement=array[i];
            }
        }
        System.out.println("Second largest element:"+secondLargestElement);
    }
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Input size of array:");
        int n=input.nextInt();
        int []array=new int[n];
        fill(array);
        System.out.println("Your array:");
        output(array);
        task(array);
    }
}
