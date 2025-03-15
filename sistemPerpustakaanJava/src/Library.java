// Library.java
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Buku '" + book.getTitle() + "' ditambahkan ke perpustakaan.");
    }

    public void removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("Buku '" + title + "' dihapus dari perpustakaan.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Buku ditemukan: " + book);
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Perpustakaan kosong.");
            return;
        }
        System.out.println("Daftar Buku di Perpustakaan:");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }

    public Book meminjamBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.meminjam();
                System.out.println("Buku '" + title + "' berhasil dipinjam.");
                return book;
            }
        }
        System.out.println("Buku tidak tersedia.");
        return null;
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.returnBook();
                System.out.println("Buku '" + title + "' berhasil dikembalikan.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan atau belum dipinjam.");
    }
}
