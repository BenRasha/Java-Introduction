package Epam.BasicsOfSoftwareCodeDevelopment.Cycles;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 Общий член ряда имеет вид:
 */

import java.util.Scanner;
public class CyclesProgram5 {
    public static void main(String[]args)
    {
        double e;
        double n=1;
        double result=0;
        try(Scanner scan=new Scanner(System.in)) {
            System.out.println("Input e:");
            e=scan.nextDouble();
            while (Math.abs(1 / Math.pow(2, n) + Math.pow(3, n)) >= e) {
                result += 1 / Math.pow(2, n) + Math.pow(3, n);
                n++;
            }
            System.out.println("Result:" + result);
        }
    }
}
