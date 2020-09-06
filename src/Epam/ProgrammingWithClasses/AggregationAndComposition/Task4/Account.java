package AggregationAndComposition.Task4;

public class Account {
    private int accountNumber;
    private int amount;
    private String currency;
    private boolean status;
    Account(int accountNumber,int amount,String currency){
        this.accountNumber=accountNumber;
        this.amount=amount;
        this.currency=currency;
        this.status=true;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }
    public boolean getStatus() {
        return status;
    }
    public void putMoney(int amount){
        this.amount+=amount;
    }
    public void excludeMoney(int amount){
        this.amount-=amount;
    }
    public void blockAccount(){
        this.status=false;
    }
    public void unblockAccount(){
        this.status=true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", status=" + status +
                '}';
    }
}
