import java.time.LocalDate;

public class student {
    private String nim;
    private String name;
    private LocalDate dob;     // Date of Birth
    private String address;    // Address

    // Constructor
    public student(String nim, String name, LocalDate dob, String address) {
        this.nim = nim;
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    // Getter
    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    // Untuk menampilkan data mahasiswa dalam format rapi
    @Override
    public String toString() {
        return String.format("%s - %s | DOB: %s | Address: %s",
                nim, name, dob, address);
    }
}
