import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentService {
    private List<student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Tambah mahasiswa baru
    public void addStudent() {
        System.out.print("Masukkan NIM : ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Nama : ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir (yyyy-MM-dd): ");
        String dobInput = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.print("Masukkan Alamat : ");
        String address = scanner.nextLine();

        students.add(new student(nim, name, dob, address));
        System.out.println("✅ Data mahasiswa berhasil ditambahkan!\n");
    }

    // Tampilkan seluruh mahasiswa
    public void listStudents() {
        System.out.println("===== Daftar Mahasiswa =====");
        if (students.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.\n");
        } else {
            for (student s : students) {
                System.out.println(s);
            }
            System.out.println();
        }
    }

    // Hapus mahasiswa berdasarkan NIM
    public void deleteStudent() {
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String nim = scanner.nextLine();

        boolean removed = students.removeIf(s -> s.getNim().equalsIgnoreCase(nim));

        if (removed) {
            System.out.println("✅ Data mahasiswa dengan NIM " + nim + " berhasil dihapus.\n");
        } else {
            System.out.println("❌ Data mahasiswa dengan NIM " + nim + " tidak ditemukan.\n");
        }
    }
}
