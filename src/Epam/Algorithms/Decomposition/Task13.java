package Epam.Algorithms.Decomposition;

/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 Найти и напечатать все пары «близнецов» из отрезка [n,2n],
 где n-заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 */

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
