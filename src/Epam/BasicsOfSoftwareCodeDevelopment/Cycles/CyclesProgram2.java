package Epam.BasicsOfSoftwareCodeDevelopment.Cycles;

/*Вычислить значенияфункции на отрезке [а,b] c шагом h:*/

import java.util.Scanner;
public class CyclesProgram2 {
    public static int input()
    {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        return x;
    }
    public static void main(String[] args) {
        System.out.print("Input start of the segment: ");
        int a = input();
        System.out.print("Input end of the segment:");
        int b = input();
        System.out.print("Input the step:");
        int h = input();
        int y = 0;
        for (int i = a; i < b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = -i;
            }
            System.out.printf("x = %2d, y = %2d\n", i, y);
        }
    }
}
