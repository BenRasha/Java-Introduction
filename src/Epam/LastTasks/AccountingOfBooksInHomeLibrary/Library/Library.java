package AccountingOfBooksInHomeLibrary.Library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> listOfBooks = new ArrayList<>();

    public Library () {
        addBooks();
    }

    public void addBooks () {
        FileReader fileReader = null;
        try {
            File booksFile = new File("C:\\Users\\bbenr\\IdeaProjects\\Java-Introduction\\src\\Epam\\LastTasks\\AccountingOfBooksInHomeLibrary\\Resources\\Books.txt");
            fileReader = new FileReader(booksFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String []books = scanner.nextLine().split(":");
            String name = books[0];
            String author = books[1];
            String type = books[2];
            listOfBooks.add(new Book(name,author,type));
        }
    }

    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void printBooks () {
        for (Book book : this.listOfBooks) {
            System.out.println(book);
        }
    }
}
