package Epam.Algorithms.OneDimentionalSorting;

/*Сортировка обменами.Дана последовательность чисел a1<=a2<=an.Требуется переставить числа в порядке
 возрастания.
 Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

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

    public static void sort(int []array)
    {
        boolean check=true;
        int counter=0;
        while (check) {
            check = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    counter++;
                    check = true;
                }
            }
        }
            System.out.println("Swapped array" + Arrays.toString(array));
            System.out.println("Number of swaps:" + counter);
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input size of the sequence:");
        int n=scanner.nextInt();
        int []sequence=new int[n];
        input(sequence);
        System.out.println("Your sequence:");
        output(sequence);
        sort(sequence);
    }
}
