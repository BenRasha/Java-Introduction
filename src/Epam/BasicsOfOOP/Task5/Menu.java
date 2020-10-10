package BasicsOfOOP.Task5;

import BasicsOfOOP.Task5.Present.Present;
import BasicsOfOOP.Task5.Present.Package;
import BasicsOfOOP.Task5.Present.Sweets;

public class Menu {
    static Present present;
    static Package aPackage;
    static Sweets sweets;
    public void createPresent(){
        present=new Present();
    }

    public void createAPackage(){
        String colour="RED";
        System.out.println("Type of colour:"+colour);
        String material="PAPER";
        System.out.println("Type of material:"+material);
        String package1="BOX";
        System.out.println("Type of package:"+package1);
        aPackage=new Package.Builder()
                .withColour(colour)
                .withMaterial(material)
                .withPackages(package1)
                .build();
        present.addaPackage(aPackage);
    }

    public void createSweets(){
        String sweets1="CHOCOLATE";
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
