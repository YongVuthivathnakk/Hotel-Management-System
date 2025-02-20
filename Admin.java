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
    private String role;   // MANAGER, SUPERVISOR, SUPPORT

    // Scanner for input operations in methods like changePassword
    private Scanner scanner = new Scanner(System.in);

    public Admin(String name, String password, String email, String phoneNumber, String role, String status) {
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

    /**
     * Checks if the provided password meets security criteria:
     * at least 8 characters, contains uppercase, lowercase, digit, and special character.
     */
    private boolean isStrongPassword(String password) {
        if (password.length() < 8) return false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    /**
     * Allows the admin to change their password.
     * First verifies the current password, then prompts for a new strong password.
     */
    public void changePassword(String oldPassword) {
        if (!this.password.equals(oldPassword)) {
            System.out.println("Old password is incorrect. Cannot change password.");
            return;
        }

        String newPassword;
        String reEnterPassword;
        do {
            do {
                System.out.println("Enter the new password (min 8 characters, include uppercase, lowercase, digit, and special character): ");
                newPassword = scanner.nextLine();
                if (!isStrongPassword(newPassword)) {
                    System.out.println("Password does not meet security criteria. Please try again.");
                }
            } while (!isStrongPassword(newPassword));

            System.out.println("Re-enter the new password: ");
            reEnterPassword = scanner.nextLine();
            if (!newPassword.equals(reEnterPassword)) {
                System.out.println("Passwords do not match. Please try again.");
            }
        } while (!newPassword.equals(reEnterPassword));

        this.password = newPassword;
        System.out.println("Password successfully changed.");
    }

    // NOT YET CUZ NEED FILE IMPLEMENTATION

// =========================================================================================================

    /**
     * Processes a checkout request from a user.
     * @param checkoutRequest true if the checkout request is accepted, false otherwise.
     */
    public void acceptCheckout(boolean checkoutRequest) {
        if (checkoutRequest) {
            System.out.println("Checkout request accepted.");
            // Additional logic for processing checkout can be added here.
        } else {
            System.out.println("Checkout request rejected.");
        }
    }


    /**
     * Processes a check-in request from a user.
     * @param checkInRequest true if the check-in request is accepted, false otherwise.
     */
    public void acceptCheckIn(boolean checkInRequest) {
        if (checkInRequest) {
            System.out.println("Check-in request accepted.");
            // Additional logic for processing check-in can be added here.
        } else {
            System.out.println("Check-in request rejected.");
        }
    }


    
    
    /**
     * Changes the status of a room.
     * @param roomNumber the room number to update.
     * @param newStatus the new status for the room (e.g., "Available", "Occupied", "Maintenance").
     */
    public void changeRoomStatus(int roomNumber, String newStatus) {
        // Here you could update a Room object in a list or database.
        // For now, we simply print out the change.
        System.out.println("Room " + roomNumber + " status changed to: " + newStatus);
    }
    
// ==========================================================================================================
}
