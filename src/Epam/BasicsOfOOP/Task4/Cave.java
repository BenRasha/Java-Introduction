package BasicsOfOOP.Task4;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Cave {
    private List<Treasure> allTreasures=new ArrayList<>();
    private static Cave instance;
    private Cave()throws IOException{
        addTreasure();
    }
    public static Cave getInstance() throws IOException{
        if(instance==null){
            instance =new Cave();
        }
        return instance;
    }
    private FileReader parseResourceFile()throws IOException{
        ClassLoader classLoader=getClass().getClassLoader();
        return new FileReader(classLoader.getResource("Resources/Treasures").getFile());
    }
    private void addTreasure()throws IOException{
        Scanner scanner=new Scanner(parseResourceFile());
        String[]split;
        while (scanner.hasNextLine()){
            split=scanner.nextLine().split("-");
            allTreasures.add(new Treasure(split[0].trim(),Double.parseDouble(split[1].trim())));
        }
    }
    public void printAllTreasures(){
        allTreasures.forEach(System.out::println);
    }
    public List<Treasure> getAllTreasures() {
        return allTreasures;
    }
    public List<Treasure> shuffleAllTreasures(){
        List<Treasure>shuffle=allTreasures;
        Collections.shuffle(shuffle);
        return shuffle;
    }
    public void mostExpensiveTreasurePrint()throws IOException{
        allTreasures.sort(Comparator.comparing(Treasure::getPrice));
        System.out.println(allTreasures.get(allTreasures.size()-1));
    }
}
