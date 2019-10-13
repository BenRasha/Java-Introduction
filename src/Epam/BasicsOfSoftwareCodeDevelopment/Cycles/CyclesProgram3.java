package Epam.BasicsOfSoftwareCodeDevelopment.Cycles;

public class CyclesProgram3 {
    public static void main(String[] args)
    {
        int result=0;
        for(int i=0;i<101;i++)
        {
            result+=Math.pow(i,2);
        }
        System.out.println("Result:"+result);
    }
}
