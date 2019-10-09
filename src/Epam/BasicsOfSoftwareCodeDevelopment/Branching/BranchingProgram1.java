package Epam.BasicsOfSoftwareCodeDevelopment.Branching;

import java.util.Scanner;
public class BranchingProgram1 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input first angle:");
        int FirstAngle=scanner.nextInt();
        System.out.print("Input second angle:");
        int SecondAngle=scanner.nextInt();
        int ThirdAngle;
        ThirdAngle=180-FirstAngle-SecondAngle;
        if((ThirdAngle>0) && ((FirstAngle==90) || (SecondAngle==90) || (ThirdAngle==90)) )
        {
            System.out.println("This triangle exist!And also this triangle is actually the right triangle!");
        }else if(ThirdAngle>0){
            System.out.println("This triangle exist!");
        }else{
            System.out.println("It doesn't exist!");
        }
    }
}
