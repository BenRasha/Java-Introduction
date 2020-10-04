package Epam.BasicsOfSoftwareCodeDevelopment.Cycles;

/*Напишите программу, где пользователь вводит любое целое положительное число.
 А программа суммирует все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;
public class CyclesProgram1 {
    public static int input()
    {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        return x;
    }
    public static int count(int x)
    {
        int result=0;
        for(int i=0;i<x;i++)
        {
            result+=i;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println("Input your positive integer number:");
        int number=input();
        System.out.println("Result:"+count(number));
    }
}
