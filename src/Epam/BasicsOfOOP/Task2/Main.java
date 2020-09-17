package BasicsOfOOP.Task2;

public class Main {
    public static void main(String args[]){
        Payment birthdayCart=new Payment("Birthday Cart");
        birthdayCart.addProduct("Computer",1000);
        birthdayCart.addProduct("Socks",12);
        birthdayCart.addProduct("Cake",20);
        birthdayCart.printInfo();
        birthdayCart.removeProduct("Computer");
        birthdayCart.printInfo();
    }
}
