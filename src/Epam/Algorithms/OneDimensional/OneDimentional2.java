package Epam.Algorithms.OneDimensional;

import java.util.Scanner;

public class OneDimentional2 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input array size:");
        int n=scanner.nextInt();
        double []arr=new double[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Math.random()*100;
            System.out.println("["+(i+1)+"]"+arr[i]);
        }
        System.out.print("Input checking number:");
        double z=scanner.nextDouble();
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>z)
            {
                arr[i]=z;
                flag++;
            }
            System.out.println("["+(i+1)+"]"+arr[i]);
        }
        System.out.print("Number of replacements:"+flag);
    }
}
