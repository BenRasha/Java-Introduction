package AggregationAndComposition.Task4;

import java.util.ArrayList;
import java.util.Optional;

public class Bank {
    private String name;
    private ArrayList<Client>clients;
    Bank(String name){
        this.name=name;
        this.clients=new ArrayList<>();
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addClients(Client client){
        clients.add(client);
    }
    public Client getClientById(String id){
        Optional<Client>client=clients.stream().filter(o->o.getId().equals(id)).findFirst();
        return client.get();
    }
    public void printClients(){
        clients.stream().forEach(System.out::println);
    }
}
