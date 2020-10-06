package Epam.Algorithms.OneDimentionalSorting;

/*Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 Объединить их в один массив, включив второй массив между k-м и (k+1) -м элементами первого,
при этом не используя дополнительный массив.
 */

import java.util.Arrays;
import java.util.Scanner;
public class Task1 {
    public static void input(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        {
            arr[i]=(int)(0+Math.random()*10);
        }
    }
    public static void output(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.println("["+(i+1)+"]"+arr[i]);
        }
    }
    public static void task(int arr1[],int arr2[],int size1,int size2,int k)
    {
        int []result=new int[size1+size2-k+1];
        int index=0;
        for (int i=0;i<=k;i++){
            result[i]=arr1[i];
            index++;
        }
        for (int i=0;i<size2;i++){
            result[index-1]=arr2[i];
            index++;
        }

        System.out.println(Arrays.toString(result));
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input size of the first array:");
        int n=scanner.nextInt();
        int firstArray[]=new int[n];
        input(firstArray,n);
        System.out.println("Your first array:");
        output(firstArray,n);
        System.out.print("Input size of the second array:");
        int m=scanner.nextInt();
        int secondArray[]=new int[m];
        input(secondArray,m);
        System.out.println("Your second array:");
        output(secondArray,m);
        System.out.print("Input k:");
        int k=scanner.nextInt();
        task(firstArray,secondArray,n,m,k);
    }
}
