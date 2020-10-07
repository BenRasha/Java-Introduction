package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnArrayOfCharacters;

/*Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 Крайние пробелы в строке удалить
 */

public class Task5 {
    public static void spaceCleaner(String str)
    {
        str=str.trim();
        String[]massive=str.split(" ");
        for (String arg:massive){
            if (!arg.isEmpty()){
                System.out.print(arg+" ");
            }
        }
    }
    public static void main(String args[])
    {
        String text="   Check   this   out   ";
        spaceCleaner(text);
    }
}
