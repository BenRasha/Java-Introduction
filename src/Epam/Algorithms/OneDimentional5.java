package Epam.Algorithms;

import java.util.Scanner;
public class OneDimentional5 {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input your array size:");
        int n=scanner.nextInt();
        float []arr=new float[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(float)Math.random()*5;
            arr[i]=Math.round(arr[i]);
            System.out.println(arr[i]);
        }
        System.out.println("Sorted array:");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>i)
            {
                System.out.println("["+(i+1)+"]"+arr[i]);
            }else{
                System.out.println("["+(i+1)+"]"+"Doesn't suit the condition");
            }
        }
    }
}
