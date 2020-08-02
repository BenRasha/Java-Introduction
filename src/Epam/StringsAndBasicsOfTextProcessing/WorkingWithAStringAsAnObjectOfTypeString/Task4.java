package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeString;

public class Task4 {
    public static String formatter(String string)
    {
        String t=String.valueOf(string.charAt(string.indexOf('т')));
        String result=t;
        result+=String.valueOf(string.charAt(string.indexOf('о')));
        result+=String.valueOf(string.charAt(string.indexOf('р')));
        result+=t;
        return result;
    }
    public static void main(String args[])
    {
        String text="информатика";
        System.out.println("Formatted word:"+formatter(text));
    }
}
