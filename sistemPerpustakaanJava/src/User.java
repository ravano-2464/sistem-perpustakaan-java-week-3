public class User {
    protected String id;
    protected String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayRole() {
        System.out.println("Saya adalah pengguna perpustakaan.");
    }
}
