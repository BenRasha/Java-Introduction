package Epam.Algorithms.Decomposition;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 возведенная в степень n, равна самому числу.
 Найти все числа Армстронга от 1 до k.Для решения задачи использовать декомпозицию.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Task14 {
    public static boolean armstrongCheck(int a)
    {
        int number=a;
        ArrayList<Integer>arrayList=new ArrayList<>();
        do {
            arrayList.add(a%10);
            a/=10;
        }while(a!=0);
        int result=0;
        for (int i=0;i<arrayList.size();i++){
            result+=(int)(Math.pow(arrayList.get(i),arrayList.size()));
        }
        if (result!=number){
            return false;
        }
        return true;
    }
    public static void numbersCheck(int k)
    {
        for (int i=1;i<k;i++){
            if(armstrongCheck(i)){
                System.out.println("This is Armstrong number:"+i);
            }
        }
    }
    public static void main(String[]args)
    {
        System.out.print("Input number to end cycle:");
        Scanner scanner=new Scanner(System.in);
        int endNumber=scanner.nextInt();
        numbersCheck(endNumber);
    }
}
