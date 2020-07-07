package Epam.Algorithms.Decomposition;

import java.util.ArrayList;
import java.util.Scanner;

public class Task15 {
    public static boolean check(int number)
    {
        ArrayList<Integer>arrayList=new ArrayList<>();
        do {
            arrayList.add(number%10);
            number/=10;
        }while(number!=0);
        for (int i=0;i<arrayList.size()-1;i++){
            for (int j=i+1;j<i+2;j++){
                if (arrayList.get(i)-1!=arrayList.get(j)){
                   return false;
                }
            }
        }
        return true;
    }
    public static void print(int number_of_tens)
    {
        int counter=1;
        for (int i=(int)Math.pow(10,number_of_tens);i<(int)Math.pow(10,number_of_tens+1);i++){
            if (check(i)){
                System.out.println("["+counter+"]"+" "+i);
                counter++;
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input the number of tens:");
        int n=scanner.nextInt();
        print(n);
    }
}
