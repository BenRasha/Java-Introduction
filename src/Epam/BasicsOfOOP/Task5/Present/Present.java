package BasicsOfOOP.Task5.Present;

public class Present {
    private Package aPackage;
    private Sweets sweets;

    public void addaPackage(Package aPackage){
        this.aPackage=aPackage;
    }
    public void addSweets(Sweets sweets){
        this.sweets=sweets;
    }
    public Package getaPackage() {
        return aPackage;
    }

    public Sweets getSweets() {
        return sweets;
    }

    @Override
    public String toString() {
        return "BasicsOfOOP.Task5.Present{" +
                "aPackage=" + aPackage +
                ", sweets=" + sweets +
                '}';
    }
}
