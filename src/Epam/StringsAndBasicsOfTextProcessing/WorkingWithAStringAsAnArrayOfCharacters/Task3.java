package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnArrayOfCharacters;

public class Task3 {
    public static int digitsCounter(String str)
    {
        int counter=0;
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (Character.isDigit(c)){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String args[])
    {
        String text="This 1 string 2 contains 3 couple 4 digits";
        System.out.println(digitsCounter(text));
    }
}
