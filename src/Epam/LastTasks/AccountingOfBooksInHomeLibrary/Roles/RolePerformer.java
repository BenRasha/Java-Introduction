package AccountingOfBooksInHomeLibrary.Roles;

import AccountingOfBooksInHomeLibrary.Library.Library;

public class RolePerformer {

    private String email;
    private String password;
    private Library library = new Library();

    public RolePerformer (String email, String password) {
        this.email=email;
        this.password=password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Library getLibrary() {
        return library;
    }
}
