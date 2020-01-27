package Epam.Algorithms.OneDimensional;

import java.util.Scanner;

public class OneDimentional3 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input size of array:");
        int n=scanner.nextInt();
        double []arr=new double[n];
        int positiveFlag=0;
        int negativeFlag=0;
        int zeroFlag=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=-1+Math.random()*2;
            System.out.println("["+(i+1)+"]"+arr[i]);
            if(arr[i]>0)
            {
                positiveFlag++;
            }else if(arr[i]<0)
            {
                negativeFlag++;
            }else{
                zeroFlag++;
            }
        }
        System.out.print("Number of positive elements:"+positiveFlag+'\n');
        System.out.print("Number of negative elements:"+negativeFlag+'\n');
        if(zeroFlag>0)
        {
            System.out.print("Number of zeros:"+zeroFlag);
        }else{
            System.out.print("There are no zeros");
        }
    }
}
