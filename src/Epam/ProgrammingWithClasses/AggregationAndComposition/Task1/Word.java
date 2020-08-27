package AggregationAndComposition.Task1;

public class Word {
    private String word;
    Word(String word){
        this.word=word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }
}
