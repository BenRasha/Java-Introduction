package AggregationAndComposition.Task1;

/*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        Word heading=new Word("ATTENTION");
        Text myText=new Text(heading,new ArrayList<>());
        myText.addSentence(new Sentence("This is first sentence"));
        myText.addSentence(new Sentence("Last sentence here!"));
        myText.printHeading();
        myText.printText();
    }
}
