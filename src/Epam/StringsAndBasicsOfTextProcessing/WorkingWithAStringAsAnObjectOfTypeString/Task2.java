package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeString;

/*В строке вставить после каждого символа 'a' символ 'b'.*/

public class Task2 {
    public static String addingLetters(String string)
    {
       StringBuilder stringBuilder=new StringBuilder();
       for (int i=0;i<string.length();i++){
           stringBuilder.append(string.charAt(i));
           if (string.charAt(i)=='a'){
               stringBuilder.append('b');
           }
       }
       return stringBuilder.toString();
    }
    public static void main(String args[])
    {
        String text="aaa dfgagh a bc aa";
        System.out.print("Added b's:"+addingLetters(text));
    }
}
