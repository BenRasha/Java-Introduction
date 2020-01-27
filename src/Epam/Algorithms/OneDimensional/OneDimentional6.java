package Epam.Algorithms.OneDimensional;

import java.util.Scanner;

public class OneDimentional6 {
    public static boolean check(int i)
    {
        if(i==1 || i==0)
            return false;
        for(int j=2;j<Math.sqrt(i);j++)
        {
            if(i%j==0)
                return false;
        }
        return true;
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input array size:");
        int n=scanner.nextInt();
        double []arr=new double[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=-5+Math.random()*10;
            System.out.println("["+(i+1)+"]"+arr[i]);
        }
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(check(i))
                sum+=arr[i];
        }
        System.out.println("Sum:"+sum);
    }
}
