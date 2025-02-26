package User;
public class Employee extends User{
    private int id;
    private String role;
    private double salary;
    private String hireDate;
    private String password;

    public Employee(String firstName, String lastName, String userName, String gender, int age ,String email, String phoneNumber, String password, String role, double salary, String hireDate) {
        super(firstName, lastName, userName, gender, age, email, phoneNumber, password);
        this.id += 1;
        this.role = role;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getters
    
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
    public String getHireDate() {
        return hireDate;
    }


    // Method


}
