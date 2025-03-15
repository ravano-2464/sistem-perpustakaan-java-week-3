// Member.java
public class Member extends User {
    public Member(String id, String name) {
        super(id, name);
    }

    @Override
    public void displayRole() {
        System.out.println("Saya adalah Anggota. Saya bisa meminjam dan mengembalikan buku.");
    }

    public void meminjamBook(Library library, String title) {
        library.meminjamBook(title);
    }

    public void returnBook(Library library, String title) {
        library.returnBook(title);
    }
}
