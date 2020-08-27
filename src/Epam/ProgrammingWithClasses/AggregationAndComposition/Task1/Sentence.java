package AggregationAndComposition.Task1;

public class Sentence {
    private String sentence;
    Sentence(String sentence){
        this.sentence=sentence;
    }
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
    public String getSentence() {
        return sentence;
    }
    @Override
    public String toString() {
        return "Sentence{" +
                "sentence='" + sentence + '\'' +
                '}';
    }
}
