package Task8;

import java.math.BigInteger;
import java.util.ArrayList;

public class ListOfCustomers {
    private String nameOfTheList;
    private ArrayList<Customer>list;
    public ListOfCustomers(String nameOfTheList,ArrayList<Customer>list){
        this.nameOfTheList =nameOfTheList;
        this.list=list;
    }
    public void addCustomer(String name, String surname, String patronymic, String streetNumber, int cardNumber, int bankAccountNumber){
        list.add(new Customer(name,surname,patronymic,streetNumber,cardNumber,bankAccountNumber));
    }
    public void setList(ArrayList<Customer> list) {
        this.list = list;
    }
    public ArrayList<Customer> getList() {
        return list;
    }
    public void setNameOfTheList(String nameOfTheList) {
        this.nameOfTheList = nameOfTheList;
    }
    public String getNameOfTheList() {
        return nameOfTheList;
    }
    public void sortCustomersByName(){
        list.stream().sorted(Customer::CompareTo).forEach(System.out::println);
    }
    public void customerCardNumberOutput(int from,int to){
        for (int i=0;i<list.size();i++){
            if (list.get(i).getCardNumber()>from && list.get(i).getCardNumber()<to){
                System.out.println(list.get(i));
            }
        }
    }
}
