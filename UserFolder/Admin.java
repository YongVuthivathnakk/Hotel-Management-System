package UserFolder;
import java.util.InputMismatchException;
import java.util.Scanner;

import Register_and_Login.Validator;

public class Admin extends User {
    private int id;
    private static int totalID = 0;
    private String password;
    private double salary;
    private String status; // OFFLINE, ONLINE
    // Scanner for input operations in methods like changePassword
    private Scanner scanner = new Scanner(System.in);


    public Admin(String firstName, String lastName, String userName, String gender, int age ,String email, String phoneNumber, String password, String status, double salary) {
        super(firstName, lastName, userName, gender, age, email, phoneNumber, password);
        this.id = ++totalID;
        this.status = status;
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
        return " == Admin " + id + " ==" +
        "\nStatus=" + status + 
        super.toString();
    }


    
    @Override
    public void register() {
        Scanner input = new Scanner(System.in);
        int tempStatus;
        double salary;

        System.out.println("== Register as Admin ==");

        super.register();



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
                    this.salary = salary;
                    break;
                }
                break;
            } catch (InputMismatchException e) {
               System.out.println("Please enter either interger or double number!");
               input.nextLine();
            }
        }


        input.close();

    }

    // Setters
    public void setSalary(double inputSalary) {
        this.salary = inputSalary;
    }
    


public static void main(String[] args) {
    User newAdmin = new Admin(null, null, null, null, 0, null, null, null, null, 0);
    newAdmin.register();
    System.out.println(newAdmin.toString());
}

}

