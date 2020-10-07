package Epam.Algorithms.Decomposition;

/*Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.*/

import java.util.Scanner;
public class Task7 {
    public static int factorial(int number)
    {
        int result=1;
        for(int i=1;i<=number;i++){
            result=result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        int sum=0;
      for(int i=1;i<=9;i+=2){
          sum+=factorial(i);
      }
        System.out.println("Sum of factorials of all numbers from 1 to 9:"+sum);
    }
}
