package Epam.StringsAndBasicsOfTextProcessing.WorkingWithAStringAsAnObjectOfTypeString;

public class Task1 {
    public static int spaceCounter(String string) {
        int counter=0;
        int maxSpace=0;
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)==' '){
                counter++;
                if (counter>maxSpace){
                    maxSpace=counter;
                }
            }else{
                counter=0;
            }
        }
        return maxSpace;
    }
    public static void main(String args[])
    {
        String text="   Check    this out         ";
        System.out.println("Max space found:"+spaceCounter(text));
    }
}
