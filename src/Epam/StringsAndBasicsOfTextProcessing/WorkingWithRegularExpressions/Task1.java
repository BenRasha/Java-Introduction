package WorkingWithRegularExpressions;

/* Cоздать приложение, разбирающее текст(текст хранится в строке) и
позволяющее выполнять с текстом три различных операции: отсортировать абзацы
 по количеству предложений;вкаждом предложении отсортировать слова по длине;
 отсортировать лексемы в предложениипо убыванию количества вхождений заданного
 символа, а в случае равенства –по алфавиту.
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    private static List<String> paragraphSplitter(String string)
    {
        List<String>list=new ArrayList<>();
        Pattern pattern=Pattern.compile(".+\\.\\s");
        Matcher matcher=pattern.matcher(string);
        while (matcher.find()){
            list.add(matcher.group());
        }
        return list;
    }

    private static List<String> sentenceSplitter(String string)
    {
        List<String>list=new ArrayList<>();
        Pattern pattern=Pattern.compile("[A-Z].+?\\.\\W");
        Matcher matcher=pattern.matcher(string);
        while (matcher.find()){
            list.add(matcher.group().trim());
        }
        return list;
    }

    private static void paragraphSortBySentenceNumber(String string)
    {
        List<String>sortedParagraphs=paragraphSplitter(string);
        for (int i=1;i<sortedParagraphs.size();i++){
            for (int j=1;j<sortedParagraphs.size();j++){
                if (sentenceSplitter(sortedParagraphs.get(j)).size()<sentenceSplitter(sortedParagraphs.get(j-1)).size()){
                    String temp=sortedParagraphs.get(j);
                    sortedParagraphs.set(j,sortedParagraphs.get(j-1));
                    sortedParagraphs.set(j-1,temp);
                }
            }
        }
        for (String str:sortedParagraphs){
            System.out.println(str);
        }
    }

    private static List<String> wordsSplitter(String string)
    {
        List<String>list=new ArrayList<>();
        Pattern pattern=Pattern.compile("[A-Z'a-z]+");
        Matcher matcher=pattern.matcher(string);
        while (matcher.find()){
            list.add(matcher.group());
        }
        return list;
    }

    public static class LengthFirstComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length()!=o2.length()) {
                return o1.length()-o2.length();
            }
            return o1.compareTo(o2);
        }
    }

    private static void sentencesSortedByWordsLength(String string)
    {
        List<String>sortedSentences=sentenceSplitter(string);
        for (int i=0;i<sortedSentences.size();i++){
            String sentence=sortedSentences.get(i);
            List<String>sortedWords=wordsSplitter(sentence);
            Collections.sort(sortedWords,new LengthFirstComparator());
            String result="";
            for (String str:sortedWords){
                result+=str+" ";
            }
            sortedSentences.set(i,result);
        }
        for (String str:sortedSentences){
            System.out.println(str);
        }
    }

    private static void lexemSort(String string, String letter)
    {
        List<String>sortedSentences=sentenceSplitter(string);
        for (int i=0;i<sortedSentences.size();i++){
            String sentence=sortedSentences.get(i);
            List<String> sortedWords=wordsSplitter(sentence);
            for (int j=0;j<sortedWords.size()-1;j++){
                for (int k=0;k<sortedWords.size()-1;k++) {
                    int countK = 0;
                    int countK1 = 0;
                    for (int m = 0; m < sortedWords.get(k).length(); m++)
                        if (String.valueOf(sortedWords.get(k).charAt(m)).compareToIgnoreCase(letter) == 0) {
                            countK++;
                        }
                    for (int m = 0; m < sortedWords.get(k + 1).length(); m++)
                        if (String.valueOf(sortedWords.get(k + 1).charAt(m)).compareToIgnoreCase(letter) == 0) {
                            countK1++;
                        }
                    if (countK<countK1){
                        String temp=sortedWords.get(k);
                        sortedWords.set(k,sortedWords.get(k+1));
                        sortedWords.set(k+1,temp);
                    }else if(countK==countK1){
                        String[]forCompare={sortedWords.get(k),sortedWords.get(k+1)};
                        if (Character.toLowerCase(forCompare[0].charAt(0))>Character.toLowerCase(forCompare[1].charAt(0))){
                            sortedWords.set(k,forCompare[1]);
                            sortedWords.set(k+1,forCompare[0]);
                        }
                    }
                }
            }
            String result="";
            for (String str:sortedWords){
                result+=str+" ";
            }
            sortedSentences.set(i,result);
        }
        for (String str:sortedSentences){
            System.out.println(str);
        }
    }

    public static void main(String args[])
    {
        String text="Outrage. That's it, I'm going on a rampage.\n" +
                "Don't waste my time with any context.\n" +
                "I'm gonna ruin all your prospects. I'm gonna pick all your pockets.\n" +
                "Fury. I am the judge and I'm the jury.\n" +
                "It's dog eat dog and I'm a pure breed. I'll work you up into a frenzy. But god this baggage is heavy.\n" +
                "Meanwhile, back at the dreamers' hotel. Five stars but all rooms are vacant. Meanwhile, I can hear alarm bells. Outside they're losing their patience.\n" +
                "Meanwhile, back at the dreamers' hotel. Five stars but all rooms are vacant. Meanwhile, I can hear alarm bells. Outside they're losing their patience.\n" +
                "Cheapshot. Another tempest in a teapot.\n" +
                "I am King Arthur in Camelot. Connected to the hot spot. For eight days on the trot. Fighting the trolls and the bots.\n" +
                "Students. Nuance ain't nothing but a nuisance.\n" +
                "You're either good or you are evil. You play a prick and there's no sequel. And that's the will of the people.\n";
        System.out.println("[Sorted paragraphs by number of sentences in them:]"+"\n");
       paragraphSortBySentenceNumber(text);
        System.out.println();
        System.out.println("[Sentences sorted by the length of words in them:]"+"\n");
       sentencesSortedByWordsLength(text);
        System.out.println();
        System.out.println("[Lexemes are sorted in descending order of the number of occurrences of a given character:]"+"\n");
       lexemSort(text,"a");
    }
}
