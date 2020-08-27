package AggregationAndComposition.Task1;

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
