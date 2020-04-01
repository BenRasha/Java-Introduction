package Epam.Algorithms.Decomposition;

import java.util.Arrays;
import java.util.Scanner;
public class Task8 {
    public static void input(int []array)
    {
        for(int i=0;i<array.length;i++){
            array[i]=(int)(0+Math.random()*10);
        }
    }
    public static void output(int []array)
    {
        System.out.println(Arrays.toString(array));
    }
    public static int task(int []array,int k,int m)
    {
        int sum=0;
        for(int i=k;i<m;i++){
            sum+=array[i];
        }
        return sum;
    }
    public static void main(String[]args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input size of the array:");
        int size=scanner.nextInt();
        int []array=new int[size];
        input(array);
        System.out.println("Your array");
        output(array);
        System.out.println("Input first index:");
        int k=scanner.nextInt();
        int m=k+3;
        if(m>size){
            throw new Exception("Second index bigger then size of array!");
        }
        System.out.println("Your sum:"+task(array,k,m));
    }
}
