package AccountingOfBooksInHomeLibrary.Menu;

import AccountingOfBooksInHomeLibrary.Roles.Admin;
import AccountingOfBooksInHomeLibrary.Roles.RolePerformer;
import AccountingOfBooksInHomeLibrary.Roles.User;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Menu {
    public Menu() {
        getStarted();
    }

    public void getStarted() {
        RolePerformer rolePerformer = login();
        Scanner scanner = new Scanner(System.in);
        if (rolePerformer instanceof User) {
            while (true) {
                System.out.print("Select action:\n" +
                        "1. Show all books\n" +
                        "2. Find book by name\n" +
                        "3. Find book by author\n" +
                        "4. Find book by type\n" +
                        "5. Suggest adding a book\n" +
                        "6. EXIT\n");
                int actionSelector = scanner.nextInt();
                switch (actionSelector) {
                    case 1:
                        rolePerformer.getLibrary().printBooks();
                        break;
                    case 2:
                        ((User) rolePerformer).findBookByName();
                        break;
                    case 3:
                        ((User) rolePerformer).findBookByAuthor();
                        break;
                    case 4:
                        ((User) rolePerformer).findBookByType();
                        break;
                    case 5:
                        ((User) rolePerformer).suggestBookAddition();
                        break;
                    case 6:
                        System.exit(0);
                }
            }
        } else if (rolePerformer instanceof Admin) {
            while (true) {
                System.out.print("Select action\n" +
                        "1. Add book to existing catalog\n" +
                        "2. See all books\n" +
                        "3. EXIT\n");
                int actionSelector = scanner.nextInt();
                switch (actionSelector) {
                    case 1:
                        ((Admin) rolePerformer).addBook();
                        break;
                    case 2:
                        rolePerformer.getLibrary().printBooks();
                        break;
                    case 3:
                        System.exit(0);
                }
            }
        }
    }

    public RolePerformer login() {
        RolePerformer rolePerformer = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Input login:");
            String login = bufferedReader.readLine();
            System.out.print("Input password:");
            String password = bufferedReader.readLine();
            File file = new File("C:\\Users\\bbenr\\IdeaProjects\\Java-Introduction\\src\\Epam\\LastTasks\\AccountingOfBooksInHomeLibrary\\Resources\\Authorization.txt");
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String[] info = scanner.nextLine().split(":");
                if (info[1].equals(login) && info[2].equals(password)) {
                    if (info[0].equals("user")) {
                        rolePerformer = new User(login, password);
                        return rolePerformer;
                    } else if (info[0].equals("admin")) {
                        rolePerformer = new Admin(login, password);
                        return rolePerformer;
                    }
                } else if (info[1].equals(login) && !info[2].equals(password)) {
                    do {
                        System.out.print("Input correct password:");
                        password = bufferedReader.readLine();
                    } while (!info[2].equals(password));
                    if (info[0].equals("user")) {
                        rolePerformer = new User(login, password);
                        return rolePerformer;
                    } else if (info[0].equals("admin")) {
                        rolePerformer = new Admin(login, password);
                        return rolePerformer;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rolePerformer;
    }
}
