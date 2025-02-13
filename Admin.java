import java.util.Scanner;

public class Admin {
    private final int adminId;
    private static int totalID = 0;
    private String name;
    private String password;
    private String email;
    private String phoneNumber;
    private double salary;
    private String status; // OFFLINE, ONLINE
    private String role; // MANAGER, SUPERVISOR, SUPPORT

    Admin(String name, String password, String email, String phoneNumber, String role, String status) {
        validateInput(name, password, email);
        this.adminId = ++totalID;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = 0; // default salary
        this.status = status;
        this.role = role;
    }

    private void validateInput(String name, String password, String email) {
        //thow new IllegalArgumentException means that the program will stop and show the error message
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

    public void setStatus(String status) {
        this.status = status;
    }

    public void changePassword(String password) {
        // check if the entered password is correct with the old password
        if (this.password.equals(password)) {
            // prompt the user to enter the new password
            Scanner scanner = new Scanner(System.in);
            String newPassword;
            String reEnterPassword;
            do {
                do { 
                    // Check if the user enter a password with at least 8 characters
                    System.out.println("Enter the new password: ");
                    newPassword = scanner.nextLine();
                    if (newPassword.length() < 8) {
                        System.out.println("Password too weak. Please try again.");
                    }
                } while (newPassword.length() < 8);

                // Make sure that the user re-enter the password correctly 
                System.out.println("Re-enter the new password: ");
                reEnterPassword = scanner.nextLine();
                if (!newPassword.equals(reEnterPassword)) {
                    System.out.println("Passwords do not match. Please try again.");
                }
            } while (!newPassword.equals(reEnterPassword));
            this.password = newPassword;
            System.out.println("Password successfully changed.");
        }
    }
}
