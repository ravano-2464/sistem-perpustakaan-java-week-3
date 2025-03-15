/**
 * Kelas Member merepresentasikan seorang anggota perpustakaan.
 */
public class Member extends User {
    /**
     * Konstruktor untuk membuat objek Member.
     *
     * @param id   ID anggota (tidak boleh null atau kosong).
     * @param name Nama anggota (tidak boleh null atau kosong).
     */
    public Member(String id, String name) {
        super(id, name);
    }

    @Override
    public void displayRole() {
        System.out.println("Saya adalah Anggota. Saya bisa meminjam dan mengembalikan buku.");
    }

    /**
     * Meminjam buku dari perpustakaan.
     *
     * @param library Perpustakaan tempat buku dipinjam (tidak boleh null).
     * @param title   Judul buku yang akan dipinjam (tidak boleh null atau kosong).
     */
    public void meminjamBook(Library library, String title) {
        if (library == null) {
            System.out.println("Perpustakaan tidak boleh null.");
            return;
        }
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Judul buku tidak boleh null atau kosong.");
            return;
        }
        Book book = library.meminjamBook(title);
        if (book != null) {
            System.out.println("Buku '" + book.getTitle() + "' berhasil dipinjam.");
        }
    }

    /**
     * Mengembalikan buku ke perpustakaan.
     *
     * @param library Perpustakaan tempat buku dikembalikan (tidak boleh null).
     * @param title   Judul buku yang akan dikembalikan (tidak boleh null atau kosong).
     */
    public void kembalikanBuku(Library library, String title) {
        if (library == null) {
            System.out.println("Perpustakaan tidak boleh null.");
            return;
        }
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Judul buku tidak boleh null atau kosong.");
            return;
        }
        library.kembalikanBuku(title);
    }
}