import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.println("=== Sistem Perpustakaan ===");
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();

        System.out.print("Pilih peran (1. Admin, 2. Member): ");
        int roleChoice = scanner.nextInt();
        scanner.nextLine();

        if (roleChoice == 1) {
            Admin admin = new Admin("A001", name);
            admin.displayRole();
            adminMenu(admin, library, scanner);
        } else if (roleChoice == 2) {
            Member member = new Member("M001", name);
            member.displayRole();
            memberMenu(member, library, scanner);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    private static void adminMenu(Admin admin, Library library, Scanner scanner) {
        while (true) {
            System.out.println("\n=== Menu Admin ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan nama pengarang: ");
                    String author = scanner.nextLine();
                    admin.addBook(library, new Book(title, author));
                    break;
                case 2:
                    System.out.print("Masukkan judul buku yang akan dihapus: ");
                    library.removeBook(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Masukkan judul buku yang dicari: ");
                    library.searchBook(scanner.nextLine());
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void memberMenu(Member member, Library library, Scanner scanner) {
        while (true) {
            System.out.println("\n=== Menu Member ===");
            System.out.println("1. Lihat Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Masukkan judul buku: ");
                    member.meminjamBook(library, scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Masukkan judul buku yang dikembalikan: ");
                    member.returnBook(library, scanner.nextLine());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
