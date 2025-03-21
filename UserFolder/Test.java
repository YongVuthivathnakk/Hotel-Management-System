package UserFolder;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import CustomException.InputMismatchException;



public class Test {
    // public static void readFromFile() {
    //     FileReader fileReader = new FileReader();
    // }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Admin> adminList = new ArrayList<>();
        ArrayList<Employee> employeeList = new ArrayList<>();
        // ArrayList<Guest> guestList = new ArrayList<>();
        int choice = 0;
        do {
            System.out.println("\n--- User Menu ---");
            System.out.println("1. Add Admin");
            System.out.println("2. Add Employee");
            System.out.println("3. Add guest");
            System.out.println("4. List All Users");
            System.out.println("5. Write Data to CSV File (Overwrite)");
            System.out.println("6. Append Data to CSV File");
            System.out.println("7. Read CSV Data from File");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            try{
                if(input.hasNextInt()) {
                    choice = input.nextInt();
                    input.nextLine(); // clear buffer
                } else {
                    System.out.println("Please enter integer number.");
                    input.nextLine(); // clear buffer
                    continue;
                }
                // switch (choice) {
                //     case 1:
                //         User newAdmin = new Admin();
                //         newAdmin.register(input);
                //         writeToFile(newAdmin);
                //         break;
                //     case 2:
                //         User newEmployee = new Employee();
                //         newEmployee.register(input);
                //         writeToFile(newEmployee);
                //         break;
                    
                //     case 4:
                //         for(User user : User.listAllUsers().values()) {
                //             System.out.println(user);
                //         }
                //         break;
                //     default:
                //         System.out.println("Invalid Input.");
                //         break;
                // }
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Please enter integer number.");
            }
        } while (choice != 8);

        input.close();
    }
}
