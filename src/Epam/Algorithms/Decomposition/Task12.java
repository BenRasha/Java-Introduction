package Epam.Algorithms.Decomposition;

import java.util.ArrayList;
import java.util.Scanner;

public class Task12 {
    public static ArrayList<Integer> array(int k,int n)
    {
        ArrayList<Integer>arrayList=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(digitsCount(i)==k){
                arrayList.add(i);
            }
        }
        return arrayList;
    }
    public static int digitsCount(int number)
    {
        ArrayList<Integer>arrayList=new ArrayList<>();
        do {
            arrayList.add(number%10);
            number/=10;
        }while(number!=0);
        int size=arrayList.size();
        return size;
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input first number:");
        int k=scanner.nextInt();
        System.out.print("Input second number:");
    }
}
