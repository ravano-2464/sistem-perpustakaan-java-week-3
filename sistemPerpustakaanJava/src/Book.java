import java.util.Objects;

/**
 * Kelas Book merepresentasikan sebuah buku dalam sistem perpustakaan.
 */
public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    /**
     * Konstruktor untuk membuat objek Book.
     *
     * @param title  Judul buku (tidak boleh null atau kosong).
     * @param author Penulis buku (tidak boleh null atau kosong).
     * @throws IllegalArgumentException Jika judul atau penulis null atau kosong.
     */
    public Book(String title, String author) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Judul buku tidak boleh null atau kosong");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Penulis buku tidak boleh null atau kosong");
        }
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Meminjam buku. Jika buku sudah dipinjam, akan melemparkan exception.
     *
     * @throws IllegalStateException Jika buku sudah dipinjam.
     */
    public void meminjam() {
        if (!isAvailable) {
            throw new IllegalStateException("Buku sudah dipinjam dan tidak tersedia");
        }
        isAvailable = false;
    }

    /**
     * Mengembalikan buku ke perpustakaan.
     */
    public void kembalikanBuku() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return title + " | " + author + " | " + (isAvailable ? "Tersedia" : "Dipinjam");
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Judul buku tidak boleh null atau kosong");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Penulis buku tidak boleh null atau kosong");
        }
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}