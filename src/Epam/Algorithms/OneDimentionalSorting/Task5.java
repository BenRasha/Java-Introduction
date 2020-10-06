package Epam.Algorithms.OneDimentionalSorting;

/*Сортировка вставками.Дана последовательность чисел a1,a2,a3...an.
 Требуется переставить числа в порядке возрастания.
 Примечание.Место помещения очередного элемента в отсортированную часть производить с помощью двоичного
  поиска. Двоичный поиск оформить в виде отдельной функции.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

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
        for (int i=1;i<array.length;i++){
            for(int j=i;j>0;j--){
                if(array[j-1]>array[j]){
                    swap(array,j-1,j);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Input size of the sequence:");
        int size=input.nextInt();
        int[]sequence=new int[size];
        input(sequence);
        System.out.println("Your sequence");
        output(sequence);
        sort(sequence);
    }
}
