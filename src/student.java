import java.time.LocalDate;

public class student {
    private String nim;
    private String name;
    private LocalDate dob;     
    private String address;   


    public student(String nim, String name, LocalDate dob, String address) {
        this.nim = nim;
        this.name = name;
        this.dob = dob;
        this.address = address;
    }


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


    @Override
    public String toString() {
        return String.format("%s - %s | DOB: %s | Address: %s",
                nim, name, dob, address);
    }
}
