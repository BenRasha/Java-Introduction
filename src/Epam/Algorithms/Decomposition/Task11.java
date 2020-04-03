package Epam.Algorithms.Decomposition;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11 {
    public static void inputInLists(int a,ArrayList<Integer>arrayList1,int b,ArrayList<Integer>arrayList2)
    {
        do {
            arrayList1.add(a%10);
            a/=10;
        }while(a!=0);
        do {
            arrayList2.add(b%10);
            b/=10;
        }while(b!=0);
    }
    public static void digitsOutput(ArrayList<Integer>arrayList1,ArrayList<Integer>arrayList2)
    {
        System.out.println("Digits of the first number:");
        for(int i=arrayList1.size()-1;i>-1;i--){
            System.out.println(arrayList1.get(i));
        }
        System.out.println("Digits of the second number:");
        for (int j=arrayList2.size()-1;j>-1;j--){
            System.out.println(arrayList2.get(j));
        }
    }
    public static void digitsCheck(ArrayList<Integer>arrayList1,ArrayList<Integer>arrayList2)
    {
        if(arrayList1.size()>arrayList2.size()){
            System.out.println("First number consists of more digits");
        }else if(arrayList1.size()<arrayList2.size()){
            System.out.println("second number consists of more digits");
        }else{
            System.out.println("they consist of the same number of digits");
        }
    }
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number:");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number:");
        int secondNumber = scanner.nextInt();
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();
        inputInLists(firstNumber, firstList, secondNumber, secondList);
        digitsOutput(firstList, secondList);
        digitsCheck(firstList,secondList);
    }
}
