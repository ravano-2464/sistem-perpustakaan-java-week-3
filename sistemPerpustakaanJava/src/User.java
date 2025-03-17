/**
 * Kelas User merepresentasikan pengguna perpustakaan.
 */
public class User {
    protected String id;
    protected String name;

    /**
     * Konstruktor untuk membuat objek User.
     *
     * @param id   ID pengguna (tidak boleh null atau kosong).
     * @param name Nama pengguna (tidak boleh null atau kosong).
     * @throws IllegalArgumentException Jika id atau name null atau kosong.
     */
    public User(String id, String name) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID tidak boleh null atau kosong.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh null atau kosong.");
        }
        this.id = id;
        this.name = name;
    }

    /**
     * Menampilkan peran pengguna.
     */
    public void displayRole() {
        System.out.println("Saya adalah pengguna perpustakaan.");
    }

    /**
     * Mengembalikan ID pengguna.
     *
     * @return ID pengguna.
     */
    public String getId() {
        return id;
    }

    /**
     * Mengatur ID pengguna.
     *
     * @param id ID pengguna (tidak boleh null atau kosong).
     * @throws IllegalArgumentException Jika id null atau kosong.
     */
    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID tidak boleh null atau kosong.");
        }
        this.id = id;
    }

    /**
     * Mengembalikan nama pengguna.
     *
     * @return Nama pengguna.
     */
    public String getName() {
        return name;
    }

    /**
     * Mengatur nama pengguna.
     *
     * @param name Nama pengguna (tidak boleh null atau kosong).
     * @throws IllegalArgumentException Jika name null atau kosong.
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh null atau kosong.");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}