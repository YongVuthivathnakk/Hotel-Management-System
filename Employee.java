import java.time.LocalDate;
import javax.management.relation.Role;

public class Employee extends User {
    private int id;
    private String role;
    private double salary;
    private LocalDate hireDate;
    private String password;
    private static int totalId = 0;


    public Employee(String firstName, String lastName, String email, String phoneNumber, String role, double salary, LocalDate hireDate, String employeePassword) {
        super(firstName, lastName, email, phoneNumber);
        this.id = ++totalId;
        this.role = role;
        this.salary = salary;
        this.hireDate = hireDate;
        this.password = password;
    }



    // Getters

        // ID
  
    
    // Email
    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return super.getEmail();
    }

    @Override
    public String getFirstName() {
        // TODO Auto-generated method stub
        return super.getFirstName();
    }



    @Override
    public String getLastName() {
        // TODO Auto-generated method stub
        return super.getLastName();
    }



    @Override
    public String getPhoneNumber() {
        // TODO Auto-generated method stub
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
    public LocalDate getHireDate() {
        return hireDate;
    }
    // Method



    public static void main(String[] args) {
        User newEmployee = new Employee("nakk", "Nakk", "ambatukam", "12345", "admin", 100000, null, "12345");
        System.out.println(((Employee)newEmployee).getRole());
    }

}
