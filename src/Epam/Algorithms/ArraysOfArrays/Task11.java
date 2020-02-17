package Epam.Algorithms.ArraysOfArrays;

public class Task11 {
    public static void input(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=(int)(0+Math.random()*15);
            }
        }
    }
    public static void output(int arr[][])
    {
        for (int i = 0; i <arr.length; i++) {
            System.out.print("["+(i+1)+"]");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void task(int arr[][])
    {
        int counter=0;
        int flag=0;
        System.out.println("Number of rows, where number five appears more than three times");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==5)
                {
                    counter++;
                    if (counter>=3)
                    {
                        System.out.println("["+(flag+1)+"]");
                    }
                }
            }
            flag++;
            counter=0;
        }
    }
    public static void main(String[]args)
    {
        int arr[][]=new int[10][20];
        input(arr);
        System.out.println("Your matrix:");
        output(arr);
        task(arr);
    }
}
