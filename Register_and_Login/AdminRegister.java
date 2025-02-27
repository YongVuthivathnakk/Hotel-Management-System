package Register_and_Login;

import java.util.Scanner;
import java.util.regex.Pattern;
import User.Admin;


    public class AdminRegister {
        public static boolean isValid(String email) {
    
        // Regular expression to match valid email formats
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    
        // Compile the regex
        Pattern p = Pattern.compile(emailRegex);
        
        // Check if email matches the pattern
        return email != null && p.matcher(email).matches();
    }



    // Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;
        String userName;
        String email;
        String status;
        String password;
        String gender;

        System.out.println("==== Admin Registration =====\n");
        //Enter the fist name
        System.out.print("Enter your First name: ");
        firstName = input.nextLine().replaceAll(" ", ""); // Remove all empty space

        // Enter the Last Name
        System.out.print("Enter your Last name: ");
        lastName = input.nextLine().replaceAll(" ", ""); // Remove all empyt space
        
        // Enter the user name
        System.out.print("Enter your User name: ");
        userName = input.nextLine().replaceAll(" ", "");
        
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
            System.out.println("Enter your email address: ");
            email = input.nextLine();
            if (isValid(email)) {
                break;
            } else {
                System.out.println("Wrong email address format!!");
            }
        }
        
        


        input.close();

        // System.out.println("Enter your phone number: ");
        // System.out.println("Enter your Status: ");
        // System.out.println("Enter your Password: ");

    }
}
