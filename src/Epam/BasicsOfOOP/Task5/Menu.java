package BasicsOfOOP.Task5;

import BasicsOfOOP.Task5.Present.Present;
import BasicsOfOOP.Task5.Present.Package;
import BasicsOfOOP.Task5.Present.Sweets;

import java.util.Scanner;

public class Menu {
    static Present present;
    static Package aPackage;
    static Sweets sweets;
    public void createPresent(){
        present=new Present();
    }

    public void createAPackage(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input colour:");
        String colour=scanner.nextLine();
        System.out.println("Type of colour:"+colour);
        System.out.print("Input material:");
        String material=scanner.nextLine();
        System.out.println("Type of material:"+material);
        System.out.print("Input type of package:");
        String package1=scanner.nextLine();
        System.out.println("Type of package:"+package1);
        aPackage=new Package.Builder()
                .withColour(colour)
                .withMaterial(material)
                .withPackages(package1)
                .build();
        present.addaPackage(aPackage);
    }

    public void createSweets(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input sweets:");
        String sweets1=scanner.next();
        System.out.println("Sweets:"+sweets1);
        sweets=new Sweets.Builder()
                .addSweets(sweets1)
                .build();
        present.addSweets(sweets);
    }

    public Present getPresent(){
        return present;
    }
}
