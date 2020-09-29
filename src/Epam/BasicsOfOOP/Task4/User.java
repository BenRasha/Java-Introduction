package BasicsOfOOP.Task4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Treasure>myTreasures;
    private static User instance;
    private User(){
        myTreasures=new ArrayList<>();
    }
    public static User getInstance() {
        if(instance==null){
            instance=new User();
        }
        return instance;
    }
    public List<Treasure> getMyTreasures() {
        return myTreasures;
    }
    public void printMyTreasure(){
        if (!myTreasures.isEmpty()){
            myTreasures.forEach(System.out::println);
        }else{
            System.out.println("Your list of treasures is empty!");
        }
    }
    public void addTreasure(String names)throws IOException{
        String[]split=names.split(",");
        for(String string:split){
            for (Treasure treasure:Cave.getInstance().getAllTreasures()){
                if (treasure.getName().contains(string.trim())){
                    myTreasures.add(treasure);
                    break;
                }
            }
        }
    }
    public void selectTreasureByAmount(String amountOfMoney) throws IOException{
        double amount=Double.parseDouble(amountOfMoney);
        double sum=myTreasures.stream().mapToDouble(Treasure::getPrice).sum();
        for (Treasure treasure:Cave.getInstance().shuffleAllTreasures()){
            if(sum+treasure.getPrice()<amount){
                myTreasures.add(treasure);
                sum+=treasure.getPrice();
            }
        }
    }
    public void clearListOfYourTreasures()throws IOException{
        myTreasures.clear();
    }
}
