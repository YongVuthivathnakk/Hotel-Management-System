import java.time.LocalDate;
import javax.management.relation.Role;

public class Employee extends User {

    public Role role;
    private double salary;
    private LocalDate hireDate;
    private String employeePassword;
    private static int totalId = 0;


    public Employee(String firstName, String lastName, String email, String phoneNumber, Role role, double salary, LocalDate hireDate, String employeePassword) {
        super(firstName, lastName, email, phoneNumber);
        this.role = role;
        this.salary = salary;
        this.hireDate = hireDate;
        this.employeePassword = employeePassword;
    }



    // Getters

        // ID
    public int getEmployeeId() {
        return id;
    }

        // First Name
    public String getFirstName() {
        return firstName;
    }

        // Last Name
    public String getLastName() {
        return lastName;
    }

        // Email
    public String getEmail() {
        return email;
    }

        // Phone Number
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
        // Role
    public Role getRole() {
        return role;
    }

        // HireDate
    public LocalDate getHireDate() {
        return hireDate;
    }
    // Method

    public void getSalary(String inputPassword) {
        if(password.equals(inputPassword)) {
            System.out.println("Total salary of employee ID " + employeeId + " :" + salary);
        } else {
            System.out.println("Invalid password");
        }
    }


    public static void main(String[] args) {
        Employee newEmployee = new Employee(null, null, null, null, null, totalId, null, null)
    }

}
