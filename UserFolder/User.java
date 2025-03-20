package UserFolder;

import java.util.HashMap;
import java.util.Map;
import java.util.InputMismatchException;
import java.util.Scanner;

import Validator.Validator;

public abstract class User {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected String username;
    protected String password;
    protected String gender;
    protected int age;
    public static HashMap<String, String> userMap = new HashMap<String, String>();

    public User() {
    }

    public User(String firstName, String lastName, String username, String gender, int age ,String email, String phoneNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.username = username;
        // Auto matically add this user to the HashMap
        userMap.put(username, this);
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

    public String getUsername() {
        return this.username;
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


    public static Map<String, User> listAllUsers() {
        return userMap;
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

        if (inputUserName.equals(this.username) && inputPassword.equals(this.password)) {
            input.close();
            return true;
        } else {
            input.close();
            return false;
        }
    };


    public void register(Scanner input) {
        
// =================== Variable ========================

        String inputUsername;
        String inputGender;
        int inputAge;
        String inputEmail;
        String inputPhoneNumber;
        String inputPassword;
        Validator validate = new Validator();

// ======================================================

        //Enter the fist name
        System.out.print("Enter your First name: ");
        this.firstName = input.nextLine().trim().replaceAll(" ", ""); // Remove all empty space

        // Enter the Last Name
        System.out.print("Enter your Last name: ");
        this.lastName = input.nextLine().trim().replaceAll(" ", ""); // Remove all empyt space
        
        // Enter the user name
        while (true) {
            System.out.print("Enter your Username: ");
            inputUsername = input.nextLine().trim().replaceAll(" ", "");
            if(User.listAllUsers().containsKey(inputUsername)) {
                System.out.println("Username already exist!! Please try again.");
            } else {
                this.username = inputUsername;
                break;
            }
        }
        
        // Enter gender
        
        while (true) {
            System.out.print("Enter your gender (M / F): ");
            inputGender = input.nextLine();
            if(inputGender.toUpperCase().equals("M") || inputGender.toUpperCase().equals("F")) {
                this.gender = inputGender;
                break;
            } else {
                System.out.println("Please Try again!! Gender must be (M / F).");
            }
        }

        // Enter Age

        while (true) {
            try {
                System.out.print("Enter your age: ");
                inputAge = input.nextInt();
                if (inputAge > 18 && inputAge <= 60) {
                    this.age = inputAge;
                    input.nextLine(); // clear buffer
                    break;
                } else {
                    System.out.println("Age must be 18 - 60 !!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter integer number !!!");
                input.nextLine(); // clear buffer
            }
        }

        // Enter Email

        while (true) {
            System.out.print("Enter your email address: ");
            inputEmail = input.nextLine().replaceAll(" ", "");
            if (validate.isEmailValid(inputEmail)) {
                this.email = inputEmail;
                break;
            } else {
                System.out.println("Wrong email address format!!");
            }
    
        }

        // Enter Phone number

        while (true) {
            System.out.print("Enter your phone number: ");
            inputPhoneNumber = input.nextLine().trim().replaceAll(" ", "");
            if (validate.isPhoneNumberValid(inputPhoneNumber)) {
                this.phoneNumber = inputPhoneNumber;
                break;
            } else {
                System.out.println("Your number must start with [7-9] and followed by [0-9] of 10 digits.");
            }
        }
        
        // Enter password

        while (true) {
            System.out.print("Enter your Password: ");
            inputPassword = input.nextLine();
            if (inputPassword.length() >= 8) {
                this.password = inputPassword;
                break;
            } else {
                System.out.println("Your password is too short !!!");
            }
        }
        userMap.put(username, this);
        
    }



    public String toCSV() {
        return firstName + "," + lastName + "," + username + "," + gender + "," + email + "," + age + "," + phoneNumber + "," + password;
    }
    
    @Override
    public String toString() {
        return "\nFirst Name: " + firstName + 
                "\nLast Name: " + lastName + 
                "\nEmail: " + email + 
                "\nPhone Number: " + phoneNumber + 
                "\nUser Name: " + username + 
                "\nGender: " + gender + 
                "\nAge: " + age + "\n";
    }

    
 
}
