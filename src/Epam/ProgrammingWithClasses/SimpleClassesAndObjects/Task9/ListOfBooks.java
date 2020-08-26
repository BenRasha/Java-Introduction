package Task9;

import java.util.ArrayList;

public class ListOfBooks {
    private int id=1;
    private String nameOfTheList;
    private ArrayList<Book>list;
    public ListOfBooks(String nameOfTheList,ArrayList<Book>list){
        this.nameOfTheList=nameOfTheList;
        this.list=list;
    }
    public void addToTheList(String author,String publishingHouse,int publishingYear,int numberOfPages,int price,String bindingType){
        list.add(new Book(id,author,publishingHouse,publishingYear,numberOfPages,price,bindingType));
        id++;
    }
    public void setList(ArrayList<Book> list) {
        this.list = list;
    }
    public ArrayList<Book> getList() {
        return list;
    }
    public void setNameOfTheList(String nameOfTheList) {
        this.nameOfTheList = nameOfTheList;
    }
    public String getNameOfTheList() {
        return nameOfTheList;
    }
    public void authorBooksOutput(String author){
        for (int i=0;i<list.size();i++){
            if (list.get(i).getAuthor()==author){
                System.out.println(list.get(i));
            }
        }
    }
    public void publishingHouseBooksOutput(String publishingHouse){
        for (int i=0;i<list.size();i++){
            if (list.get(i).getPublishingHouse()==publishingHouse){
                System.out.println(list.get(i));
            }
        }
    }
    public void listOfBooksReleasedAfterInputYear(int year){
        for (int i=0;i<list.size();i++){
            if (list.get(i).getPublishingYear()>year){
                System.out.println(list.get(i));
            }
        }
    }
}
