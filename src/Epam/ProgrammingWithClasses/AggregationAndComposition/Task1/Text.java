package AggregationAndComposition.Task1;

import java.util.ArrayList;

public class Text {
    private Word heading;
    private ArrayList<Sentence>text;
    Text(Word heading, ArrayList<Sentence>text){
        this.heading=heading;
        this.text=text;
    }
    public void setHeading(Word heading) {
        this.heading = heading;
    }
    public Word getHeading() {
        return heading;
    }
    public void setText(ArrayList<Sentence> text) {
        this.text = text;
    }
    public ArrayList<Sentence> getText() {
        return text;
    }
    public void addSentence(Sentence sentence){
        this.text.add(sentence);
    }
    public void printText(){
        text.stream().forEach(System.out::print);
    }
    public void printHeading(){
        System.out.println(heading);
    }
}
