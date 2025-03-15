import java.util.ArrayList;
import java.util.Iterator;

/**
 * Kelas Library merepresentasikan sebuah perpustakaan yang menyimpan daftar buku.
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    /**
     * Menambahkan buku ke perpustakaan.
     *
     * @param book Buku yang akan ditambahkan (tidak boleh null).
     * @throws IllegalArgumentException Jika buku null.
     */
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Buku tidak boleh null.");
        }
        books.add(book);
        System.out.println("Buku '" + book.getTitle() + "' ditambahkan ke perpustakaan.");
    }

    /**
     * Menghapus buku dari perpustakaan berdasarkan judul.
     *
     * @param title Judul buku yang akan dihapus (tidak boleh null atau kosong).
     * @throws IllegalArgumentException Jika judul null atau kosong.
     */
    public void removeBook(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Judul buku tidak boleh null atau kosong.");
        }
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                System.out.println("Buku '" + title + "' dihapus dari perpustakaan.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    /**
     * Mencari buku berdasarkan judul.
     *
     * @param title Judul buku yang dicari (tidak boleh null atau kosong).
     * @throws IllegalArgumentException Jika judul null atau kosong.
     */
    public void searchBook(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Judul buku tidak boleh null atau kosong.");
        }
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Buku ditemukan: " + book);
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    /**
     * Menampilkan daftar semua buku di perpustakaan.
     */
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

    /**
     * Meminjam buku berdasarkan judul.
     *
     * @param title Judul buku yang akan dipinjam (tidak boleh null atau kosong).
     * @return Buku yang berhasil dipinjam, atau null jika buku tidak tersedia.
     * @throws IllegalArgumentException Jika judul null atau kosong.
     */
    public Book meminjamBook(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Judul buku tidak boleh null atau kosong.");
        }
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.meminjam();
                    System.out.println("Buku '" + title + "' berhasil dipinjam.");
                    return book;
                } else {
                    System.out.println("Buku '" + title + "' sedang dipinjam.");
                    return null;
                }
            }
        }
        System.out.println("Buku '" + title + "' tidak ditemukan di perpustakaan.");
        return null;
    }

    /**
     * Mengembalikan buku yang dipinjam berdasarkan judul.
     *
     * @param title Judul buku yang akan dikembalikan (tidak boleh null atau kosong).
     * @throws IllegalArgumentException Jika judul null atau kosong.
     */
    public void kembalikanBuku(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Judul buku tidak boleh null atau kosong.");
        }
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.kembalikanBuku();
                System.out.println("Buku '" + title + "' berhasil dikembalikan.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan atau belum dipinjam.");
    }
}