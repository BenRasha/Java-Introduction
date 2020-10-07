package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeString;

/* Проверить, является ли заданное слово палиндромом.*/

public class Task3 {
    public static boolean palindromeCheck(String string)
    {
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)!=string.charAt(string.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        String text="aba";
        if (palindromeCheck(text)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
