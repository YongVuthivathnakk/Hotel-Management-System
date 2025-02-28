package UserFolder;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

import Booking.bookingTesting;
import Register_and_Login.Validator;

public abstract class User {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected String userName;
    protected String password;
    protected String gender;
    protected int age;


    public User(String firstName, String lastName, String userName, String gender, int age ,String email, String phoneNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
    }

    // Getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getGender() {
        return this.gender;
    }

    public String getPassword() {
        return this.password;
    }

    public int age() {
        return this.age;
    }


    // method

    

    public boolean login(){
    // =================== Variable ========================
            Scanner input = new Scanner(System.in);
            String inputUserName;
            String inputPassword;
    // ======================================================
        
        System.out.print("Username: ");
        inputUserName = input.nextLine().trim().replaceAll(" ", "");
        System.out.print("Passowrd: ");
        inputPassword = input.nextLine();

        if (inputUserName.equals(this.userName) && inputPassword.equals(this.password)) {
            input.close();
            return true;
        } else {
            input.close();
            return false;
        }
    };


    public void register() {
        
// =================== Variable ========================

        Scanner input = new Scanner(System.in);
        String lastName;
        String userName;
        String gender;
        int age;
        String email;
        String phoneNumber;
        String password;
        Validator validate = new Validator();

// ======================================================

        //Enter the fist name
        System.out.print("Enter your First name: ");
        this.firstName = input.nextLine().trim().replaceAll(" ", ""); // Remove all empty space

        // Enter the Last Name
        System.out.print("Enter your Last name: ");
        this.lastName = input.nextLine().trim().replaceAll(" ", ""); // Remove all empyt space
        
        // Enter the user name
        System.out.print("Enter your User name: ");
        this.userName = input.nextLine().trim().replaceAll(" ", "");
        
        // Enter gender
        
        while (true) {
            System.out.print("Enter your gender (M / F): ");
            gender = input.nextLine();
            if(gender.toUpperCase().equals("M") || gender.toUpperCase().equals("F")) {
                this.gender = gender;
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
                    this.age = age;
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
                this.email = email;
                break;
            } else {
                System.out.println("Wrong email address format!!");
            }
        }

        while (true) {
            System.out.print("Enter your phone number: ");
            phoneNumber = input.nextLine().trim().replaceAll(" ", "");
            if (validate.isPhoneNumberValid(phoneNumber)) {
                this.phoneNumber = phoneNumber;
                break;
            } else {
                System.out.println("Your number must start with [7-9] and followed by [0-9] of 9 digits.");
            }
        }
        

        while (true) {
            System.out.print("Enter your Password: ");
            password = input.nextLine();
            if (password.length() >= 8) {
                this.password = password;
                break;
            } else {
                System.out.println("Your password is too short !!!");
            }
        }
        
        input.close();
        
    }


    @Override
    public String toString() {
        return "\nFirst Name: " + firstName + 
                "\nLast Name: " + lastName + 
                "\nEmail: " + email + 
                "\nPhone Number: " + phoneNumber + 
                "\nUser Name=" + userName + 
                "\nPassword=" + password + 
                "\nGender=" + gender + 
                "\nAge: " + age;
    }

    
 
}
