package Epam.Algorithms.OneDimensional;

import java.util.Scanner;
public class OneDimentional9 {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input array size:");
        int n=scanner.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(-5+Math.random()*10);
            System.out.println("["+(i+1)+"]"+arr[i]);
        }
        int mostCount=1;
        int flag=1;
        int mostCommon=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(i==j) continue;
                if(arr[i]==arr[j])
                {
                    flag++;
                }
            }
            if(flag>mostCount)
            {
                mostCommon=arr[i];
                mostCount=flag;
            }else if(flag==mostCount)
            {
                if(arr[i]<mostCommon)
                {
                    mostCommon=arr[i];
                }
            }
            flag=1;
        }
        System.out.printf("Most common number:"+"%d.%nIt appears %d times",mostCommon,mostCount);
    }
}
