package AccountingOfBooksInHomeLibrary.Library;

public class Book {
    private String name;
    private String author;
    private String type;

    public Book (String name, String author, String type) {
        this.name=name;
        this.author=author;
        this.type=type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Название:" + name +
                ", Автор:" + author +
                ", Тип:" + type;
    }
}
