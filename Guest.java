import java.util.HashMap;
import java.util.Map;

public class Guest extends User implements Display{
    private String address;
    private String nationality;

    // Map for fast guest lookup by email
    private static Map<String, Guest> guestMap = new HashMap<>();

    public Guest(String firstName, String lastName, String phoneNumber, String email, String address, String nationality,  String userName , String password) {
        super(firstName, lastName, userName, email, phoneNumber, password);
        this.address = address;
        this.nationality = nationality;
    }

    // Sign-up method
    public static boolean signUp(String firstName, String lastName, String phone, String email, String address, String nationality, String userName,String password) {
        if (email == null || password == null || firstName == null || lastName == null) {
            System.out.println("Error: All fields are required.");
            return false;
        }

        if (guestMap.containsKey(email)) {
            System.out.println("User already exists! Please log in.");
            return false;
        }

        Guest newGuest = new Guest(firstName, lastName, phone, email, address, nationality, userName, password);
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
            System.out.println("Login successful! Welcome back, " + guest.userName);
            return true;
        } else {
            System.out.println("Invalid password. Please try again.");
            return false;
        }
    }

    // Display guest details
    
    
        @Override
        public void display() {
            System.out.println("Guest Details:");
            System.out.println("Full Name: " + firstName + " " + lastName);
            System.out.println("User Name: " + userName);
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Email: " + email);
            System.out.println("Address: " + address);
            System.out.println("Nationality: " + nationality);
        }


    // Main method for testing
    public static void main(String[] args) {
        // // Test sign-up
        // signUp("John Doe", "1234567890", "john@example.com", "123 Street, NY", "USA", "pass123");

        // // Test login
        // login("john@example.com", "pass123");

        // // Test invalid password
        // login("john@example.com", "wrongpass");

        // // Test non-existent user
        // login("nonexistent@example.com", "pass123");
    }
}