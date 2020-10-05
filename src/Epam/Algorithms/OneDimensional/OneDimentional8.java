package Epam.Algorithms.OneDimensional;

/* Дана последовательность целых чисел a1,a2...an.
Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2...an).*/

import java.util.Scanner;
public class OneDimentional8 {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input array size:");
        int n=scanner.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(-100+Math.random()*200);
            System.out.println("["+(i+1)+"]"+arr[i]);
        }
        int min=arr[0];
        int countOfMin=0;
        for (int number:arr){
            if (number<min){
                min=number;
            }
        }
        for(int number:arr){
            if (number==min){
                countOfMin++;
            }
        }
        int[]newArr=new int[n-countOfMin];
        int indexOfNewArray=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=min){
                newArr[indexOfNewArray]=arr[i];
                indexOfNewArray++;
            }
        }
        for (int x:newArr){
            System.out.print(x+" ");
        }
    }
}
