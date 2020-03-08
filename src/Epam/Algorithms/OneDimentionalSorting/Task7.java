package Epam.Algorithms.OneDimentionalSorting;

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
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array1.length;j++){
                if(array2[i]>array1[j]){
                    System.out.println("if we want to start parsing from "+(i+1)+" we need to do it from "+(j+1)+" position");
                    break;
                }
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
