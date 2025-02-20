import java.util.HashMap;
import java.util.Map;

public class Guest {
    private String fullName;
    private String phone;
    private String email;
    private String address;
    private String nationality;
    private String password;

    // Map for fast guest lookup by email
    private static Map<String, Guest> guestMap = new HashMap<>();

    public Guest(String fullName, String phone, String email, String address, String nationality, String password) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.nationality = nationality;
        this.password = password;
    }

    // Sign-up method
    public static boolean signUp(String fullName, String phone, String email, String address, String nationality, String password) {
        if (email == null || password == null || fullName == null) {
            System.out.println("Error: All fields are required.");
            return false;
        }

        if (guestMap.containsKey(email)) {
            System.out.println("User already exists! Please log in.");
            return false;
        }

        Guest newGuest = new Guest(fullName, phone, email, address, nationality, password);
        guestMap.put(email, newGuest);
        System.out.println("Account created successfully! You can now log in.");
        return true;
    }

    // Login method
    public static boolean login(String email, String password) {
        Guest guest = guestMap.get(email);

        if (guest == null) {
            System.out.println("Email not found. Please check the email address and try again.");
            return false;
        }

        if (guest.password.equals(password)) {
            System.out.println("Login successful! Welcome back, " + guest.fullName);
            return true;
        } else {
            System.out.println("Invalid password. Please try again.");
            return false;
        }
    }

    // Display guest details
    public void displayDetails() {
        System.out.println("Guest Details:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Nationality: " + nationality);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test sign-up
        signUp("John Doe", "1234567890", "john@example.com", "123 Street, NY", "USA", "pass123");

        // Test login
        login("john@example.com", "pass123");

        // Test invalid password
        login("john@example.com", "wrongpass");

        // Test non-existent user
        login("nonexistent@example.com", "pass123");
    }
}
