package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeString;

/*Посчитать количество строчных (маленьких) и прописных (больших) букв
 в введенной строке. Учитывать только английские буквы.
 */

import java.util.Scanner;

public class Task9 {
    private static int lowercaseCounter(String string)
    {
        int counter=0;
        StringBuilder stringBuilder=new StringBuilder(string);
        for (int i=0;i<stringBuilder.length();i++){
            if (stringBuilder.charAt(i)>='a' && stringBuilder.charAt(i)<='z'){
                counter++;
            }
        }
        return counter;
    }
    private static int cursiveCounter(String string)
    {
        int counter=0;
        StringBuilder stringBuilder=new StringBuilder(string);
        for (int i=0;i<stringBuilder.length();i++){
            if (stringBuilder.charAt(i)>='A' && stringBuilder.charAt(i)<='Z'){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input text:");
        String text=scanner.nextLine();
        System.out.print("Number of lowercase letters:"+lowercaseCounter(text)+"\n");
        System.out.print("Number of cursive letters:"+cursiveCounter(text));
    }
}
