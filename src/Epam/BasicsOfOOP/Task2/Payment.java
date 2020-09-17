package BasicsOfOOP.Task2;

import java.util.ArrayList;

public class Payment {
    private ArrayList<Product>cart;
    private String name;
    private double price;
    Payment(String name){
        this.name=name;
        this.cart=new ArrayList<>();
    }
    public double getPrice() {
        return price;
    }
    public void addProduct(String productName, double price){
        cart.add(new Product(productName,price));
        this.price+=price;
    }
    public void removeProduct(String name){
        for (int i=0;i<cart.size();i++){
            if (cart.get(i).getProductName().equals(name)){
                this.price-=cart.get(i).getPrice();
                cart.remove(i);
                break;
            }
        }
    }
    public void printInfo(){
        System.out.println("Payment:"+name);
        cart.forEach(System.out::println);
        System.out.println("Total price:"+price+"\n");
    }

    private class Product{
        private String productName;
        private double price;
        Product(String productName,double price){
            this.productName=productName;
            this.price=price;
        }
        public void setProductName(String productName) {
            this.productName = productName;
        }
        public String getProductName() {
            return productName;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "productName='" + productName + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
