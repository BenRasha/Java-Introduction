package Epam.BasicsOfSoftwareCodeDevelopment.Linear;

import java.util.Scanner;

/* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 Вывести данное значение длительности в часах, минутах и секундах в следующей форме:ННч ММмин SSc.
 */

public class LinearProgram5 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input time in seconds:");
        int time=scanner.nextInt();
        int hours=time/3600;
        int minutes=(time-hours*3600)/60;
        int seconds=time-hours*3600-minutes*60;
        if(time<60)
        {
            System.out.print(seconds+"s");
        }else if(time<3600)
        {
            System.out.print(minutes+"m"+seconds+"s");
        }else{
            System.out.print(hours + "h" + minutes + "m" + seconds + "s");
        }
    }
}
