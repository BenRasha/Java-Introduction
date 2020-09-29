package BasicsOfOOP.Task4;

public class Treasure {
    private String name;
    private double price;
    Treasure(String name,double price){
        this.name=name;
        this.price=price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
