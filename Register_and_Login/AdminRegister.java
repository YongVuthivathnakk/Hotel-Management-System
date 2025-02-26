package Register_and_Login;

import java.util.Scanner;

import User.Admin;

public class AdminRegister {
    // Create universal admin for checking
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        String userName;
        String status;
        String password;
        String gender;

        System.out.println("==== Admin Registration =====");
        // Enter the fist name
        System.out.print("Enter your First name: ");
        firstName = scanner.nextLine().replaceAll(" ", ""); // Remove all empty space

        // Enter the Last Name
        System.out.print("Enter your Last name: ");
        lastName = scanner.nextLine().replaceAll(" ", ""); // Remove all empyt space
        
        // Enter the user name
        System.out.print("Enter your User name: ");
        userName = scanner.nextLine().replaceAll(" ", "");
        
        // Enter gender
        System.out.print("Enter your gender (M / F): ");
        
        gender = scanner.nextLine();

        scanner.close();
        // while (true) {
        // }


        // System.out.println("Enter your Username: ");
        // System.out.println("Enter your email address: ");
        // System.out.println("Enter your phone number: ");
        // System.out.println("Enter your Status: ");
        // System.out.println("Enter your Password: ");

    }
}
