class Member extends User {
    public Member(String name) {
        super(name);
    }

    public void borrowBook(Book[] books, String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public void returnBook(Book[] books, String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    @Override
    public void interact() {
        System.out.println(name + " (Member) sedang mencari buku.");
    }
}
