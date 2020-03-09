package Epam.Algorithms.Decomposition;

import java.util.Scanner;

public class Task4 {
    public static void input(int []array)
    {
        Scanner input=new Scanner(System.in);
        for(int i=0;i<array.length;i++)
        {
            array[i]=input.nextInt();
        }
    }
    public static void output(int []x,int[]y)
    {
        System.out.println("Your coordinates:");
        for(int i=0;i<x.length;i++)
        {
            System.out.println("["+(i+1)+"] "+"["+x[i]+","+y[i]+"]");
        }
    }
    public static int distanceFinder(int[]x,int[]y)
    {
        int []distance=new int[x.length];
        int maxDistance=0;
        for(int i=0;i<x.length;i++){
            for(int j=1;j<x.length;j++){
                distance[i]=(int)(Math.sqrt(Math.pow(x[j]-x[i],2)+Math.pow(y[j]-y[i],2)));
            }
            if(distance[i]>maxDistance){
                maxDistance=distance[i];
            }
        }
        return maxDistance;
    }
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Input number of dots:");
        int n=input.nextInt();
        int []abscissa=new int[n];
        System.out.println("Input x's:");
        input(abscissa);
        int []ordinate=new int[n];
        System.out.println("Input y's:");
        input(ordinate);
        output(abscissa,ordinate);
        System.out.println("Max distance between dots:"+distanceFinder(abscissa,ordinate));
    }
}
