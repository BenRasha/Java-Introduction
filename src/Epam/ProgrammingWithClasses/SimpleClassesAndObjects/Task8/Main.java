package Task8;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set-и get-методы и метод toString().
 Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 Задать критерии выбора данных и вывести эти данные на консоль.
 Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей,у которых номер кредитной карточки находится в заданном интервале
 */

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ListOfCustomers ebay=new ListOfCustomers("ebay",new ArrayList<>());
        ebay.addCustomer("Ivan","Petrov","Petrovich","Wright str. 15",1453678,136327);
        ebay.addCustomer("Petr","Ivanov","Ivanovich","Pushkin str. 56",1567489,2567238);
        ebay.addCustomer("Semon","Slepakov","Nesmeshnov","Comedy Club str. 1",8945630,660094);
        ebay.addCustomer("Vladimir","Abarov","Vladimirovich","Nezavisimisti str. 66",2456379,990032 );
        ebay.addCustomer("Petr","Obolov","Borisov","Norisov str.43",3263578,100145);
        System.out.println("Customers sorted by surname:");
        ebay.sortCustomersByName();
        System.out.println("Customers sorted by the  range of card numbers");
        ebay.customerCardNumberOutput(1000000,2000000);
    }
}
