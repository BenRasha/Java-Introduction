package Epam.Algorithms.OneDimentionalSorting;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    public static void input(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(0+Math.random()*100);
        }
    }

    public static void output(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("["+(i+1)+"]"+arr[i]);
        }
    }

    private static void swap(int []array,int ind1, int ind2)
    {
        int tmp=array[ind1];
        array[ind1]=array[ind2];
        array[ind2]=tmp;
    }

    public static void sort(int[] array){
        int h=1;
        while(h*3<array.length)
            h=h*3+1;
        while(h>=1){
            shellSort(array,h);
            h=h/3;
        }
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }

    private static void shellSort(int []array,int h)
    {
        for(int i=h;i<array.length;i++){
            for(int j=i;j>=h;j=j-h){
                if(array[j]<array[j-h])
                    swap(array,j,j-h);
                else
                    break;
            }
        }
    }

    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Input size of the sequence:");
        int size=input.nextInt();
        int[]sequence=new int[size];
        input(sequence);
        System.out.println("Your sequence:");
        output(sequence);
        sort(sequence);
    }
}
