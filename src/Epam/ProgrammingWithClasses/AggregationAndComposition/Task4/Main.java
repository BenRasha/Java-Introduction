package AggregationAndComposition.Task4;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов.
Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {
    public static void main(String args[]){
        Client first=new Client("Ivan","Grishchenko","MP123456");
        first.addAccount(new Account(3451234,50,"BYN"));
        first.addAccount(new Account(467123,100,"BYN"));
        first.addAccount(new Account(304512,-1000,"BYN"));
        first.addAccount(new Account(452309,-50,"BYN"));
        first.addAccount(new Account(506812,1000,"BYN"));
        Bank belinv=new Bank("Belinvest");
        belinv.addClients(first);
        belinv.getClientById("MP123456").accountSearchByAccountNumber(3451234);
        belinv.getClientById("MP123456").accountSortByAmount();
        belinv.getClientById("MP123456").printAccounts();
        belinv.getClientById("MP123456").sumOfAllPositiveAccounts();
        belinv.getClientById("MP123456").sumOfAllNegativeAccounts();
        belinv.getClientById("MP123456").sumOfAllAccount();
    }
}
