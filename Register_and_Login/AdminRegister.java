package Register_and_Login;
import Register_and_Login.Validator;
import java.util.InputMismatchException;
import java.util.Scanner;

import Booking.bookingTesting;
import User.Admin;

    public class AdminRegister {


    // Main
    public static void main(String[] args) {

// =================== Variable ========================
        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;
        String userName;
        String gender;
        int age;
        String email;
        String phoneNumber;
        String status;
        int tempStatus;
        String password;
        double salary;
        Validator validate = new Validator();

// ======================================================

        System.out.println("==== Admin Registration =====\n");
        //Enter the fist name
        System.out.print("Enter your First name: ");
        firstName = input.nextLine().trim().replaceAll(" ", ""); // Remove all empty space

        // Enter the Last Name
        System.out.print("Enter your Last name: ");
        lastName = input.nextLine().trim().replaceAll(" ", ""); // Remove all empyt space
        
        // Enter the user name
        System.out.print("Enter your User name: ");
        userName = input.nextLine().trim().replaceAll(" ", "");
        
        // Enter gender
        
        while (true) {
            System.out.print("Enter your gender (M / F): ");
            gender = input.nextLine();
            if(gender.toUpperCase().equals("M") || gender.toUpperCase().equals("F")) {
                break;
            } else {
                System.out.println("Please Try again!! Gender must be (M / F).");
            }
        }

        while (true) {
            try {
                System.out.print("Enter your age: ");
                age = input.nextInt();
                if (age > 18 && age <= 60) {
                    input.nextLine(); // clear buffer
                    break;
                } else {
                    System.out.println("Age must be 18 - 60 !!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter interger!");
                input.nextLine(); // clear buffer
            }
        }

        while (true) {
            System.out.print("Enter your email address: ");
            email = input.nextLine().replaceAll(" ", "");
            if (validate.isEmailValid(email)) {
                break;
            } else {
                System.out.println("Wrong email address format!!");
            }
        }

        while (true) {
            System.out.print("Enter your phone number: ");
            phoneNumber = input.nextLine().trim().replaceAll(" ", "");
            if (validate.isPhoneNumberValid(phoneNumber)) {
                break;
            } else {
                System.out.println("Your number must start with [7-9] and followed by [0-9] of 9 digits.");
            }
        }
        
        while (true) {
            try {
                System.out.println("Enter your Status (1 = Online, 0 = Offline): ");
                tempStatus = input.nextInt();
                if (tempStatus == 1) {
                    status = "Online";
                    input.nextLine(); // clear buffer
                    break;
                } else if (tempStatus == 0){
                    status = "Offline";
                    input.nextLine(); // clear buffer
                    break;
                } else {
                    System.out.println("Sorry, wrong input !!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter interger!");
                input.nextLine(); // clear buffer
            }
        }

        while (true) {
            try {
                System.out.print("Enter your salary (must be equal to or more than 100): ");
                salary = input.nextDouble();
                if (salary >= 100) {
                    input.nextLine();
                    break;
                }
                break;
            } catch (InputMismatchException e) {
               System.out.println("Please enter either interger or double number!");
               input.nextLine();
            }
        }

        while (true) {
            System.out.print("Enter your Password: ");
            password = input.nextLine();
            if (password.length() >= 8) {
                break;
            } else {
                System.out.println("Your password is too short !!!");
            }
        }
        
        // create admin
        Admin newAdmin = new Admin(firstName, lastName, userName, gender, age, email, phoneNumber, password, status, salary);
        System.out.print(newAdmin.toString());

        input.close();


    }
}