package Task8;

import java.math.BigInteger;

public class Customer {
    private String name;
    private String surname;
    private String patronymic;
    private String streetNumber;
    private int cardNumber;
    private int bankAccountNumber;
    public Customer(String name,String surname,String patronymic,String streetNumber,
                    int cardNumber,int bankAccountNumber){
        this.name=name;
        this.surname=surname;
        this.patronymic=patronymic;
        this.streetNumber=streetNumber;
        this.cardNumber=cardNumber;
        this.bankAccountNumber=bankAccountNumber;
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
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }
    public String getStreetNumber() {
        return streetNumber;
    }
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
    public int getBankAccountNumber() {
        return bankAccountNumber;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }
    public int CompareTo(Customer o){
        return surname.compareTo(o.getSurname());
    }
}
