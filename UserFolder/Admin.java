package UserFolder;
import java.util.InputMismatchException;
import java.util.Scanner;

import Data.WriteToFile;
import Validator.Validator;

public class Admin extends User {
    private String type = "Admin";
    private String password;
    private double salary;
    private String status; // OFFLINE, ONLINE
    public static int count = 0;
    private int id;
    // Scanner for input operations in methods like changePassword
    private Scanner scanner = new Scanner(System.in);


    public Admin() {
        super();
    }

    public Admin(String firstName, String lastName, String userName, String gender, int age ,String email, String phoneNumber, String password, String status, double salary) {
        super(firstName, lastName, userName, gender, age, email, phoneNumber, password);
        this.status = status;
        this.id = count++;
        this.salary = salary;
    }

    // Getters
    
    public int getId() {
        return id;
    }

    public String getStatus() { 
        return status;
    }

    // To String
    @Override
    public String toString() {
        return " == Admin 0" + id + " ==" +
        "\nStatus: " + status + 
        super.toString();
    }


    
    @Override
    public void register(Scanner input) {
        int tempStatus;
        double salary;

        System.out.println("== Register as Admin ==");

        super.register(input);

        // Enter status

        while (true) {
            try {
                System.out.print("Enter your Status (1 = Online, 0 = Offline): ");
                tempStatus = input.nextInt();
                if (tempStatus == 1) {
                    this.status = "Online";
                    input.nextLine(); // clear buffer
                    break;
                } else if (tempStatus == 0){
                    this.status = "Offline";
                    input.nextLine(); // clear buffer
                    break;
                } else {
                    System.out.println("Sorry, wrong input !!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter either 1 or 0 !!!");
                input.nextLine();
            }
        }


        // Enter salary

        while (true) {
            try {
                System.out.print("Enter your salary (must be equal to or more than 100): ");
                salary = input.nextDouble();
                if (salary >= 100) {
                    input.nextLine();
                    this.salary = salary;
                    break;
                } else {
                    System.out.println("Salary must be equal to or more than 100 !!!");
                    input.nextLine();
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer or double !!!");
                input.nextLine();
            }  
        }

        // End of register
        System.out.println("Admin registered successfully !!!");
    }


    @Override
    public String toCSV() {
        return type + "," + id + "," + salary + "," + super.toCSV() + "," + status;
    }

    // Setters
    public void setSalary(double inputSalary) {
        this.salary = inputSalary;
    }


    public static void main(String[] args) {
        Admin newAdmin = new Admin();
        Scanner input = new Scanner(System.in);
        newAdmin.register(input);
        WriteToFile.writer("./Data/Admin.csv", newAdmin.userMap);
    }
}

