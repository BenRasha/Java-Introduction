package AccountingOfBooksInHomeLibrary.Roles;

import java.io.*;
import java.util.Scanner;

public class Admin extends RolePerformer {

    public Admin(String email, String password) {
        super(email, password);
    }

    public void addBook () {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input name of the book:");
            String bookTitle = bufferedReader.readLine();
            System.out.print("Input author of the book:");
            String bookAuthor = bufferedReader.readLine();
            System.out.print("Input type of the book:");
            String bookType = bufferedReader.readLine();
            try {
                File file = new File("C:\\Users\\bbenr\\IdeaProjects\\Java-Introduction\\src\\Epam\\LastTasks\\AccountingOfBooksInHomeLibrary\\Resources\\Books.txt");
                FileWriter fileWriter = new FileWriter(file,true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("\n" + bookTitle + ":" + bookAuthor + ":" + bookType);
                bufferedWriter.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
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
            String [] users = scanner.nextLine().split(":");
            String userRole = users[0];
            String userMail = users[1];
            String userPassword = users[2];
            if (userRole.equals("user")) {
                System.out.println("Hey," + userMail + ", new book has been added");
            }
        }
    }
}
