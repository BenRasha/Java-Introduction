package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnArrayOfCharacters;

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
