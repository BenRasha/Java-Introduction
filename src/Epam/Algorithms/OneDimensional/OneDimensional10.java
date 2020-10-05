package Epam.Algorithms.OneDimensional;

/*Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 Примечание. Дополнительный массив не использовать.
 */

import java.util.Scanner;
public class OneDimensional10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input array size:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-50 + Math.random() * 100);
            System.out.println("[" + (i + 1) + "]" + arr[i]);
        }
        int countOfElements=1;
        for (int i = 1; i + i < arr.length; i++) {
            arr[i] = arr[i + i];
            countOfElements++;
        }

        for (int i = countOfElements; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

