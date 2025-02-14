import java.util.ArrayList;
import java.util.List;

public class Guest {
    // Personal information of guest (private for better encapsulation)
    private String fullName;
    private String phone;
    private String email;
    private String address;
    private String nationality;
    private String password; // For authentication
    // List to store guests (public for simplicity)
    public static List<Guest> guestList = new ArrayList<>();

    // Constructor
    public Guest(String fullName, String phone, String email, String address, String nationality, String password) {
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.nationality = nationality;
        this.password = password;

        // Add guest to list
        guestList.add(this);
    }

    // Getter methods for private fields
    public String getFullName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

    // Sign-up (register a new guest)
    public static boolean signUp(String fullName, String phone, String email, String address, String nationality, String password) {
        // Check if user already exists
        for (Guest guest : guestList) {
            if (guest.email.equals(email)) {
                System.out.println("User already exists! Please log in.");
                return false;
            }
        }
        // Register new guest and add it to the list
        new Guest(fullName, phone, email, address, nationality, password);
        System.out.println("Account created successfully! You can now log in.");
        return true;
    }

    // Log in (check user credentials)
    public static boolean login(String email, String password) {
        for (Guest guest : guestList) {
            if (guest.email.equals(email)) {
                if (guest.password.equals(password)) {
                    System.out.println("Login successful! Welcome back, " + guest.fullName);
                    return true;
                } else {
                    System.out.println("Invalid password. Please try again.");
                    return false;
                }
            }
        }
        System.out.println("Email not found. Please check the email address and try again.");
        return false;
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

        // Test login with wrong credentials
        login("john@example.com", "wrongpass");

        // Test login with a non-existing email
        login("nonexistent@example.com", "pass123");
    }
}
