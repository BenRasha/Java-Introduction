package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeString;

/*Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.*/

public class Task5 {
    public static int symbolCounter(String string)
    {
        int counter=0;
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)=='a'){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String args[])
    {
        String text="a dsgsdg aa dsf va aa gdsgf";
        System.out.println("Number of times letter a occurs:"+symbolCounter(text));
    }
}
