package AggregationAndComposition.Task2;

public class Main {
    public static void main(String args[]) {
        Wheel []wheels=new Wheel[]{
                new Wheel(13,true),
                new Wheel(13,true),
                new Wheel(12,false),
                new Wheel(12,true)
        };
        Engine engine=new Engine("AMD-2500",1400,false);
        Automobile chevrolet=new Automobile("Chevrolet",wheels,engine);
        System.out.print("Car name:");
        chevrolet.namePrint();
        chevrolet.drive();
        if (chevrolet.wheelCheck()){
            System.out.println("All wheels are fine");
        }else{
            System.out.println("Need to change a wheel");
        }
        chevrolet.wheelChange();
        if (chevrolet.engineCheck()){
            System.out.println("Engine is charged");
        }else{
            System.out.println("You need to charge your engine");
        }
        chevrolet.engineCharge();
        chevrolet.drive();
    }
}
