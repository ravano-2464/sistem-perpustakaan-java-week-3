class Admin extends User {
    private Book[] books;
    private int bookCount;

    public Admin(String name, int capacity) {
        super(name);
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
            System.out.println("Buku '" + title + "' berhasil ditambahkan.");
        } else {
            System.out.println("Penyimpanan buku penuh.");
        }
    }

    public void removeBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Buku '" + title + "' berhasil dihapus.");
                books[i] = books[bookCount - 1]; // Ganti dengan buku terakhir
                books[bookCount - 1] = null;
                bookCount--;
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public void displayBooks() {
        System.out.println("Daftar Buku:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayInfo();
        }
    }

    @Override
    public void interact() {
        System.out.println(name + " (Admin) sedang mengelola perpustakaan.");
    }
}
