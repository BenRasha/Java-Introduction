package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnArrayOfCharacters;

public class Task2 {
    public static String replacement(String str)
    {
        String result="";
        String word="word";
        word.toCharArray();
        String letter="letter";
        letter.toCharArray();
        for (int i=0;i<str.length();i++){
            result+=str.replace(word,letter);
            break;
        }
        return result;
    }
    public static void main(String []args)
    {
        String text="This is my word to word";
        System.out.println(replacement(text));
    }
}
