package AggregationAndComposition.Task2;

public class Wheel {
    private double size;
    private boolean wheelOkey =true;
    Wheel(double size,boolean wheelOkey){
        this.size=size;
        this.wheelOkey = wheelOkey;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public double getSize() {
        return size;
    }
    public void setWheelOkey(boolean wheelOkey) {
        this.wheelOkey = wheelOkey;
    }
    public boolean isWheelOkey() {
        return wheelOkey;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", wheelOkey=" + wheelOkey +
                '}';
    }
}
