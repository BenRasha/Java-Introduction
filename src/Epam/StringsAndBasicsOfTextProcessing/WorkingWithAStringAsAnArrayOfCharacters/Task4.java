package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnArrayOfCharacters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static int numberCounter(String str)
    {
        int counter=0;
        Pattern pattern=Pattern.compile("(\\d+)");
        Matcher matcher=pattern.matcher(str);
        while(matcher.find()){
            counter++;
        }
        return counter;
    }
    public static void main(String args[])
    {
        String text="This 123 string 123 contains some 123 numbers";
        System.out.println("Quantity of numbers:"+numberCounter(text));
    }
}
