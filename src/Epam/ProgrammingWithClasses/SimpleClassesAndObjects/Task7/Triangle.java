package SimpleClassesAndObjects.Task7;

public class Triangle {
    private double xA;
    private double yA;
    private double xB;
    private double yB;
    private double xC;
    private double yC;
    public Triangle(double xA,double yA,double xB,double yB,double xC,double yC){
        this.xA=xA;
        this.yA=yA;
        this.xB=xB;
        this.yB=yB;
        this.xC=xC;
        this.yC=yC;
    }
    private double sideA() {
        return Math.sqrt(Math.pow(xA - xB, 2) + Math.pow(yA - yB, 2));
    }
    private double sideB() {

        return Math.sqrt(Math.pow(xB - xC, 2) + Math.pow(yB - yC, 2));
    }
    private double sideC() {
        return Math.sqrt(Math.pow(xA - xC, 2) + Math.pow(yA - yC, 2));
    }
    public double getPerimeter(){
        return sideA()+sideB()+sideC();
    }
    public double getSquare(){
        double p=getPerimeter()/2;
        return Math.sqrt(p*(p-sideA())*(p-sideB())*(p-sideC()));
    }
    public void meridianOutput(){
        System.out.println("Meridian coordinates: ["+xMeridian()+","+yMeridian()+"]");
    }
    public double xMeridian(){
        return (xA+xB+xC)/3;
    }
    public double yMeridian(){
        return (yA+yB+yC)/3;
    }
}
