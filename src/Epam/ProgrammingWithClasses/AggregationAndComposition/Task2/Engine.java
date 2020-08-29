package AggregationAndComposition.Task2;

public class Engine {
    private String name;
    private double power;
    private boolean full=true;
    Engine(String name, double power,boolean full){
        this.name=name;
        this.power=power;
        this.full=full;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPower(double power) {
        this.power = power;
    }
    public double getPower() {
        return power;
    }
    public void setFull(boolean full) {
        this.full = full;
    }
    public boolean isFull() {
        return full;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
