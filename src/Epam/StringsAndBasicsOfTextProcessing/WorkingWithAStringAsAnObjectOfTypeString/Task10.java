import java.util.Scanner;

public class Task10 {
    private static int sentenceCounter(String string)
    {
        int counter=0;
        StringBuilder stringBuilder=new StringBuilder(string);
        for (int i=0;i<stringBuilder.length();i++){
            if (stringBuilder.charAt(i)=='.'|| stringBuilder.charAt(i)=='!'|| stringBuilder.charAt(i)=='?'){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input sentence:");
        String sentence=scanner.nextLine();
        System.out.print("Number of sentences:"+sentenceCounter(sentence));
    }
}
