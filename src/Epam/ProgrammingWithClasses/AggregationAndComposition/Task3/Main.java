package AggregationAndComposition.Task3;

public class Main {
    public static void main(String argsp[]){
        City minsk=new City("Minsk");
        minsk.addDistricts(new District("Minskiy"));
        State belarus=new State("Belarus",minsk);
        belarus.addRegions(new Region("Minskaya oblast ", 39.854, minsk));
        belarus.addRegions(new Region("Brestskaya oblast ", 32.787,new City("Brest")));
        belarus.addRegions(new Region("Vitebskaya oblast ", 40.051, new City("Vitebsk")));
        belarus.addRegions(new Region("Gomelskaya oblast ", 40.372, new City("Gomel")));
        belarus.addRegions(new Region("Grodnenskaya oblast ", 25.127, new City("Grodno")));
        belarus.addRegions(new Region("Mogilevskaya oblast ", 29.068,new City("Mogilev")));
        belarus.capitalPrint();
        belarus.numberOfRegionsPrint();
        belarus.areaPrint();
        belarus.regionalCenterNamePrint();
    }
}
