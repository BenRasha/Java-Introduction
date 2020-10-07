package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeString;

/*Из заданной строки получить новую, повторив каждый символ дважды.*/

public class Task6 {
    public static String textDoubler(String string)
    {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<string.length();i++){
            stringBuilder.append(string.charAt(i)).append(string.charAt(i));
        }
        return stringBuilder.toString();
    }
    public static void main(String args[])
    {
        String text="String";
        System.out.println("Doubled text:"+textDoubler(text));
    }
}
