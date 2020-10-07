package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeString;

/*Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 Например, если было введено "abccdedef", то должно быть выведено "abcdef".*/

public class Task7 {
    public static String spaceCleaner(String string)
    {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(string);
        for (int i=0;i<stringBuilder.length();i++){
            if (stringBuilder.charAt(i)==' '){
                stringBuilder.deleteCharAt(i);
            }
        }
        return stringBuilder.toString();
    }
    public static String doubleSymbolCleaner(String string)
    {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(spaceCleaner(string));
        for (int i=0;i<stringBuilder.length();i++){
            for (int j=i+1;j<stringBuilder.length();j++){
                if (stringBuilder.charAt(i)==stringBuilder.charAt(j)){
                    stringBuilder.deleteCharAt(j);
                }
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String args[])
    {
        String text=" abc cde edf";
        System.out.println(doubleSymbolCleaner(text));
    }
}