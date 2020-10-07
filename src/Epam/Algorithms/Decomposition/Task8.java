package Epam.Algorithms.Decomposition;

/*Задан массив D. Определить следующие суммы:D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 Пояснение.Составить метод(методы)для вычисления суммы трех последовательно расположенных элементов
  массива с номерами от kдо m.
 */

import java.util.Arrays;
public class Task8 {
    public static void input(int []array)
    {
        for(int i=0;i<array.length;i++){
            array[i]=(int)(0+Math.random()*10);
        }
    }
    public static void output(int []array)
    {
        System.out.println(Arrays.toString(array));
    }
    public static int task(int []array,int k,int m)
    {
        int sum=0;
        for(int i=k;i<m;i++){
            sum+=array[i];
        }
        return sum;
    }
    public static void main(String[]args) throws Exception {
        int []array=new int[9];
        input(array);
        System.out.println("Your array");
        output(array);
        System.out.println("Your sum from 1 to 3:"+task(array,0,3));
        System.out.println("Your sum from 4 to 6:"+task(array,3,6));
        System.out.println("Your sum from 7 to 9:"+task(array,6,9));
    }
}
