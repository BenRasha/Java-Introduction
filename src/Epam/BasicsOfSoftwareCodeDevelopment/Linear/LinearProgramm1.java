package Epam.BasicsOfSoftwareCodeDevelopment.Linear;

import java.util.Scanner;

public class LinearProgramm1 {
    static public void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input a:");
        int a=scanner.nextInt();
        System.out.print("Input b:");
        int b=scanner.nextInt();
        System.out.print("Input c:");
        int c=scanner.nextInt();
        int result;
        result=((a-3)*b/2)+c;
        System.out.println("Your result is:" +result);
    }
}

