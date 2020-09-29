package BasicsOfOOP.Task5;

public class Main {
    public static void main(String[]args){
        Menu menu=new Menu();
        menu.createPresent();
        menu.createAPackage();
        menu.createSweets();
        System.out.println(menu.getPresent());
    }
}
