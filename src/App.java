import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();
        boolean running = true;

        while (running) {
            System.out.println("===== Student Management System =====");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Daftar Mahasiswa");
            System.out.println("3. Hapus Mahasiswa");
            System.out.println("99. Keluar");
            System.out.print("Pilih menu: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    service.addStudent();
                    break;
                case "2":
                    service.listStudents();
                    break;
                case "3":
                    service.deleteStudent();
                    break;
                case "99":
                    System.out.println("Terima kasih! Program selesai.");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }
        }
    }
}
