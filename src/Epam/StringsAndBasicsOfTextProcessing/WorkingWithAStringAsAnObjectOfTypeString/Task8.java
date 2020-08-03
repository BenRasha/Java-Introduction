import java.util.Scanner;

public class Task8 {
    private static String longestWordFinder(String string)
    {
        String result="";
        String[]words=string.split(" ");
        for (int i=0;i<words.length;i++){
            if (words[i].length()>result.length()){
                result=words[i];
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input string:");
        String text=scanner.nextLine();
        System.out.print("Longest word:"+longestWordFinder(text));
    }
}
