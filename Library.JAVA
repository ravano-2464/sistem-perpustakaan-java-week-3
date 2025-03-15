public class LibrarySystem {
    public static void main(String[] args) {
        Admin admin = new Admin("Alice", 5);
        admin.addBook("Java Programming", "James Gosling");
        admin.addBook("Data Structures", "Robert Lafore");

        admin.displayBooks();

        Member member = new Member("Bob");
        member.interact();
        member.borrowBook(admin.books, "Java Programming");

        admin.displayBooks();

        member.returnBook(admin.books, "Java Programming");

        admin.displayBooks();
    }
}
