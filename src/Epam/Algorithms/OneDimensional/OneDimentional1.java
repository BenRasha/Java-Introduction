package Epam.Algorithms.OneDimensional;

/*В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/

import java.util.Scanner;
public class OneDimentional1 {
    public static int input(){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        return x;
    }
    public static void main(String[] args)
    {
        System.out.print("Input divider:");
        int divider=input();
        System.out.print("Input array length:");
        int n=input();
        int array[]=new int[n];
        System.out.println("Fulfill array");
        int result=0;
        for(int i=0;i<n;i++)
        {
            array[i]=input();
            if (array[i]%divider==0){
                result+=array[i];
            }
        }
        System.out.println("Result:"+result);
    }
}
