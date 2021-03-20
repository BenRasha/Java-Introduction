package AccountingOfBooksInHomeLibrary.Roles;

import AccountingOfBooksInHomeLibrary.Library.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class User extends RolePerformer {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<User>users = new ArrayList<>();

    public User(String email, String password) {
        super(email, password);
    }

    public void seeAllBooks () {
        super.getLibrary().printBooks();
    }

    public void findBookByName () {
        String input = scanner.nextLine();
        for (Book books : super.getLibrary().getListOfBooks()) {
            if (books.getName().equals(input)) {
                System.out.println(books);
            }
        }
    }

    public void findBookByAuthor () {
        String input = scanner.nextLine();
        for (Book books : super.getLibrary().getListOfBooks()) {
            if (books.getAuthor().equals(input)) {
                System.out.println(books);
            }
        }
    }

    public void findBookByType () {
        String input = scanner.nextLine();
        for (Book books : super.getLibrary().getListOfBooks()) {
            if (books.getType().equals(input)) {
                System.out.println(books);
            }
        }
    }

    public void suggestBookAddition () {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input name of the book:");
            String bookTitle = bufferedReader.readLine();
            System.out.print("Input author of the book:");
            String bookAuthor = bufferedReader.readLine();
            System.out.print("Input type of the book:");
            String bookType = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileReader fileReader = null;
        try {
            File file = new File("C:\\Users\\bbenr\\IdeaProjects\\Java-Introduction\\src\\Epam\\LastTasks\\AccountingOfBooksInHomeLibrary\\Resources\\Authorization.txt");
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String []info = scanner.nextLine().split(":");
            if (info[0].equals("admin")) {
                System.out.println("Hey," + info[0] + ", I would like to add a book to a catalog");
            }
        }
    }

}
