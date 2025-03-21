package CLI;

import java.util.Scanner;

import TempFolder.Admin;

public class UsersApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to Hotel Management System");
            System.out.println("1. Guest Login");
            System.out.println("2. Admin Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = input.nextInt();
            input.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    guestMenu(input);
                    break;
                case 2:
                    Admin admin = new Admin();
                    
                    AdminMenu(input);
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }  
        }
    }





















//  ===========================------ Functions ------===========================



// ----------------------------- Guest Menu -------------------------------------- 

    public static void guestMenu(Scanner input) {
        while (true) {
            System.out.println("\n--- Guest Menu ---");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Make a Reservation");
            System.out.println("3. View My Booking");
            System.out.println("4. Request Services");
            System.out.println("5. Pay Invoice");
            System.out.println("6. Back to Main Menu");
            System.out.print("Choose an option: ");
            
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Showing available rooms...");
                    break;
                case 2:
                    System.out.println("Making a reservation...");
                    break;
                case 3:
                    System.out.println("Fetching booking details...");
                    break;
                case 4:
                    System.out.println("Requesting hotel services...");
                    break;
                case 5:
                    System.out.println("Processing payment...");
                    break;
                case 6:
                    return;  // Go back to main menu
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }



// ------------------------------ Staff/Admin Login -------------------------------------

    public static void staffLogin(Scanner input) {
        System.out.print("\nEnter Admin/Staff Username: ");
        String username = input.nextLine();
        System.out.print("Enter Password: ");
        String password = input.nextLine();

        if (username.equals("admin") && password.equals("password")) {
            AdminMenu(input);
        } else {
            System.out.println("Invalid credentials! Returning to main menu...");
        }
    }


// ---------------------------------- Staff/Admin Menu --------------------------------------

    public static void AdminMenu(Scanner input) {
        while (true) {
            System.out.println("\n--- Staff/Admin Menu ---");
            System.out.println("1. Manage Rooms");
            System.out.println("2. View Guest Reservations");
            System.out.println("3. Assign Housekeeping");
            System.out.println("4. Generate Invoice");
            System.out.println("5. View Reports");
            System.out.println("6. Logout");
            System.out.print("Choose an option: ");
            
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Managing room availability...");
                    break;
                case 2:
                    System.out.println("Viewing guest reservations...");
                    break;
                case 3:
                    System.out.println("Assigning housekeeping tasks...");
                    break;
                case 4:
                    System.out.println("Generating invoice...");
                    break;
                case 5:
                    System.out.println("Viewing reports...");
                    break;
                case 6:
                    return;  // Logout and go back to main menu
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
