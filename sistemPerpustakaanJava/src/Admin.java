// Admin.java
public class Admin extends User {
    public Admin(String id, String name) {
        super(id, name);
    }

    @Override
    public void displayRole() {
        System.out.println("Saya adalah Admin. Saya mengelola buku.");
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
    }

    public void removeBook(Library library, String title) {
        library.removeBook(title);
    }
}
