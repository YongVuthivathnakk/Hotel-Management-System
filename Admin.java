import java.time.LocalTime;
import java.util.StringTokenizer;

public class Admin {
    private final int adminId;
    private static int totalID = 0;
    private String name;
    // private String hashedPassword;
    private String email;
    private String phoneNumber;
    private double salary;
    private String status; // OFFLINE, ONLINE
    private LocalTime shiftStart;
    private LocalTime shiftEnd;
    private String role; // MANAGER, SUPERVISOR, SUPPORT

    public Admin(String name, String password, String email, String phoneNumber, double salary, LocalTime shiftStart, LocalTime shiftEnd, String role, String status) {
        validateInput(name, password, email);
        this.adminId = ++totalID;
        this.name = name;
        // this.hashedPassword = hashPassword(password);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.status = status;
        this.shiftStart = shiftStart;
        this.shiftEnd = shiftEnd;
        this.role = role;
    }

    private void validateInput(String name, String password, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password too weak");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
    }

    // Getters
    public int getAdminId() {
        return adminId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() { 
        return status;
    }
    
    public String getRole() { 
        return role;
    }

    // Setters
    public void setShift(LocalTime start, LocalTime end) {
        this.shiftStart = start;
        this.shiftEnd = end;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // public boolean verifyPassword(String inputPassword) {
    //     return hashPassword(inputPassword).equals(hashedPassword);
    // }

    // private String hashPassword(String password) {
    //     // Implement actual hashing (e.g., BCrypt)
    //     return Integer.toString(password.hashCode());
    // }
}
