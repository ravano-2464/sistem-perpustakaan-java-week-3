public class Admin extends User {
    public Admin(String id, String name) {
        super(id, name);
    }

    @Override
    public void displayRole() {
        System.out.println("Saya adalah Admin. Saya mengelola buku.");
    }

    public void addBook(Library library, Book book) {
        if (library == null || book == null) {
            throw new IllegalArgumentException("Library dan book tidak boleh null.");
        }
        library.addBook(book);
    }

    public void removeBook(Library library, String title) {
        if (library == null || title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Library dan title tidak boleh null atau kosong.");
        }
        library.removeBook(title);
    }
}