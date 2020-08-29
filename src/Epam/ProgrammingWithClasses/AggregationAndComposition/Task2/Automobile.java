package AggregationAndComposition.Task2;


import java.util.ArrayList;

public class Automobile {
    private String name;
    private Wheel[] wheels;
    private Engine engine;

    Automobile(String name, Wheel[] wheels, Engine engine) {
        this.name = name;
        this.wheels = wheels;
        this.engine = engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
    public void namePrint(){
        System.out.println(getName());
    }
    public boolean wheelCheck(){
        for (int i=0;i<getWheels().length;i++){
            if (!getWheels()[i].isWheelOkey()){
                return false;
            }
        }
        return true;
    }
    public void wheelChange(){
        for (int i=0;i< getWheels().length;i++){
            if (!getWheels()[i].isWheelOkey()){
                getWheels()[i].setSize(15);
                getWheels()[i].setWheelOkey(true);
            }
        }
    }
    public boolean engineCheck(){
        if (!getEngine().isFull()) {
            return false;
        }
        return true;
    }
    public void engineCharge(){
        if (!getEngine().isFull()){
            getEngine().setFull(true);
        }
    }
    public void drive(){
        if (wheelCheck() && engineCheck()){
            System.out.println("You can safely drive");
        }else{
            System.out.println("You should either check your wheels or engine");
        }
    }
}
