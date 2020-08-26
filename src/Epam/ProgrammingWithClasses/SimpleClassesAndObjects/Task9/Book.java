package Task9;

public class Book {
    private int id;
    private String author;
    private String publishingHouse;
    private int publishingYear;
    private int numberOfPages;
    private int price;
    private String bindingType;
    public Book(int id,String author, String publishingHouse,int publishingYear,int numberOfPages,int price,String bindingType){
        this.id=id;
        this.author=author;
        this.publishingHouse=publishingHouse;
        this.publishingYear=publishingYear;
        this.numberOfPages=numberOfPages;
        this.price=price;
        this.bindingType=bindingType;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
    public String getPublishingHouse() {
        return publishingHouse;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
    public String getBindingType() {
        return bindingType;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
