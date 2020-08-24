package SimpleClassesAndObjects.Task5;

public class Counter {
    private int from;
    private int to;
    private int counter=from;
    public Counter(){
        from=0;
        to=100;
    }
    public Counter(int from,int to){
        this.from=from;
        this.to=to;
        this.counter=from;
    }
    public void increaser(){
        if(counter<to){
            counter++;
        }
    }
    public void decreaser(){
        if(counter>from){
            counter--;
        }
    }
    public int getCounter(){
        return counter;
    }
}
