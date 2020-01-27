package Epam.Algorithms.OneDimensional;

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
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<=arr.length;j++)
            {
                int min=Math.min(arr[i],arr[j]);
                System.out.println("Yes:"+min);
            }
        }
    }
}
