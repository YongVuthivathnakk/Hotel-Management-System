package UserFolder;

import java.util.InputMismatchException;
import java.util.Scanner;

import TimeGenerator.Time;

public class Employee extends User{
    public String type = "Employee";
    public int id;
    private static int count = 0;
    private String role;
    private double salary;
    private String hireDate = Time.currentDate();
    private String password;

    public Employee() {
        super();
    }

    public Employee(String firstName, String lastName, String userName, String gender, int age ,String email, String phoneNumber, String password, String role, double salary, String hireDate) {
        super(firstName, lastName, userName, gender, age, email, phoneNumber, password);
        this.id = count++;
        this.role = role;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getters
    
    // Email
    @Override
    public String getEmail() {
        return super.getEmail();
    }


    @Override
    public String getFirstName() {
        return super.getFirstName();
    }



    @Override
    public String getLastName() {
        return super.getLastName();
    }



    @Override
    public String getPhoneNumber() {

        return super.getPhoneNumber();
    }

    // ID
    public int getId() {
        return this.id;
    }

    // Role
    public String getRole() {
        return role;
    }

        // HireDate
    public String getHireDate() {
        return hireDate;
    }

    
    



    
    @Override
    public String toString() {
        return " == Employee 0" + id + " ==" + 
                "\nRole: " + role + 
                "\nHire Date: " + hireDate +
                super.toString() + "\n";
    }

    // Method
    @Override
    public void register(Scanner input) {
        System.out.println("== Register as Employee ==");
        super.register(input);

        // Enter Role
        int inputRole;
        while (true) {
            try {
                System.out.println("\n=== Choose your Role ===");
                System.out.println("1. Manager");
                System.out.println("2. Receptionist");
                System.out.println("3. Security");
                System.out.println("4. Waiter");
                System.out.println("5. Chef");
                System.out.println("6. Cleaner");
                System.out.print("Enter your Role: ");
                inputRole = input.nextInt();
                if (inputRole == 1) {
                    this.role = "Manager";
                    input.nextLine();
                    break;
                } else if (inputRole == 2) {
                    this.role = "Receptionist";
                    input.nextLine();
                    break;
                } else if (inputRole == 3) {
                    this.role = "Security";
                    input.nextLine();
                    break;
                } else if (inputRole == 4) {
                    this.role = "Waiter";
                    input.nextLine();
                    break;
                } else if (inputRole == 5) {
                    this.role = "Chef";
                    input.nextLine();
                    break;
                } else if (inputRole == 6) {
                    this.role = "Cleaner";
                    input.nextLine();
                    break;
                } else {
                    System.out.println("Please enter the correct number !!!");
                    input.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer !!!");
                input.nextLine();
            }
        }

        double salary;
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
        
    }

    @Override
    public String toCSV() {
        return type + "," + id + "," + role + "," + salary + "," + hireDate + "," + super.toCSV();
    }

}
