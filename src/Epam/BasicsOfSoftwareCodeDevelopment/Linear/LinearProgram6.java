package Epam.BasicsOfSoftwareCodeDevelopment.Linear;

/*Для данной области составить линейную программу, которая печатает true,
 если точка с координатами (х, у) принадлежит закрашенной области, и false—в противном случаe
 */

import java.util.Scanner;
public class LinearProgram6 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input your x and y:");
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        System.out.println("("+x+","+y+")");
        //upper rectangle//
        int MaxRightURectangleX=2;
        int MaxLeftURectangleX=-2;
        int MaxUpURectangleY=4;
        int MaxDownURectangleY=0;
        boolean UpperFlag=(x<=MaxRightURectangleX && x>=MaxLeftURectangleX) && (y<=MaxUpURectangleY && y>=MaxDownURectangleY);
        //lower rectangle//
        int MaxLeftLRectangleX=-4;
        int MaxRightLRectangleX=4;
        int MaxDownLRectangleY=-3;
        int MaxUpLRectangleY=0;
        boolean LowerFlag=(x<=MaxRightLRectangleX && x>=MaxLeftLRectangleX) && (y>=MaxDownLRectangleY && y<=MaxUpLRectangleY);
        //circle//
        double MaxRightCircle=0.5;
        double MaxLeftCircle=-0.5;
        double MaxUpCircle=-0.5;
        double MaxDownCircle=-1.5;
        boolean CircleFlag=(x<=MaxRightCircle && x>=MaxLeftCircle) && (y<=MaxUpCircle && y>=MaxDownCircle);
        if(UpperFlag || LowerFlag != CircleFlag)
        {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
