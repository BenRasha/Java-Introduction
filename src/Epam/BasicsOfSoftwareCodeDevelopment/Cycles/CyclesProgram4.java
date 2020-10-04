package Epam.BasicsOfSoftwareCodeDevelopment.Cycles;

/*Составить программу нахождения произведения квадратов первых двухсот чисел.*/

public class CyclesProgram4 {
    public static void main(String[]args)
    {
        long result=1;
        for(int i=2;i<201;i++)
        {
            result*=Math.pow(i,2);
        }
        System.out.println("Result:"+result);
    }
}
