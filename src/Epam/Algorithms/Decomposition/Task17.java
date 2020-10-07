package Epam.Algorithms.Decomposition;

/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 Сколько таких действий надо произвести, чтобы получился нуль?Для решения задачи использовать декомпозицию.
 */

import java.util.ArrayList;

public class Task17 {
    public static ArrayList<Integer>Number_splitter(int n)
    {
        ArrayList<Integer>arrayList=new ArrayList<>();
        do {
            arrayList.add(n%10);
            n/=10;
        }while(n!=0);
        return arrayList;
    }
    public static int Sum_of_digits(int n)
    {
        int result=0;
        for (int i=0;i<Number_splitter(n).size();i++){
            result+=Number_splitter(n).get(i);
        }
        return result;
    }
    public static int task(int n)
    {
        int counter=0;
        do {
            n-=Sum_of_digits(n);
            counter++;
        }while(n!=0);
        return counter;
    }
    public static void main(String[]args)
    {
        int n= (int) (0+ Math.random()*100);
        System.out.println("Input random number: "+n);
        System.out.println("The number of times to subtract from the number the sum of its digits to get zero:"+task(n));
    }
}
