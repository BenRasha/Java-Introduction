package Epam.Algorithms.Decomposition;

import java.util.ArrayList;
import java.util.Scanner;

public class Task16 {
    public static boolean Even_check(int number)
    {
        ArrayList<Integer>arrayList=new ArrayList<>();
        do {
            arrayList.add(number%10);
            number/=10;
        }while(number!=0);
        for (int i=0;i<arrayList.size();i++){
            if (arrayList.get(i)%2==0){
                return false;
            }
        }
        return true;
    }
    public static int Sum_finder(int number_of_tens)
    {
        int result=0;
        for (int i=(int)Math.pow(10,number_of_tens);i<(int)Math.pow(10,number_of_tens+1);i++){
            if (Even_check(i)){
                result+=i;
            }
        }
        return result;
    }
    public static int Sum_even_check(int number_of_tens)
    {
        int result=Sum_finder(number_of_tens);
        int counter=0;
        ArrayList<Integer>arrayList=new ArrayList<>();
        do {
            arrayList.add(result%10);
            result/=10;
        }while(result!=0);
        for (int i=0;i<arrayList.size();i++){
            if (arrayList.get(i)%2==0){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input the number of tens:");
        int n=scanner.nextInt();
        System.out.println("Sum:"+Sum_finder(n));
        System.out.println("Number of even number in sum:"+Sum_even_check(n));
    }
}
