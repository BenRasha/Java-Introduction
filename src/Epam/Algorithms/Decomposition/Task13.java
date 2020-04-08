package Epam.Algorithms.Decomposition;

import java.util.Scanner;

public class Task13 {
    private static boolean simpleCheck(int a)
    {
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void twins(int a)
    {
        int count=1;
        for(int i=a;i<(2*a);i++){
            if(simpleCheck(i) && simpleCheck(i+2)){
                System.out.println("["+count+" pair"+"]"+i+","+(i+2));
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input number:");
        int number=scanner.nextInt();
        twins(number);
    }
}
