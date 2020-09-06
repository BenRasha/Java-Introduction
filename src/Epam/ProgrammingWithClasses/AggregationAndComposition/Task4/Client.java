package AggregationAndComposition.Task4;

import java.util.ArrayList;
import java.util.Comparator;

public class Client {
    private String name;
    private String surname;
    private String id;
    private ArrayList<Account>accounts;
    Client(String name, String surname, String id){
        this.name=name;
        this.surname=surname;
        this.id=id;
        this.accounts=new ArrayList<>();
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void addAccount(Account account){
        accounts.add(account);
    }
    public void printAccounts(){
        accounts.stream().forEach(System.out::println);
    }
    public void accountSearchByAccountNumber(int accountNumber){
        for (Account account:accounts){
            if (account.getAccountNumber()==accountNumber){
                System.out.println(account.toString());
            }
        }
    }
    public void accountSortByAmount(){
        accounts.sort(Comparator.comparing(o->o.getAmount()));
    }
    public void sumOfAllAccount(){
        int sum=0;
        for (Account account:accounts){
            sum+=account.getAmount();
        }
        System.out.println("Sum of all accounts is: "+sum);
    }
    public void sumOfAllPositiveAccounts(){
        int sum=0;
        for (Account account:accounts){
            if (account.getAmount()>0){
                sum+=account.getAmount();
            }
        }
        System.out.println("Sum of all positive accounts:"+sum);
    }
    public void sumOfAllNegativeAccounts(){
        int sum=0;
        for (Account account:accounts){
            if (account.getAmount()<0){
                sum+=account.getAmount();
            }
        }
        System.out.println("Sum of all negative amounts:"+sum);
    }
}
