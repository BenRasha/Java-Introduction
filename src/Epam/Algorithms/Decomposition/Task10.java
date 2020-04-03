package Epam.Algorithms.Decomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void task(int a)
    {
        ArrayList<Integer> arrayList=new ArrayList<>();
        do {
            arrayList.add(a%10);
            a/=10;
        }while(a!=0);
        for(int i=0;i<arrayList.size();i++) {
            System.out.println("[" + (i + 1) + "]" + arrayList.get(i));
        }
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input your number:");
        int number=scanner.nextInt();
        task(number);
    }
}
