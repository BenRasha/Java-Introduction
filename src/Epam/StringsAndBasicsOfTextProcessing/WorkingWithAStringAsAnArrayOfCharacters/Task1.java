package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnArrayOfCharacters;

public class Task1 {
    public static String camelToSnake(String str)
    {
        String result="";
        char c=str.charAt(0);
        result+=Character.toLowerCase(c);
        for (int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if (Character.isUpperCase(ch)){
                result+="-"+Character.toLowerCase(ch);
            }else{
                result+=Character.toLowerCase(ch);
            }
        }
        return result;
    }
    public static void main(String []args)
    {
       String text="MyCamelCase";
        System.out.println(camelToSnake(text));
    }
}
