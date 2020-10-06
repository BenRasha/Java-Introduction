package Epam.Algorithms.OneDimentionalSorting;

/*Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=..<=an b1<=b2<=..<=bm.
 Требуется указатать те места, на которые нужно вставлять элементы последовательности b1<=b2<=..<=bm
 в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

    public static void input(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(0+Math.random()*100);
        }
        Arrays.sort(arr);
    }

    public static void output(int []arr)
    {
        System.out.println(Arrays.toString(arr));
    }

    public static void task(int []array1,int []array2)
    {
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array2[j]>array1[i]){
                    System.out.println("if we want to start parsing from "+(i+1)+" in first array,  we need to do it from "+(j+1)+" position in second array");
                    break;
                }
                continue;
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Input size of the first sequence:");
        int firstSize=input.nextInt();
        int[]firstSequence=new int[firstSize];
        input(firstSequence);
        System.out.println("Your sequence:");
        output(firstSequence);
        System.out.print("Input size of the second sequence:");
        int secondSize=input.nextInt();
        int []secondSequence=new int[secondSize];
        input(secondSequence);
        System.out.println("Your sequence:");
        output(secondSequence);
        task(firstSequence,secondSequence);
    }
}
