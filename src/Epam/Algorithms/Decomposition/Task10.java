package Epam.Algorithms.Decomposition;

/*Дано натуральное число N. Написать метод(методы)для формирования массива,
 элементами которого являются цифры числа N.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Task10 {
    public static void task(int a)
    {
        ArrayList<Integer> arrayList=new ArrayList<>();
        do {
            arrayList.add(a%10);
            a/=10;
        }while(a!=0);
        int counter=1;
        for(int i=arrayList.size()-1;i>-1;i--) {
            System.out.println("[" + counter + "]" + arrayList.get(i));
            counter++;
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
